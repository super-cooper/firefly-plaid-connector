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
 * Object containing fraud risk data for a set of income documents
 *
 * @param accountId ID of the payroll provider account.
 * @param singleDocumentRiskSignals Array of document metadata and associated risk signals per document
 * @param multiDocumentRiskSignals Array of risk signals computed from a set of uploaded documents and the associated documents' metadata
 */

data class DocumentRiskSignalsObject(

    /* ID of the payroll provider account. */
    @field:JsonProperty("account_id")
    val accountId: kotlin.String?,

    /* Array of document metadata and associated risk signals per document */
    @field:JsonProperty("single_document_risk_signals")
    val singleDocumentRiskSignals: kotlin.collections.List<SingleDocumentRiskSignal>,

    /* Array of risk signals computed from a set of uploaded documents and the associated documents' metadata */
    @field:JsonProperty("multi_document_risk_signals")
    val multiDocumentRiskSignals: kotlin.collections.List<MultiDocumentRiskSignal>

) : kotlin.collections.HashMap<String, kotlin.Any>()
