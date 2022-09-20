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
 * A sweep returned from the `/sandbox/transfer/sweep/simulate` endpoint. Can be null if there are no transfers to include in a sweep.
 *
 * @param id Identifier of the sweep.
 * @param created The datetime when the sweep occurred, in RFC 3339 format.
 * @param amount Signed decimal amount of the sweep as it appears on your sweep account ledger (e.g. \"-10.00\")  If amount is not present, the sweep was net-settled to zero and outstanding debits and credits between the sweep account and Plaid are balanced.
 * @param isoCurrencyCode The currency of the sweep, e.g. \"USD\".
 */

data class SimulatedTransferSweep(

    /* Identifier of the sweep. */
    @field:JsonProperty("id")
    val id: kotlin.String,

    /* The datetime when the sweep occurred, in RFC 3339 format. */
    @field:JsonProperty("created")
    val created: java.time.OffsetDateTime,

    /* Signed decimal amount of the sweep as it appears on your sweep account ledger (e.g. \"-10.00\")  If amount is not present, the sweep was net-settled to zero and outstanding debits and credits between the sweep account and Plaid are balanced. */
    @field:JsonProperty("amount")
    val amount: kotlin.String,

    /* The currency of the sweep, e.g. \"USD\". */
    @field:JsonProperty("iso_currency_code")
    val isoCurrencyCode: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()
