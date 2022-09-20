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
 * Even if an address has been collected, some fields may be null depending on the region's addressing system. For example: * Addresses from the United Kingdom will not include a region * Addresses from Hong Kong will not include postal code
 *
 * @param street
 * @param street2 Extra street information, like an apartment or suite number.
 * @param city
 * @param region
 * @param postalCode
 * @param country Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form.
 */

data class IdentityVerificationUserAddress(

    @field:JsonProperty("street")
    val street: kotlin.String?,

    /* Extra street information, like an apartment or suite number. */
    @field:JsonProperty("street2")
    val street2: kotlin.String?,

    @field:JsonProperty("city")
    val city: kotlin.String?,

    @field:JsonProperty("region")
    val region: kotlin.String?,

    @field:JsonProperty("postal_code")
    val postalCode: kotlin.String?,

    /* Valid, capitalized, two-letter ISO code representing the country of this object. Must be in ISO 3166-1 alpha-2 form. */
    @field:JsonProperty("country")
    val country: kotlin.String

)
