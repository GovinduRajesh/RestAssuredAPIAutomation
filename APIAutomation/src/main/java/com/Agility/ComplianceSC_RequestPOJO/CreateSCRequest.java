package com.Agility.ComplianceSC_RequestPOJO;

import com.Agility.YamlData.TestData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"requestId",
"consignmentId",
"countryId",
"sancCountryId",
"sancBranchId",
"sancCountryType",
"modeOfTransportId",
"archive",
"requestedDate",
"requestedBy",
"statusId",
"comments"
})
public class CreateSCRequest extends TestData {

@JsonProperty("requestId")
private Integer requestId;
@JsonProperty("consignmentId")
private String consignmentId;
@JsonProperty("countryId")
private Integer countryId;
@JsonProperty("sancCountryId")
private Integer sancCountryId;
@JsonProperty("sancBranchId")
private Integer sancBranchId;
@JsonProperty("sancCountryType")
private String sancCountryType;
@JsonProperty("modeOfTransportId")
private Integer modeOfTransportId;
@JsonProperty("archive")
private Integer archive;
@JsonProperty("requestedDate")
private String requestedDate;
@JsonProperty("requestedBy")
private String requestedBy;
@JsonProperty("statusId")
private Integer statusId;
@JsonProperty("comments")
private String comments;

@JsonProperty("requestId")
public Integer getRequestId() {
return requestId;
}

@JsonProperty("requestId")
public void setRequestId(Integer requestId) {
this.requestId = requestId;
}

@JsonProperty("consignmentId")
public String getConsignmentId() {
return consignmentId;
}

@JsonProperty("consignmentId")
public void setConsignmentId(String consignmentId) {
this.consignmentId = consignmentId;
}

@JsonProperty("countryId")
public Integer getCountryId() {
return countryId;
}

@JsonProperty("countryId")
public void setCountryId(Integer countryId) {
this.countryId = countryId;
}

@JsonProperty("sancCountryId")
public Integer getSancCountryId() {
return sancCountryId;
}

@JsonProperty("sancCountryId")
public void setSancCountryId(Integer sancCountryId) {
this.sancCountryId = sancCountryId;
}

@JsonProperty("sancBranchId")
public Integer getSancBranchId() {
return sancBranchId;
}

@JsonProperty("sancBranchId")
public void setSancBranchId(Integer sancBranchId) {
this.sancBranchId = sancBranchId;
}

@JsonProperty("sancCountryType")
public String getSancCountryType() {
return sancCountryType;
}

@JsonProperty("sancCountryType")
public void setSancCountryType(String sancCountryType) {
this.sancCountryType = sancCountryType;
}

@JsonProperty("modeOfTransportId")
public Integer getModeOfTransportId() {
return modeOfTransportId;
}

@JsonProperty("modeOfTransportId")
public void setModeOfTransportId(Integer modeOfTransportId) {
this.modeOfTransportId = modeOfTransportId;
}

@JsonProperty("archive")
public Integer getArchive() {
return archive;
}

@JsonProperty("archive")
public void setArchive(Integer archive) {
this.archive = archive;
}

@JsonProperty("requestedDate")
public String getRequestedDate() {
return requestedDate;
}

@JsonProperty("requestedDate")
public void setRequestedDate(String requestedDate) {
this.requestedDate = requestedDate;
}

@JsonProperty("requestedBy")
public String getRequestedBy() {
return requestedBy;
}

@JsonProperty("requestedBy")
public void setRequestedBy(String requestedBy) {
this.requestedBy = requestedBy;
}

@JsonProperty("statusId")
public Integer getStatusId() {
return statusId;
}

@JsonProperty("statusId")
public void setStatusId(Integer statusId) {
this.statusId = statusId;
}

@JsonProperty("comments")
public String getComments() {
return comments;
}

@JsonProperty("comments")
public void setComments(String comments) {
this.comments = comments;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("requestId", requestId).append("consignmentId", consignmentId).append("countryId", countryId).append("sancCountryId", sancCountryId).append("sancBranchId", sancBranchId).append("sancCountryType", sancCountryType).append("modeOfTransportId", modeOfTransportId).append("archive", archive).append("requestedDate", requestedDate).append("requestedBy", requestedBy).append("statusId", statusId).append("comments", comments).toString();
}

}