/**
 * The Plaid API
 *
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.164.8
 *
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package net.djvk.fireflyPlaidConnector2.plaidApi.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Fired when new or canceled transactions have been detected on an investment account.
 *
 * @param webhookType `INVESTMENTS_TRANSACTIONS`
 * @param webhookCode `DEFAULT_UPDATE`
 * @param itemId The `item_id` of the Item associated with this webhook, warning, or error
 * @param newInvestmentsTransactions The number of new transactions reported since the last time this webhook was fired.
 * @param canceledInvestmentsTransactions The number of canceled transactions reported since the last time this webhook was fired.
 * @param error
 */

data class InvestmentsDefaultUpdateWebhook(

    /* `INVESTMENTS_TRANSACTIONS` */
    @field:JsonProperty("webhook_type")
    val webhookType: kotlin.String,

    /* `DEFAULT_UPDATE` */
    @field:JsonProperty("webhook_code")
    val webhookCode: kotlin.String,

    /* The `item_id` of the Item associated with this webhook, warning, or error */
    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    /* The number of new transactions reported since the last time this webhook was fired. */
    @field:JsonProperty("new_investments_transactions")
    val newInvestmentsTransactions: java.math.BigDecimal,

    /* The number of canceled transactions reported since the last time this webhook was fired. */
    @field:JsonProperty("canceled_investments_transactions")
    val canceledInvestmentsTransactions: java.math.BigDecimal,

    @field:JsonProperty("error")
    val error: PlaidError? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()
