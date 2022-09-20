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
 * The optional address of the payment recipient.
 *
 * @param street An array of length 1-2 representing the street address where the recipient is located. Maximum of 70 characters.
 * @param city The city where the recipient is located. Maximum of 35 characters.
 * @param postalCode The postal code where the recipient is located. Maximum of 16 characters.
 * @param country The ISO 3166-1 alpha-2 country code where the recipient is located.
 */

data class PaymentInitiationAddress(

    /* An array of length 1-2 representing the street address where the recipient is located. Maximum of 70 characters. */
    @field:JsonProperty("street")
    val street: kotlin.collections.List<kotlin.String>,

    /* The city where the recipient is located. Maximum of 35 characters. */
    @field:JsonProperty("city")
    val city: kotlin.String,

    /* The postal code where the recipient is located. Maximum of 16 characters. */
    @field:JsonProperty("postal_code")
    val postalCode: kotlin.String,

    /* The ISO 3166-1 alpha-2 country code where the recipient is located. */
    @field:JsonProperty("country")
    val country: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>()
