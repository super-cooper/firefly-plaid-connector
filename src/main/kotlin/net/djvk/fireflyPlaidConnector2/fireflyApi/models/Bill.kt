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

package net.djvk.fireflyPlaidConnector2.fireflyApi.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 *
 * @param name
 * @param amountMin
 * @param amountMax
 * @param date
 * @param repeatFreq
 * @param createdAt
 * @param updatedAt
 * @param currencyId Use either currency_id or currency_code
 * @param currencyCode Use either currency_id or currency_code
 * @param currencySymbol
 * @param currencyDecimalPlaces
 * @param endDate The date after which this bill is no longer valid or applicable
 * @param extensionDate The date before which the bill must be renewed (or cancelled)
 * @param skip How often the bill must be skipped. 1 means a bi-monthly bill.
 * @param active If the bill is active.
 * @param order Order of the bill.
 * @param notes
 * @param nextExpectedMatch When the bill is expected to be due.
 * @param nextExpectedMatchDiff Formatted (locally) when the bill is due.
 * @param objectGroupId The group ID of the group this object is part of. NULL if no group.
 * @param objectGroupOrder The order of the group. At least 1, for the highest sorting.
 * @param objectGroupTitle The name of the group. NULL if no group.
 * @param payDates Array of future dates when the bill is expected to be paid. Autogenerated.
 * @param paidDates Array of past transactions when the bill was paid.
 */

data class Bill(

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("amount_min")
    val amountMin: kotlin.String,

    @field:JsonProperty("amount_max")
    val amountMax: kotlin.String,

    @field:JsonProperty("date")
    val date: java.time.OffsetDateTime,

    @field:JsonProperty("repeat_freq")
    val repeatFreq: BillRepeatFrequency,

    @field:JsonProperty("created_at")
    val createdAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("updated_at")
    val updatedAt: java.time.OffsetDateTime? = null,

    /* Use either currency_id or currency_code */
    @field:JsonProperty("currency_id")
    val currencyId: kotlin.String? = null,

    /* Use either currency_id or currency_code */
    @field:JsonProperty("currency_code")
    val currencyCode: kotlin.String? = null,

    @field:JsonProperty("currency_symbol")
    val currencySymbol: kotlin.String? = null,

    @field:JsonProperty("currency_decimal_places")
    val currencyDecimalPlaces: kotlin.Int? = null,

    /* The date after which this bill is no longer valid or applicable */
    @field:JsonProperty("end_date")
    val endDate: java.time.OffsetDateTime? = null,

    /* The date before which the bill must be renewed (or cancelled) */
    @field:JsonProperty("extension_date")
    val extensionDate: java.time.OffsetDateTime? = null,

    /* How often the bill must be skipped. 1 means a bi-monthly bill. */
    @field:JsonProperty("skip")
    val skip: kotlin.Int? = null,

    /* If the bill is active. */
    @field:JsonProperty("active")
    val active: kotlin.Boolean? = null,

    /* Order of the bill. */
    @field:JsonProperty("order")
    val order: kotlin.Int? = null,

    @field:JsonProperty("notes")
    val notes: kotlin.String? = null,

    /* When the bill is expected to be due. */
    @field:JsonProperty("next_expected_match")
    val nextExpectedMatch: java.time.OffsetDateTime? = null,

    /* Formatted (locally) when the bill is due. */
    @field:JsonProperty("next_expected_match_diff")
    val nextExpectedMatchDiff: kotlin.String? = null,

    /* The group ID of the group this object is part of. NULL if no group. */
    @field:JsonProperty("object_group_id")
    val objectGroupId: kotlin.String? = null,

    /* The order of the group. At least 1, for the highest sorting. */
    @field:JsonProperty("object_group_order")
    val objectGroupOrder: kotlin.Int? = null,

    /* The name of the group. NULL if no group. */
    @field:JsonProperty("object_group_title")
    val objectGroupTitle: kotlin.String? = null,

    /* Array of future dates when the bill is expected to be paid. Autogenerated. */
    @field:JsonProperty("pay_dates")
    val payDates: kotlin.collections.List<java.time.OffsetDateTime>? = null,

    /* Array of past transactions when the bill was paid. */
    @field:JsonProperty("paid_dates")
    val paidDates: kotlin.collections.List<BillPaidDatesInner>? = null

)
