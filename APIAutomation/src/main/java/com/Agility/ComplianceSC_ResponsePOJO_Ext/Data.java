
package com.Agility.ComplianceSC_ResponsePOJO_Ext;

import java.util.List;
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
    "comments",
    "countryCode",
    "countryName",
    "sancCountryCode",
    "sancCountryName",
    "sancBranchLocationCode",
    "sancBranchName",
    "statusStatusDesc",
    "modeOfTransportMode",
    "sanCountryReqQuestionnaireSecA",
    "questSecB",
    "questionnaireBanks",
    "stkDetails"
})
public class Data {

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
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("countryName")
    private String countryName;
    @JsonProperty("sancCountryCode")
    private String sancCountryCode;
    @JsonProperty("sancCountryName")
    private String sancCountryName;
    @JsonProperty("sancBranchLocationCode")
    private String sancBranchLocationCode;
    @JsonProperty("sancBranchName")
    private String sancBranchName;
    @JsonProperty("statusStatusDesc")
    private String statusStatusDesc;
    @JsonProperty("modeOfTransportMode")
    private String modeOfTransportMode;
    @JsonProperty("sanCountryReqQuestionnaireSecA")
    public SanCountryReqQuestionnaireSecA sanCountryReqQuestionnaireSecA;
    @JsonProperty("questSecB")
    private QuestSecB questSecB;
    @JsonProperty("questionnaireBanks")
    private List<QuestionnaireBank> questionnaireBanks = null;
    @JsonProperty("stkDetails")
    private List<StkDetail> stkDetails = null;

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

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("countryName")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("countryName")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("sancCountryCode")
    public String getSancCountryCode() {
        return sancCountryCode;
    }

    @JsonProperty("sancCountryCode")
    public void setSancCountryCode(String sancCountryCode) {
        this.sancCountryCode = sancCountryCode;
    }

    @JsonProperty("sancCountryName")
    public String getSancCountryName() {
        return sancCountryName;
    }

    @JsonProperty("sancCountryName")
    public void setSancCountryName(String sancCountryName) {
        this.sancCountryName = sancCountryName;
    }

    @JsonProperty("sancBranchLocationCode")
    public String getSancBranchLocationCode() {
        return sancBranchLocationCode;
    }

    @JsonProperty("sancBranchLocationCode")
    public void setSancBranchLocationCode(String sancBranchLocationCode) {
        this.sancBranchLocationCode = sancBranchLocationCode;
    }

    @JsonProperty("sancBranchName")
    public String getSancBranchName() {
        return sancBranchName;
    }

    @JsonProperty("sancBranchName")
    public void setSancBranchName(String sancBranchName) {
        this.sancBranchName = sancBranchName;
    }

    @JsonProperty("statusStatusDesc")
    public String getStatusStatusDesc() {
        return statusStatusDesc;
    }

    @JsonProperty("statusStatusDesc")
    public void setStatusStatusDesc(String statusStatusDesc) {
        this.statusStatusDesc = statusStatusDesc;
    }

    @JsonProperty("modeOfTransportMode")
    public String getModeOfTransportMode() {
        return modeOfTransportMode;
    }

    @JsonProperty("modeOfTransportMode")
    public void setModeOfTransportMode(String modeOfTransportMode) {
        this.modeOfTransportMode = modeOfTransportMode;
    }

    @JsonProperty("sanCountryReqQuestionnaireSecA")
    public SanCountryReqQuestionnaireSecA getSanCountryReqQuestionnaireSecA() {
        return sanCountryReqQuestionnaireSecA;
    }

    @JsonProperty("sanCountryReqQuestionnaireSecA")
    public void setSanCountryReqQuestionnaireSecA(SanCountryReqQuestionnaireSecA sanCountryReqQuestionnaireSecA) {
        this.sanCountryReqQuestionnaireSecA = sanCountryReqQuestionnaireSecA;
    }

    @JsonProperty("questSecB")
    public QuestSecB getQuestSecB() {
        return questSecB;
    }

    @JsonProperty("questSecB")
    public void setQuestSecB(QuestSecB questSecB) {
        this.questSecB = questSecB;
    }

    @JsonProperty("questionnaireBanks")
    public List<QuestionnaireBank> getQuestionnaireBanks() {
        return questionnaireBanks;
    }

    @JsonProperty("questionnaireBanks")
    public void setQuestionnaireBanks(List<QuestionnaireBank> questionnaireBanks) {
        this.questionnaireBanks = questionnaireBanks;
    }

    @JsonProperty("stkDetails")
    public List<StkDetail> getStkDetails() {
        return stkDetails;
    }

    @JsonProperty("stkDetails")
    public void setStkDetails(List<StkDetail> stkDetails) {
        this.stkDetails = stkDetails;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("requestId", requestId).append("consignmentId", consignmentId).append("countryId", countryId).append("sancCountryId", sancCountryId).append("sancBranchId", sancBranchId).append("sancCountryType", sancCountryType).append("modeOfTransportId", modeOfTransportId).append("archive", archive).append("requestedDate", requestedDate).append("requestedBy", requestedBy).append("statusId", statusId).append("comments", comments).append("countryCode", countryCode).append("countryName", countryName).append("sancCountryCode", sancCountryCode).append("sancCountryName", sancCountryName).append("sancBranchLocationCode", sancBranchLocationCode).append("sancBranchName", sancBranchName).append("statusStatusDesc", statusStatusDesc).append("modeOfTransportMode", modeOfTransportMode).append("sanCountryReqQuestionnaireSecA", sanCountryReqQuestionnaireSecA).append("questSecB", questSecB).append("questionnaireBanks", questionnaireBanks).append("stkDetails", stkDetails).toString();
    }

}
