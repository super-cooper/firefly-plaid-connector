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

package net.djvk.fireflyPlaidConnector2.api.plaid.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * PaymentInitiationRecipientListResponse defines the response schema for `/payment_initiation/recipient/list`
 *
 * @param recipients An array of payment recipients created for Payment Initiation
 * @param requestId A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
 */

data class PaymentInitiationRecipientListResponse(

    /* An array of payment recipients created for Payment Initiation */
    @field:JsonProperty("recipients")
    val recipients: kotlin.collections.List<PaymentInitiationRecipient>,

    /* A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive. */
    @field:JsonProperty("request_id")
    val requestId: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()
