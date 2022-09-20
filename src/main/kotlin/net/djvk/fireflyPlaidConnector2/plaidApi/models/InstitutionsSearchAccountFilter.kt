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
 * An account filter to apply to institutions search requests
 *
 * @param loan
 * @param depository
 * @param credit
 * @param investment
 */

data class InstitutionsSearchAccountFilter(

    @field:JsonProperty("loan")
    val loan: kotlin.collections.List<AccountSubtype>? = null,

    @field:JsonProperty("depository")
    val depository: kotlin.collections.List<AccountSubtype>? = null,

    @field:JsonProperty("credit")
    val credit: kotlin.collections.List<AccountSubtype>? = null,

    @field:JsonProperty("investment")
    val investment: kotlin.collections.List<AccountSubtype>? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()
