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
 * The user's legal name, phone number, email address and address used to perform fuzzy match.
 *
 * @param legalName The user's full legal name.
 * @param phoneNumber The user's phone number, in E.164 format: +{countrycode}{number}. For example: \"+14151234567\". Phone numbers provided in other formats will be parsed on a best-effort basis.
 * @param emailAddress The user's email address.
 * @param address
 */

data class IdentityMatchUser(

    /* The user's full legal name. */
    @field:JsonProperty("legal_name")
    val legalName: kotlin.String? = null,

    /* The user's phone number, in E.164 format: +{countrycode}{number}. For example: \"+14151234567\". Phone numbers provided in other formats will be parsed on a best-effort basis. */
    @field:JsonProperty("phone_number")
    val phoneNumber: kotlin.String? = null,

    /* The user's email address. */
    @field:JsonProperty("email_address")
    val emailAddress: kotlin.String? = null,

    @field:JsonProperty("address")
    val address: AddressDataNullable? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()
