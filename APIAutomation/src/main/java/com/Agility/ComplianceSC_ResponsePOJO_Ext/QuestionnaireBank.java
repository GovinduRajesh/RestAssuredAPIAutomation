
package com.Agility.ComplianceSC_ResponsePOJO_Ext;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "questionnaireBankId",
    "requestId",
    "name",
    "city",
    "countryId",
    "countryname",
    "createdBy",
    "created",
    "lastModifiedBy",
    "lastModified"
})
public class QuestionnaireBank {

    @JsonProperty("questionnaireBankId")
    private Integer questionnaireBankId;
    @JsonProperty("requestId")
    private Integer requestId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("city")
    private String city;
    @JsonProperty("countryId")
    private Integer countryId;
    @JsonProperty("countryname")
    private String countryname;
    @JsonProperty("createdBy")
    private Object createdBy;
    @JsonProperty("created")
    private String created;
    @JsonProperty("lastModifiedBy")
    private String lastModifiedBy;
    @JsonProperty("lastModified")
    private String lastModified;

    @JsonProperty("questionnaireBankId")
    public Integer getQuestionnaireBankId() {
        return questionnaireBankId;
    }

    @JsonProperty("questionnaireBankId")
    public void setQuestionnaireBankId(Integer questionnaireBankId) {
        this.questionnaireBankId = questionnaireBankId;
    }

    @JsonProperty("requestId")
    public Integer getRequestId() {
        return requestId;
    }

    @JsonProperty("requestId")
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("countryId")
    public Integer getCountryId() {
        return countryId;
    }

    @JsonProperty("countryId")
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @JsonProperty("countryname")
    public String getCountryname() {
        return countryname;
    }

    @JsonProperty("countryname")
    public void setCountryname(String countryname) {
        this.countryname = countryname;
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
        return new ToStringBuilder(this).append("questionnaireBankId", questionnaireBankId).append("requestId", requestId).append("name", name).append("city", city).append("countryId", countryId).append("countryname", countryname).append("createdBy", createdBy).append("created", created).append("lastModifiedBy", lastModifiedBy).append("lastModified", lastModified).toString();
    }

}
