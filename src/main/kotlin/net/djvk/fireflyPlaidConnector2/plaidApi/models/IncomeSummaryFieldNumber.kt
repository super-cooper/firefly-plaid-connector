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
 * Field number for income summary
 *
 * @param `value` The value of the field.
 * @param verificationStatus
 */

data class IncomeSummaryFieldNumber(

    /* The value of the field. */
    @field:JsonProperty("value")
    val `value`: kotlin.Double,

    @field:JsonProperty("verification_status")
    val verificationStatus: VerificationStatus

) : kotlin.collections.HashMap<String, kotlin.Any>()
