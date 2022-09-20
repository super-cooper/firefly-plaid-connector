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


/**
 * International Bank Account Number (IBAN).
 *
 */

data class NumbersIBAN(
    val value: String,
) {
    init {
        if (value.length > 34 || value.length < 15) {
            throw IllegalArgumentException(
                "Invalid length ${value.length} for IBAN, must " +
                        "be between 15 and 34."
            )
        }
    }
}
