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
 * Metadata specifically related to which auth methods an institution supports.
 *
 * @param instantAuth Indicates if instant auth is supported.
 * @param instantMatch Indicates if instant match is supported.
 * @param automatedMicroDeposits Indicates if automated microdeposits are supported.
 */

data class AuthSupportedMethods(

    /* Indicates if instant auth is supported. */
    @field:JsonProperty("instant_auth")
    val instantAuth: kotlin.Boolean,

    /* Indicates if instant match is supported. */
    @field:JsonProperty("instant_match")
    val instantMatch: kotlin.Boolean,

    /* Indicates if automated microdeposits are supported. */
    @field:JsonProperty("automated_micro_deposits")
    val automatedMicroDeposits: kotlin.Boolean

) : kotlin.collections.HashMap<String, kotlin.Any>()
