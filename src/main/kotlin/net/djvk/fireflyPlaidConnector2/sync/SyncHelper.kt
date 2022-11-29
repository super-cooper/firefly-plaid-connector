package net.djvk.fireflyPlaidConnector2.sync

import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.http.*
import net.djvk.fireflyPlaidConnector2.api.firefly.apis.CategoriesApi
import net.djvk.fireflyPlaidConnector2.api.firefly.apis.FireflyTransactionId
import net.djvk.fireflyPlaidConnector2.api.firefly.apis.TransactionsApi
import net.djvk.fireflyPlaidConnector2.api.firefly.models.FireflyApiError
import net.djvk.fireflyPlaidConnector2.api.plaid.apis.PlaidApi
import net.djvk.fireflyPlaidConnector2.api.plaid.infrastructure.clientIdHeader
import net.djvk.fireflyPlaidConnector2.api.plaid.infrastructure.secretHeader
import net.djvk.fireflyPlaidConnector2.config.properties.AccountConfigs
import net.djvk.fireflyPlaidConnector2.transactions.FireflyAccountId
import net.djvk.fireflyPlaidConnector2.transactions.FireflyTransactionDto
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

typealias PlaidAccessToken = String
typealias PlaidAccountId = String

@Component
class SyncHelper(
    private val plaidAccountsConfig: AccountConfigs,

    @Value("\${fireflyPlaidConnector2.firefly.personalAccessToken}")
    private val fireflyAccessToken: String,
    private val fireflyTxApi: TransactionsApi,

    private val plaidApi: PlaidApi,
    @Value("\${fireflyPlaidConnector2.plaid.clientId}")
    private val plaidClientId: String,
    @Value("\${fireflyPlaidConnector2.plaid.secret}")
    private val plaidSecret: String,
) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    fun setApiCreds() {
        // Spring components are singletons by default, so this should set these credentials for any other
        //  component that also uses the plaidApi component
        plaidApi.setApiKey(plaidClientId, clientIdHeader)
        plaidApi.setApiKey(plaidSecret, secretHeader)
        fireflyTxApi.setAccessToken(fireflyAccessToken)
    }

    fun getAllPlaidAccessTokenAccountIdSets():
            Pair<Map<PlaidAccountId, FireflyAccountId>, Sequence<Pair<PlaidAccessToken, List<PlaidAccountId>>>> {
        val accountMap = plaidAccountsConfig.accounts.associate { Pair(it.plaidAccountId, it.fireflyAccountId) }
        logger.trace("Read config mapping data for ${accountMap.size} Firefly accounts")
        val accountsByAccessToken = plaidAccountsConfig.accounts.groupBy { it.plaidItemAccessToken }
        logger.trace("Read config mapping data for ${accountsByAccessToken.size} Plaid access tokens")

        return Pair(accountMap, sequence {
            for ((accessToken, accountConfigs) in accountsByAccessToken) {
                val accountIds = accountConfigs.map { it.plaidAccountId }
                yield(Pair(accessToken, accountIds))
            }
        })
    }

    suspend fun optimisticInsertBatchIntoFirefly(fireflyTxs: List<FireflyTransactionDto>) {
        logger.trace("Optimistic insert of ${fireflyTxs.size} txs into Firefly")
        for (fireflyTx in fireflyTxs) {
            try {
                insertIntoFirefly(fireflyTx)
            } catch (cre: ClientRequestException) {
                if (cre.response.status == HttpStatusCode.UnprocessableEntity) {
                    val error = cre.response.body<FireflyApiError>()
                    if (error.message.lowercase().contains("duplicate of transaction")) {
                        logger.info("Skipped transaction ${fireflyTx.tx.externalId} that Firefly identified as a duplicate")
                    } else {
                        logger.error("Firefly API error $error")
                        throw cre
                    }
                } else {
                    throw cre
                }
            }
        }
    }

    /**
     * The only difference between this and [optimisticInsertBatchIntoFirefly] is that this doesn't expect or tolerate
     *  duplicate errors.
     */
    suspend fun pessimisticInsertBatchIntoFirefly(fireflyTxs: List<FireflyTransactionDto>) {
        logger.trace("Pessimistic insert of ${fireflyTxs.size} txs into Firefly")
        for (fireflyTx in fireflyTxs) {
            insertIntoFirefly(fireflyTx)
        }
    }

    suspend fun insertIntoFirefly(fireflyTx: FireflyTransactionDto) {
        if (fireflyTx.tx.amount.toDouble() == 0.0) {
            logger.info("Skipped transaction ${fireflyTx.tx.externalId} with amount 0.0")
            return
        }
        fireflyTxApi.storeTransaction(fireflyTx.toTransactionStore())
    }

    suspend fun updateBatchInFirefly(fireflyTxs: List<FireflyTransactionDto>) {
        for (fireflyTx in fireflyTxs) {
            fireflyTxApi.updateTransaction(
                fireflyTx.id
                    ?: throw IllegalArgumentException("Can't update Firefly transaction without id: $fireflyTx"),
                fireflyTx.toTransactionUpdate(),
            )
        }
    }

    suspend fun deleteBatchInFirefly(fireflyTxIds: List<FireflyTransactionId>) {
        logger.trace("Delete batch of ${fireflyTxIds.size} txs in Firefly")
        for (fireflyTxId in fireflyTxIds) {
            fireflyTxApi.deleteTransaction(fireflyTxId)
        }
    }
}