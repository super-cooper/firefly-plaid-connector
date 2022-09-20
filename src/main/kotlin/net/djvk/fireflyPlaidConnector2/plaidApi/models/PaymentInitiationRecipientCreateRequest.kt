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
 * PaymentInitiationRecipientCreateRequest defines the request schema for `/payment_initiation/recipient/create`
 *
 * @param name The name of the recipient. We recommend using strings of length 18 or less and avoid special characters to ensure compatibility with all institutions.
 * @param clientId Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.
 * @param secret Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.
 * @param iban The International Bank Account Number (IBAN) for the recipient. If BACS data is not provided, an IBAN is required.
 * @param bacs
 * @param address
 */

data class PaymentInitiationRecipientCreateRequest(

    /* The name of the recipient. We recommend using strings of length 18 or less and avoid special characters to ensure compatibility with all institutions. */
    @field:JsonProperty("name")
    val name: kotlin.String,

    /* Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body. */
    @field:JsonProperty("client_id")
    val clientId: kotlin.String? = null,

    /* Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body. */
    @field:JsonProperty("secret")
    val secret: kotlin.String? = null,

    /* The International Bank Account Number (IBAN) for the recipient. If BACS data is not provided, an IBAN is required. */
    @field:JsonProperty("iban")
    val iban: kotlin.String? = null,

    @field:JsonProperty("bacs")
    val bacs: RecipientBACSNullable? = null,

    @field:JsonProperty("address")
    val address: PaymentInitiationAddress? = null

)
