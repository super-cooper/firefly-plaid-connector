/**
 * Firefly III API v1.5.6
 *
 * This is the documentation of the Firefly III API. You can find accompanying documentation on the website of Firefly III itself (see below). Please report any bugs or issues. You may use the \"Authorize\" button to try the API below. This file was last generated on 2022-04-04T03:54:41+00:00
 *
 * The version of the OpenAPI document: 1.5.6
 * Contact: james@firefly-iii.org
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

package net.djvk.fireflyPlaidConnector2.api.firefly.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 *
 * @param transactions
 * @param errorIfDuplicateHash Break if the submitted transaction exists already.
 * @param applyRules Whether or not to apply rules when submitting transaction.
 * @param fireWebhooks Whether or not to fire the webhooks that are related to this event.
 * @param groupTitle Title of the transaction if it has been split in more than one piece. Empty otherwise.
 */

data class TransactionStore(

    @field:JsonProperty("transactions")
    val transactions: kotlin.collections.List<TransactionSplitStore>,

    /* Break if the submitted transaction exists already. */
    @field:JsonProperty("error_if_duplicate_hash")
    val errorIfDuplicateHash: kotlin.Boolean? = null,

    /* Whether or not to apply rules when submitting transaction. */
    @field:JsonProperty("apply_rules")
    val applyRules: kotlin.Boolean? = null,

    /* Whether or not to fire the webhooks that are related to this event. */
    @field:JsonProperty("fire_webhooks")
    val fireWebhooks: kotlin.Boolean? = true,

    /* Title of the transaction if it has been split in more than one piece. Empty otherwise. */
    @field:JsonProperty("group_title")
    val groupTitle: kotlin.String? = null

)
