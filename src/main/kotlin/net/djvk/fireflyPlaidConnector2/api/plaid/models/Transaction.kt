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

package net.djvk.fireflyPlaidConnector2.api.plaid.models

import com.fasterxml.jackson.annotation.JsonProperty
import net.djvk.fireflyPlaidConnector2.constants.Direction

/**
 * A representation of a transaction
 *
 * @param pendingTransactionId The ID of a posted transaction's associated pending transaction, where applicable.
 * @param categoryId The ID of the category to which this transaction belongs. For a full list of categories, see [`/categories/get`](https://plaid.com/docs/api/products/transactions/#categoriesget).  If the `transactions` object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights.
 * @param category A hierarchical array of the categories to which this transaction belongs. For a full list of categories, see [`/categories/get`](https://plaid.com/docs/api/products/transactions/#categoriesget).  If the `transactions` object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights.
 * @param location
 * @param paymentMeta
 * @param accountOwner The name of the account owner. This field is not typically populated and only relevant when dealing with sub-accounts.
 * @param name The merchant name or transaction description.  If the `transactions` object was returned by a Transactions endpoint such as `/transactions/get`, this field will always appear. If the `transactions` object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights.
 * @param accountId The ID of the account in which this transaction occurred.
 * @param amount The settled value of the transaction, denominated in the transactions's currency, as stated in `iso_currency_code` or `unofficial_currency_code`. Positive values when money moves out of the account; negative values when money moves in. For example, debit card purchases are positive; credit card payments, direct deposits, and refunds are negative.
 * @param isoCurrencyCode The ISO-4217 currency code of the transaction. Always `null` if `unofficial_currency_code` is non-null.
 * @param unofficialCurrencyCode The unofficial currency code associated with the transaction. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.
 * @param date For pending transactions, the date that the transaction occurred; for posted transactions, the date that the transaction posted. Both dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DD` ).
 * @param pending When `true`, identifies the transaction as pending or unsettled. Pending transaction details (name, type, amount, category ID) may change before they are settled.
 * @param transactionId The unique ID of the transaction. Like all Plaid identifiers, the `transaction_id` is case sensitive.
 * @param paymentChannel The channel used to make a payment. `online:` transactions that took place online.  `in store:` transactions that were made at a physical location.  `other:` transactions that relate to banks, e.g. fees or deposits.  This field replaces the `transaction_type` field.
 * @param authorizedDate The date that the transaction was authorized. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DD` ). The `authorized_date` field uses machine learning to determine a transaction date for transactions where the `date_transacted` is not available. If the `date_transacted` field is present and not `null`, the `authorized_date` field will have the same value as the `date_transacted` field.
 * @param authorizedDatetime Date and time when a transaction was authorized in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DDTHH:mm:ssZ` ).  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00).
 * @param datetime Date and time when a transaction was posted in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DDTHH:mm:ssZ` ).  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00).
 * @param transactionCode
 * @param transactionType Please use the `payment_channel` field, `transaction_type` will be deprecated in the future.  `digital:` transactions that took place online.  `place:` transactions that were made at a physical location.  `special:` transactions that relate to banks, e.g. fees or deposits.  `unresolved:` transactions that do not fit into the other three types.
 * @param originalDescription The string returned by the financial institution to describe the transaction. For transactions returned by `/transactions/get`, this field is in beta and will be omitted unless the client is both enrolled in the closed beta program and has set `options.include_original_description` to `true`.
 * @param merchantName The merchant name, as extracted by Plaid from the `name` field.
 * @param checkNumber The check number of the transaction. This field is only populated for check transactions.
 * @param personalFinanceCategory
 */

