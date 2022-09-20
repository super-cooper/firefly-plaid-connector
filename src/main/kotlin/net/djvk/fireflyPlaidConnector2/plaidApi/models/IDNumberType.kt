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
 * A globally unique and human readable ID type, specific to the country and document category. For more context on this field, see [Hybrid Input Validation](https://cognitohq.com/docs/flow/flow-hybrid-input-validation)
 *
 * Values: arDni,auDriversLicense,auPassport,brCpf,caSin,clRun,cnResidentCard,coNit,dkCpr,egNationalId,esDni,esNie,hkHkid,inPan,itCf,joCivilId,jpMyNumber,keHudumaNamba,kwCivilId,mxCurp,mxRfc,myNric,ngNin,nzDriversLicense,omCivilId,phPsn,plPesel,roCnp,saNationalId,sePin,sgNric,trTcKimlik,usSsn,usSsnLast4,zaSmartId
 */

enum class IDNumberType(val value: kotlin.String) {

    @JsonProperty(value = "ar_dni")
    arDni("ar_dni"),

    @JsonProperty(value = "au_drivers_license")
    auDriversLicense("au_drivers_license"),

    @JsonProperty(value = "au_passport")
    auPassport("au_passport"),

    @JsonProperty(value = "br_cpf")
    brCpf("br_cpf"),

    @JsonProperty(value = "ca_sin")
    caSin("ca_sin"),

    @JsonProperty(value = "cl_run")
    clRun("cl_run"),

    @JsonProperty(value = "cn_resident_card")
    cnResidentCard("cn_resident_card"),

    @JsonProperty(value = "co_nit")
    coNit("co_nit"),

    @JsonProperty(value = "dk_cpr")
    dkCpr("dk_cpr"),

    @JsonProperty(value = "eg_national_id")
    egNationalId("eg_national_id"),

    @JsonProperty(value = "es_dni")
    esDni("es_dni"),

    @JsonProperty(value = "es_nie")
    esNie("es_nie"),

    @JsonProperty(value = "hk_hkid")
    hkHkid("hk_hkid"),

    @JsonProperty(value = "in_pan")
    inPan("in_pan"),

    @JsonProperty(value = "it_cf")
    itCf("it_cf"),

    @JsonProperty(value = "jo_civil_id")
    joCivilId("jo_civil_id"),

    @JsonProperty(value = "jp_my_number")
    jpMyNumber("jp_my_number"),

    @JsonProperty(value = "ke_huduma_namba")
    keHudumaNamba("ke_huduma_namba"),

    @JsonProperty(value = "kw_civil_id")
    kwCivilId("kw_civil_id"),

    @JsonProperty(value = "mx_curp")
    mxCurp("mx_curp"),

    @JsonProperty(value = "mx_rfc")
    mxRfc("mx_rfc"),

    @JsonProperty(value = "my_nric")
    myNric("my_nric"),

    @JsonProperty(value = "ng_nin")
    ngNin("ng_nin"),

    @JsonProperty(value = "nz_drivers_license")
    nzDriversLicense("nz_drivers_license"),

    @JsonProperty(value = "om_civil_id")
    omCivilId("om_civil_id"),

    @JsonProperty(value = "ph_psn")
    phPsn("ph_psn"),

    @JsonProperty(value = "pl_pesel")
    plPesel("pl_pesel"),

    @JsonProperty(value = "ro_cnp")
    roCnp("ro_cnp"),

    @JsonProperty(value = "sa_national_id")
    saNationalId("sa_national_id"),

    @JsonProperty(value = "se_pin")
    sePin("se_pin"),

    @JsonProperty(value = "sg_nric")
    sgNric("sg_nric"),

    @JsonProperty(value = "tr_tc_kimlik")
    trTcKimlik("tr_tc_kimlik"),

    @JsonProperty(value = "us_ssn")
    usSsn("us_ssn"),

    @JsonProperty(value = "us_ssn_last_4")
    usSsnLast4("us_ssn_last_4"),

    @JsonProperty(value = "za_smart_id")
    zaSmartId("za_smart_id");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is IDNumberType) "$data" else null

        /**
         * Returns a valid [IDNumberType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): IDNumberType? = data?.let {
            val normalizedData = "$it".lowercase()
            values().firstOrNull { value ->
                it == value || normalizedData == "$value".lowercase()
            }
        }
    }
}
