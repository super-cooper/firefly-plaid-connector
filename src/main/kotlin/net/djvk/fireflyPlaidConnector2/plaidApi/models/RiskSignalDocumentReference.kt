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
 * Object containing metadata for the document
 *
 * @param documentId An identifier of the document referenced by the document metadata.
 * @param documentName The name of the document
 */

data class RiskSignalDocumentReference(

    /* An identifier of the document referenced by the document metadata. */
    @field:JsonProperty("document_id")
    val documentId: kotlin.String? = null,

    /* The name of the document */
    @field:JsonProperty("document_name")
    val documentName: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.Any>()
