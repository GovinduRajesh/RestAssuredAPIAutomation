
package com.Agility.ComplianceSC_ResponsePOJO_Ext;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sancCountryQustSecBId",
    "requestId",
    "isPartiesInvolvedInTrans",
    "isTransInvInMilitaryItems",
    "isComplianceCertificate",
    "statusId",
    "statusStatusDesc"
})
public class QuestSecB {

    @JsonProperty("sancCountryQustSecBId")
    private Integer sancCountryQustSecBId;
    @JsonProperty("requestId")
    private Integer requestId;
    @JsonProperty("isPartiesInvolvedInTrans")
    private Integer isPartiesInvolvedInTrans;
    @JsonProperty("isTransInvInMilitaryItems")
    private Integer isTransInvInMilitaryItems;
    @JsonProperty("isComplianceCertificate")
    private Integer isComplianceCertificate;
    @JsonProperty("statusId")
    private Integer statusId;
    @JsonProperty("statusStatusDesc")
    private String statusStatusDesc;

    @JsonProperty("sancCountryQustSecBId")
    public Integer getSancCountryQustSecBId() {
        return sancCountryQustSecBId;
    }

    @JsonProperty("sancCountryQustSecBId")
    public void setSancCountryQustSecBId(Integer sancCountryQustSecBId) {
        this.sancCountryQustSecBId = sancCountryQustSecBId;
    }

    @JsonProperty("requestId")
    public Integer getRequestId() {
        return requestId;
    }

    @JsonProperty("requestId")
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("isPartiesInvolvedInTrans")
    public Integer getIsPartiesInvolvedInTrans() {
        return isPartiesInvolvedInTrans;
    }

    @JsonProperty("isPartiesInvolvedInTrans")
    public void setIsPartiesInvolvedInTrans(Integer isPartiesInvolvedInTrans) {
        this.isPartiesInvolvedInTrans = isPartiesInvolvedInTrans;
    }

    @JsonProperty("isTransInvInMilitaryItems")
    public Integer getIsTransInvInMilitaryItems() {
        return isTransInvInMilitaryItems;
    }

    @JsonProperty("isTransInvInMilitaryItems")
    public void setIsTransInvInMilitaryItems(Integer isTransInvInMilitaryItems) {
        this.isTransInvInMilitaryItems = isTransInvInMilitaryItems;
    }

    @JsonProperty("isComplianceCertificate")
    public Integer getIsComplianceCertificate() {
        return isComplianceCertificate;
    }

    @JsonProperty("isComplianceCertificate")
    public void setIsComplianceCertificate(Integer isComplianceCertificate) {
        this.isComplianceCertificate = isComplianceCertificate;
    }

    @JsonProperty("statusId")
    public Integer getStatusId() {
        return statusId;
    }

    @JsonProperty("statusId")
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @JsonProperty("statusStatusDesc")
    public String getStatusStatusDesc() {
        return statusStatusDesc;
    }

    @JsonProperty("statusStatusDesc")
    public void setStatusStatusDesc(String statusStatusDesc) {
        this.statusStatusDesc = statusStatusDesc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sancCountryQustSecBId", sancCountryQustSecBId).append("requestId", requestId).append("isPartiesInvolvedInTrans", isPartiesInvolvedInTrans).append("isTransInvInMilitaryItems", isTransInvInMilitaryItems).append("isComplianceCertificate", isComplianceCertificate).append("statusId", statusId).append("statusStatusDesc", statusStatusDesc).toString();
    }

}
