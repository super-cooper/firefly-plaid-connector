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
 *
 *
 * @param dateTransacted The date on which the transaction took place, in IS0 8601 format.
 * @param creditCategory
 */

data class AssetReportTransactionAllOf(

    /* The date on which the transaction took place, in IS0 8601 format. */
    @field:JsonProperty("date_transacted")
    val dateTransacted: kotlin.String? = null,

    @field:JsonProperty("credit_category")
    val creditCategory: CreditCategory? = null

)
