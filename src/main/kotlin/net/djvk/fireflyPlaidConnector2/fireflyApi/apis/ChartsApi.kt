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

package net.djvk.fireflyPlaidConnector2.fireflyApi.apis

import com.fasterxml.jackson.databind.ObjectMapper
import io.ktor.client.*
import io.ktor.client.engine.*
import net.djvk.fireflyPlaidConnector2.fireflyApi.infrastructure.*
import net.djvk.fireflyPlaidConnector2.fireflyApi.models.ChartDataSet

open class ChartsApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonBlock: ObjectMapper.() -> Unit = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonBlock) {

    /**
     * Dashboard chart with asset account balance information.
     * This endpoint returns the data required to generate a chart with basic asset account balance information.
     * @param start A date formatted YYYY-MM-DD.
     * @param end A date formatted YYYY-MM-DD.
     * @return kotlin.collections.List<ChartDataSet>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getChartAccountOverview(
        start: java.time.LocalDate,
        end: java.time.LocalDate
    ): HttpResponse<kotlin.collections.List<ChartDataSet>> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        start.apply { localVariableQuery["start"] = listOf("$start") }
        end.apply { localVariableQuery["end"] = listOf("$end") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/chart/account/overview",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

}