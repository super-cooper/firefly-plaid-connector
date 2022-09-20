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
 * User information collected outside of Link, most likely via your own onboarding process.  Each of the following identity fields are optional:  `email_address`  `phone_number`  `date_of_birth`  `name`  `address`  `id_number` Specifically, these fields are optional in that they can either be fully provided (satisfying every required field in their subschema) or omitted from the request entirely by not providing the key or value. Providing these fields via the API will result in Link skipping the data collection process for the associated user. All verification steps enabled in the associated Identity Verification Template will still be run. Verification steps will either be run immediately, or once the user completes the `accept_tos` step, depending on the value provided to the `gave_consent` field.
 *
 * @param clientUserId An identifier to help you connect this object to your internal systems. For example, your database ID corresponding to this object.
 * @param emailAddress
 * @param phoneNumber A phone number in E.164 format.
 * @param dateOfBirth A date in the format YYYY-MM-DD (RFC 3339 Section 5.6).
 * @param name
 * @param address
 * @param idNumber
 */

data class IdentityVerificationRequestUser(

    /* An identifier to help you connect this object to your internal systems. For example, your database ID corresponding to this object. */
    @field:JsonProperty("client_user_id")
    val clientUserId: kotlin.String,

    @field:JsonProperty("email_address")
    val emailAddress: kotlin.String? = null,

    /* A phone number in E.164 format. */
    @field:JsonProperty("phone_number")
    val phoneNumber: kotlin.String? = null,

    /* A date in the format YYYY-MM-DD (RFC 3339 Section 5.6). */
    @field:JsonProperty("date_of_birth")
    val dateOfBirth: java.time.LocalDate? = null,

    @field:JsonProperty("name")
    val name: UserName? = null,

    @field:JsonProperty("address")
    val address: UserAddress? = null,

    @field:JsonProperty("id_number")
    val idNumber: UserIDNumber? = null

)