data class Transaction(

    /* The ID of a posted transaction's associated pending transaction, where applicable. */
    @field:JsonProperty("pending_transaction_id")
    val pendingTransactionId: kotlin.String?,

    /* The ID of the category to which this transaction belongs. For a full list of categories, see [`/categories/get`](https://plaid.com/docs/api/products/transactions/#categoriesget).  If the `transactions` object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights. */
    @field:JsonProperty("category_id")
    val categoryId: kotlin.String?,

    /* A hierarchical array of the categories to which this transaction belongs. For a full list of categories, see [`/categories/get`](https://plaid.com/docs/api/products/transactions/#categoriesget).  If the `transactions` object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights. */
    @field:JsonProperty("category")
    val category: kotlin.collections.List<kotlin.String>?,

    @field:JsonProperty("location")
    val location: Location,

    @field:JsonProperty("payment_meta")
    val paymentMeta: PaymentMeta,

    /* The name of the account owner. This field is not typically populated and only relevant when dealing with sub-accounts. */
    @field:JsonProperty("account_owner")
    val accountOwner: kotlin.String?,

    /* The merchant name or transaction description.  If the `transactions` object was returned by a Transactions endpoint such as `/transactions/get`, this field will always appear. If the `transactions` object was returned by an Assets endpoint such as `/asset_report/get/` or `/asset_report/pdf/get`, this field will only appear in an Asset Report with Insights. */
    @field:JsonProperty("name")
    val name: kotlin.String,

    /* The ID of the account in which this transaction occurred. */
    @field:JsonProperty("account_id")
    val accountId: kotlin.String,

    /* The settled value of the transaction, denominated in the transactions's currency, as stated in `iso_currency_code` or `unofficial_currency_code`. Positive values when money moves out of the account; negative values when money moves in. For example, debit card purchases are positive; credit card payments, direct deposits, and refunds are negative. */
    @field:JsonProperty("amount")
    val amount: kotlin.Double,

    /* The ISO-4217 currency code of the transaction. Always `null` if `unofficial_currency_code` is non-null. */
    @field:JsonProperty("iso_currency_code")
    val isoCurrencyCode: kotlin.String?,

    /* The unofficial currency code associated with the transaction. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s. */
    @field:JsonProperty("unofficial_currency_code")
    val unofficialCurrencyCode: kotlin.String?,

    /* For pending transactions, the date that the transaction occurred; for posted transactions, the date that the transaction posted. Both dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DD` ). */
    @field:JsonProperty("date")
    val date: java.time.LocalDate,

    /* When `true`, identifies the transaction as pending or unsettled. Pending transaction details (name, type, amount, category ID) may change before they are settled. */
    @field:JsonProperty("pending")
    val pending: kotlin.Boolean,

    /* The unique ID of the transaction. Like all Plaid identifiers, the `transaction_id` is case sensitive. */
    @field:JsonProperty("transaction_id")
    val transactionId: kotlin.String,

    /* The channel used to make a payment. `online:` transactions that took place online.  `in store:` transactions that were made at a physical location.  `other:` transactions that relate to banks, e.g. fees or deposits.  This field replaces the `transaction_type` field.  */
    @field:JsonProperty("payment_channel")
    val paymentChannel: PaymentChannel,

    /* The date that the transaction was authorized. Dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DD` ). The `authorized_date` field uses machine learning to determine a transaction date for transactions where the `date_transacted` is not available. If the `date_transacted` field is present and not `null`, the `authorized_date` field will have the same value as the `date_transacted` field. */
    @field:JsonProperty("authorized_date")
    val authorizedDate: java.time.LocalDate?,

    /* Date and time when a transaction was authorized in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DDTHH:mm:ssZ` ).  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00). */
    @field:JsonProperty("authorized_datetime")
    val authorizedDatetime: java.time.OffsetDateTime?,

    /* Date and time when a transaction was posted in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DDTHH:mm:ssZ` ).  This field is returned for select financial institutions and comes as provided by the institution. It may contain default time values (such as 00:00:00). */
    @field:JsonProperty("datetime")
    val datetime: java.time.OffsetDateTime?,

    @field:JsonProperty("transaction_code")
    val transactionCode: TransactionCode?,

    /* Please use the `payment_channel` field, `transaction_type` will be deprecated in the future.  `digital:` transactions that took place online.  `place:` transactions that were made at a physical location.  `special:` transactions that relate to banks, e.g. fees or deposits.  `unresolved:` transactions that do not fit into the other three types.  */
    @field:JsonProperty("transaction_type")
    @Deprecated(message = "This property is deprecated.")
    val transactionType: TransactionType? = null,

    /* The string returned by the financial institution to describe the transaction. For transactions returned by `/transactions/get`, this field is in beta and will be omitted unless the client is both enrolled in the closed beta program and has set `options.include_original_description` to `true`. */
    @field:JsonProperty("original_description")
    val originalDescription: kotlin.String? = null,

    /* The merchant name, as extracted by Plaid from the `name` field. */
    @field:JsonProperty("merchant_name")
    val merchantName: kotlin.String? = null,

    /* The check number of the transaction. This field is only populated for check transactions. */
    @field:JsonProperty("check_number")
    val checkNumber: kotlin.String? = null,

    /**
     * This is nullable in the OpenAPI spec, but [TransactionGetRequestOptions.includePersonalFinanceCategory] should
     *  always be true for this application, so I'm setting this as not null for simplicity
     */
    @field:JsonProperty("personal_finance_category")
    val personalFinanceCategory: PersonalFinanceCategory
) {
    /**
     * Please use the `payment_channel` field, `transaction_type` will be deprecated in the future.  `digital:` transactions that took place online.  `place:` transactions that were made at a physical location.  `special:` transactions that relate to banks, e.g. fees or deposits.  `unresolved:` transactions that do not fit into the other three types.
     *
     * Values: digital,place,special,unresolved
     */
    enum class TransactionType(val value: kotlin.String) {
        @JsonProperty(value = "digital")
        digital("digital"),
        @JsonProperty(value = "place")
        place("place"),
        @JsonProperty(value = "special")
        special("special"),
        @JsonProperty(value = "unresolved")
        unresolved("unresolved");
    }

    fun getDirection(): Direction {
        return if (amount > 0) {
            Direction.OUT
        } else {
            Direction.IN
        }
    }
}

