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
 * An optional object to filter `/accounts/balance/get` results.
 *
 * @param accountIds A list of `account_ids` to retrieve for the Item. The default value is `null`.  Note: An error will be returned if a provided `account_id` is not associated with the Item.
 * @param minLastUpdatedDatetime Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDTHH:mm:ssZ`) indicating the oldest acceptable balance when making a request to `/accounts/balance/get`.  If the balance that is pulled for `ins_128026` (Capital One) is older than the given timestamp, an `INVALID_REQUEST` error with the code of `LAST_UPDATED_DATETIME_OUT_OF_RANGE` will be returned with the most recent timestamp for the requested account contained in the response.  This field is only used when the institution is `ins_128026` (Capital One), in which case a value must be provided or an `INVALID_REQUEST` error with the code of `INVALID_FIELD` will be returned. For all other institutions, this field is ignored.
 */

data class AccountsBalanceGetRequestOptions(

    /* A list of `account_ids` to retrieve for the Item. The default value is `null`.  Note: An error will be returned if a provided `account_id` is not associated with the Item. */
    @field:JsonProperty("account_ids")
    val accountIds: kotlin.collections.List<kotlin.String>? = null,

    /* Timestamp in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (`YYYY-MM-DDTHH:mm:ssZ`) indicating the oldest acceptable balance when making a request to `/accounts/balance/get`.  If the balance that is pulled for `ins_128026` (Capital One) is older than the given timestamp, an `INVALID_REQUEST` error with the code of `LAST_UPDATED_DATETIME_OUT_OF_RANGE` will be returned with the most recent timestamp for the requested account contained in the response.  This field is only used when the institution is `ins_128026` (Capital One), in which case a value must be provided or an `INVALID_REQUEST` error with the code of `INVALID_FIELD` will be returned. For all other institutions, this field is ignored. */
    @field:JsonProperty("min_last_updated_datetime")
    val minLastUpdatedDatetime: java.time.OffsetDateTime? = null

)
