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
 * ReportToken is a representation of a token that has a `report_type` field that can be one of `assets` or `income` and a `token` field which is the associated token with the `report_type`. The `token` can be an Asset Report token or Income Report token.
 *
 * @param reportType
 * @param token The report token. It can be an asset report token or an income report token.
 */

data class ReportToken(

    @field:JsonProperty("report_type")
    val reportType: ReportType? = null,

    /* The report token. It can be an asset report token or an income report token. */
    @field:JsonProperty("token")
    val token: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()
