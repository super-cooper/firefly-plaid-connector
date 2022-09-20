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
 * It is possible for an Asset Report to be returned with missing account owner information. In such cases, the Asset Report will contain warning data in the response, indicating why obtaining the owner information failed.
 *
 * @param warningType The warning type, which will always be `ASSET_REPORT_WARNING`
 * @param warningCode The warning code identifies a specific kind of warning. Currently, the only possible warning code is `OWNERS_UNAVAILABLE`, which indicates that account-owner information is not available.
 * @param cause
 */

data class Warning(

    /* The warning type, which will always be `ASSET_REPORT_WARNING` */
    @field:JsonProperty("warning_type")
    val warningType: kotlin.String,

    /* The warning code identifies a specific kind of warning. Currently, the only possible warning code is `OWNERS_UNAVAILABLE`, which indicates that account-owner information is not available. */
    @field:JsonProperty("warning_code")
    val warningCode: Warning.WarningCode,

    @field:JsonProperty("cause")
    val cause: Cause

) : kotlin.collections.HashMap<String, kotlin.Any>() {

    /**
     * The warning code identifies a specific kind of warning. Currently, the only possible warning code is `OWNERS_UNAVAILABLE`, which indicates that account-owner information is not available.
     *
     * Values: oWNERSUNAVAILABLE
     */
    enum class WarningCode(val value: kotlin.String) {
        @JsonProperty(value = "OWNERS_UNAVAILABLE")
        oWNERSUNAVAILABLE("OWNERS_UNAVAILABLE");
    }
}
