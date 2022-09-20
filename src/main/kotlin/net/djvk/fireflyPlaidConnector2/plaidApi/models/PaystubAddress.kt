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
 * Address on the paystub
 *
 * @param city The full city name.
 * @param country The ISO 3166-1 alpha-2 country code.
 * @param postalCode The postal code of the address.
 * @param region The region or state Example: `\"NC\"`
 * @param street The full street address.
 * @param line1 Street address line 1.
 * @param line2 Street address line 2.
 * @param stateCode The region or state Example: `\"NC\"`
 */

data class PaystubAddress(

    /* The full city name. */
    @field:JsonProperty("city")
    val city: kotlin.String? = null,

    /* The ISO 3166-1 alpha-2 country code. */
    @field:JsonProperty("country")
    val country: kotlin.String? = null,

    /* The postal code of the address. */
    @field:JsonProperty("postal_code")
    val postalCode: kotlin.String? = null,

    /* The region or state Example: `\"NC\"` */
    @field:JsonProperty("region")
    val region: kotlin.String? = null,

    /* The full street address. */
    @field:JsonProperty("street")
    val street: kotlin.String? = null,

    /* Street address line 1. */
    @field:JsonProperty("line1")
    @Deprecated(message = "This property is deprecated.")
    val line1: kotlin.String? = null,

    /* Street address line 2. */
    @field:JsonProperty("line2")
    @Deprecated(message = "This property is deprecated.")
    val line2: kotlin.String? = null,

    /* The region or state Example: `\"NC\"` */
    @field:JsonProperty("state_code")
    @Deprecated(message = "This property is deprecated.")
    val stateCode: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()
