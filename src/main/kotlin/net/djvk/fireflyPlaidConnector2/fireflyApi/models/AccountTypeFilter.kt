/**
 * Firefly III API v1.5.6
 *
 * This is the documentation of the Firefly III API. You can find accompanying documentation on the website of Firefly III itself (see below). Please report any bugs or issues. You may use the \"Authorize\" button to try the API below. This file was last generated on 2022-04-04T03:54:41+00:00
 *
 * The version of the OpenAPI document: 1.5.6
 * Contact: james@firefly-iii.org
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

package net.djvk.fireflyPlaidConnector2.fireflyApi.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 *
 * Values: all,asset,cash,expense,revenue,special,hidden,liability,liabilities,defaultAccount,cashAccount,assetAccount,expenseAccount,revenueAccount,initialBalanceAccount,beneficiaryAccount,importAccount,reconciliationAccount,loan,debt,mortgage
 */

enum class AccountTypeFilter(val value: kotlin.String) {

    @JsonProperty(value = "all")
    all("all"),

    @JsonProperty(value = "asset")
    asset("asset"),

    @JsonProperty(value = "cash")
    cash("cash"),

    @JsonProperty(value = "expense")
    expense("expense"),

    @JsonProperty(value = "revenue")
    revenue("revenue"),

    @JsonProperty(value = "special")
    special("special"),

    @JsonProperty(value = "hidden")
    hidden("hidden"),

    @JsonProperty(value = "liability")
    liability("liability"),

    @JsonProperty(value = "liabilities")
    liabilities("liabilities"),

    @JsonProperty(value = "Default account")
    defaultAccount("Default account"),

    @JsonProperty(value = "Cash account")
    cashAccount("Cash account"),

    @JsonProperty(value = "Asset account")
    assetAccount("Asset account"),

    @JsonProperty(value = "Expense account")
    expenseAccount("Expense account"),

    @JsonProperty(value = "Revenue account")
    revenueAccount("Revenue account"),

    @JsonProperty(value = "Initial balance account")
    initialBalanceAccount("Initial balance account"),

    @JsonProperty(value = "Beneficiary account")
    beneficiaryAccount("Beneficiary account"),

    @JsonProperty(value = "Import account")
    importAccount("Import account"),

    @JsonProperty(value = "Reconciliation account")
    reconciliationAccount("Reconciliation account"),

    @JsonProperty(value = "Loan")
    loan("Loan"),

    @JsonProperty(value = "Debt")
    debt("Debt"),

    @JsonProperty(value = "Mortgage")
    mortgage("Mortgage");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AccountTypeFilter) "$data" else null

        /**
         * Returns a valid [AccountTypeFilter] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AccountTypeFilter? = data?.let {
            val normalizedData = "$it".lowercase()
            values().firstOrNull { value ->
                it == value || normalizedData == "$value".lowercase()
            }
        }
    }
}
