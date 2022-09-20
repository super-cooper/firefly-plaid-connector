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
 * CreditRelayRefreshRequest defines the request schema for `/credit/relay/refresh`
 *
 * @param relayToken The `relay_token` granting access to the report you would like to refresh.
 * @param reportType
 * @param clientId Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.
 * @param secret Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.
 * @param webhook The URL registered to receive webhooks when the report of a Relay Token has been refreshed.
 */

data class CreditRelayRefreshRequest(

    /* The `relay_token` granting access to the report you would like to refresh. */
    @field:JsonProperty("relay_token")
    val relayToken: kotlin.String,

    @field:JsonProperty("report_type")
    val reportType: ReportType,

    /* Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body. */
    @field:JsonProperty("client_id")
    val clientId: kotlin.String? = null,

    /* Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body. */
    @field:JsonProperty("secret")
    val secret: kotlin.String? = null,

    /* The URL registered to receive webhooks when the report of a Relay Token has been refreshed. */
    @field:JsonProperty("webhook")
    val webhook: kotlin.String? = null

)
