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
import net.djvk.fireflyPlaidConnector2.fireflyApi.models.AvailableBudgetArray
import net.djvk.fireflyPlaidConnector2.fireflyApi.models.AvailableBudgetSingle
import net.djvk.fireflyPlaidConnector2.fireflyApi.models.AvailableBudgetStore
import net.djvk.fireflyPlaidConnector2.fireflyApi.models.AvailableBudgetUpdate

open class AvailableBudgetsApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonBlock: ObjectMapper.() -> Unit = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonBlock) {

    /**
     * Delete an available budget.
     * Delete an available budget. Not much more to say.
     * @param id The ID of the available budget.
     * @return void
     */
    open suspend fun deleteAvailableBudget(id: kotlin.String): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.DELETE,
            "/api/v1/available_budgets/{id}".replace("{" + "id" + "}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Get a single available budget.
     * Get a single available budget, by ID.
     * @param id The ID of the available budget.
     * @return AvailableBudgetSingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getAvailableBudget(id: kotlin.String): HttpResponse<AvailableBudgetSingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/available_budgets/{id}".replace("{" + "id" + "}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * List all available budget amounts.
     * Firefly III allows users to set the amount that is available to be budgeted in so-called \&quot;available budgets\&quot;. For example, the user could have 1200,- available to be divided during the coming month. This amount is used on the /budgets page. This endpoint returns all of these amounts and the periods for which they are set.
     * @param page Page number. The default pagination is 50. (optional)
     * @param start A date formatted YYYY-MM-DD.  (optional)
     * @param end A date formatted YYYY-MM-DD.  (optional)
     * @return AvailableBudgetArray
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listAvailableBudget(
        page: kotlin.Int?,
        start: java.time.LocalDate?,
        end: java.time.LocalDate?
    ): HttpResponse<AvailableBudgetArray> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody =
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        page?.apply { localVariableQuery["page"] = listOf("$page") }
        start?.apply { localVariableQuery["start"] = listOf("$start") }
        end?.apply { localVariableQuery["end"] = listOf("$end") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v1/available_budgets",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Store a new available budget
     * Creates a new available budget for a specified period. The data required can be submitted as a JSON body or as a list of parameters.
     * @param availableBudgetStore JSON array or key&#x3D;value pairs with the necessary available budget information. See the model for the exact specifications.
     * @return AvailableBudgetSingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun storeAvailableBudget(availableBudgetStore: AvailableBudgetStore): HttpResponse<AvailableBudgetSingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody = availableBudgetStore

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/api/v1/available_budgets",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    /**
     * Update existing available budget, to change for example the date range of the amount or the amount itself.
     * Update existing available budget.
     * @param id The ID of the object.X
     * @param availableBudgetUpdate JSON array or form value with updated available budget information. See the model for the exact specifications.
     * @return AvailableBudgetSingle
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun updateAvailableBudget(
        id: kotlin.String,
        availableBudgetUpdate: AvailableBudgetUpdate
    ): HttpResponse<AvailableBudgetSingle> {

        val localVariableAuthNames = listOf<String>("firefly_iii_auth")

        val localVariableBody = availableBudgetUpdate

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.PUT,
            "/api/v1/available_budgets/{id}".replace("{" + "id" + "}", "$id"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

}