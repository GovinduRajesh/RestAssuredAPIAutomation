
package com.Agility.ComplianceSC_ResponsePOJO_Ext;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reqStkDetailsId",
    "stakeholderTypeId",
    "stakeholderName",
    "street",
    "city",
    "state",
    "country",
    "postalCode",
    "requestId",
    "stakeholderId",
    "createdBy",
    "created",
    "lastModifiedBy",
    "lastModified"
})
public class StkDetail {

    @JsonProperty("reqStkDetailsId")
    private Integer reqStkDetailsId;
    @JsonProperty("stakeholderTypeId")
    private Integer stakeholderTypeId;
    @JsonProperty("stakeholderName")
    private String stakeholderName;
    @JsonProperty("street")
    private String street;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("requestId")
    private Integer requestId;
    @JsonProperty("stakeholderId")
    private Integer stakeholderId;
    @JsonProperty("createdBy")
    private Object createdBy;
    @JsonProperty("created")
    private String created;
    @JsonProperty("lastModifiedBy")
    private String lastModifiedBy;
    @JsonProperty("lastModified")
    private String lastModified;

    @JsonProperty("reqStkDetailsId")
    public Integer getReqStkDetailsId() {
        return reqStkDetailsId;
    }

    @JsonProperty("reqStkDetailsId")
    public void setReqStkDetailsId(Integer reqStkDetailsId) {
        this.reqStkDetailsId = reqStkDetailsId;
    }

    @JsonProperty("stakeholderTypeId")
    public Integer getStakeholderTypeId() {
        return stakeholderTypeId;
    }

    @JsonProperty("stakeholderTypeId")
    public void setStakeholderTypeId(Integer stakeholderTypeId) {
        this.stakeholderTypeId = stakeholderTypeId;
    }

    @JsonProperty("stakeholderName")
    public String getStakeholderName() {
        return stakeholderName;
    }

    @JsonProperty("stakeholderName")
    public void setStakeholderName(String stakeholderName) {
        this.stakeholderName = stakeholderName;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("requestId")
    public Integer getRequestId() {
        return requestId;
    }

    @JsonProperty("requestId")
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("stakeholderId")
    public Integer getStakeholderId() {
        return stakeholderId;
    }

    @JsonProperty("stakeholderId")
    public void setStakeholderId(Integer stakeholderId) {
        this.stakeholderId = stakeholderId;
    }

    @JsonProperty("createdBy")
    public Object getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("lastModifiedBy")
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    @JsonProperty("lastModifiedBy")
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @JsonProperty("lastModified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("lastModified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("reqStkDetailsId", reqStkDetailsId).append("stakeholderTypeId", stakeholderTypeId).append("stakeholderName", stakeholderName).append("street", street).append("city", city).append("state", state).append("country", country).append("postalCode", postalCode).append("requestId", requestId).append("stakeholderId", stakeholderId).append("createdBy", createdBy).append("created", created).append("lastModifiedBy", lastModifiedBy).append("lastModified", lastModified).toString();
    }

}
