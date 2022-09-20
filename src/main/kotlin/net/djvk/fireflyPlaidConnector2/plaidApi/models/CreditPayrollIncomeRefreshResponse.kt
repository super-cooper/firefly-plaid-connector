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
 * CreditPayrollIncomeRefreshResponse defines the response schema for `/credit/payroll_income/refresh`
 *
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
 * @param verificationRefreshStatus The verification refresh status. One of the following:  `\"USER_PRESENCE_REQUIRED\"` User presence is required to refresh an income verification. `\"SUCCESSFUL\"` The income verification refresh was successful. `\"NOT_FOUND\"` No new data was found after the income verification refresh.
 */

data class CreditPayrollIncomeRefreshResponse(

    /* A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. */
    @field:JsonProperty("request_id")
    val requestId: kotlin.String,

    /* The verification refresh status. One of the following:  `\"USER_PRESENCE_REQUIRED\"` User presence is required to refresh an income verification. `\"SUCCESSFUL\"` The income verification refresh was successful. `\"NOT_FOUND\"` No new data was found after the income verification refresh. */
    @field:JsonProperty("verification_refresh_status")
    val verificationRefreshStatus: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()
