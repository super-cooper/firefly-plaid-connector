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
 * AssetReportGetRequest defines the request schema for `/asset_report/get`
 *
 * @param assetReportToken A token that can be provided to endpoints such as `/asset_report/get` or `/asset_report/pdf/get` to fetch or update an Asset Report.
 * @param clientId Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.
 * @param secret Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.
 * @param includeInsights `true` if you would like to retrieve the Asset Report with Insights, `false` otherwise. This field defaults to `false` if omitted.
 * @param fastReport `true` to fetch \"fast\" version of asset report. Defaults to false if omitted.
 */

data class AssetReportGetRequest(

    /* A token that can be provided to endpoints such as `/asset_report/get` or `/asset_report/pdf/get` to fetch or update an Asset Report. */
    @field:JsonProperty("asset_report_token")
    val assetReportToken: kotlin.String,

    /* Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body. */
    @field:JsonProperty("client_id")
    val clientId: kotlin.String? = null,

    /* Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body. */
    @field:JsonProperty("secret")
    val secret: kotlin.String? = null,

    /* `true` if you would like to retrieve the Asset Report with Insights, `false` otherwise. This field defaults to `false` if omitted. */
    @field:JsonProperty("include_insights")
    val includeInsights: kotlin.Boolean? = false,

    /* `true` to fetch \"fast\" version of asset report. Defaults to false if omitted. */
    @field:JsonProperty("fast_report")
    val fastReport: kotlin.Boolean? = false

)
