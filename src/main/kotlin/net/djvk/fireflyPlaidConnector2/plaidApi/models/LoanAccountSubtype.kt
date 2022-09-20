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
 * Valid account subtypes for loan accounts. For a list containing descriptions of each subtype, see [Account schemas](https://plaid.com/docs/api/accounts/#StandaloneAccountType-loan).
 *
 * Values: auto,business,commercial,construction,consumer,homeEquity,loan,mortgage,lineOfCredit,student,other,all
 */

enum class LoanAccountSubtype(val value: kotlin.String) {

    @JsonProperty(value = "auto")
    auto("auto"),

    @JsonProperty(value = "business")
    business("business"),

    @JsonProperty(value = "commercial")
    commercial("commercial"),

    @JsonProperty(value = "construction")
    construction("construction"),

    @JsonProperty(value = "consumer")
    consumer("consumer"),

    @JsonProperty(value = "home equity")
    homeEquity("home equity"),

    @JsonProperty(value = "loan")
    loan("loan"),

    @JsonProperty(value = "mortgage")
    mortgage("mortgage"),

    @JsonProperty(value = "line of credit")
    lineOfCredit("line of credit"),

    @JsonProperty(value = "student")
    student("student"),

    @JsonProperty(value = "other")
    other("other"),

    @JsonProperty(value = "all")
    all("all");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is LoanAccountSubtype) "$data" else null

        /**
         * Returns a valid [LoanAccountSubtype] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): LoanAccountSubtype? = data?.let {
            val normalizedData = "$it".lowercase()
            values().firstOrNull { value ->
                it == value || normalizedData == "$value".lowercase()
            }
        }
    }
}
