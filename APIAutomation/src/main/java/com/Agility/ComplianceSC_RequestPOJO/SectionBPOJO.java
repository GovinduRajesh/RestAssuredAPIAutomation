package com.Agility.ComplianceSC_RequestPOJO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SectionBPOJO {

	@JsonProperty("requestId")
	public int getRequestId() {
		return this.requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	int requestId;

	@JsonProperty("consignmentId")
	public String getConsignmentId() {
		return this.consignmentId;
	}

	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}

	String consignmentId;

	@JsonProperty("countryId")
	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	int countryId;

	@JsonProperty("sancCountryId")
	public int getSancCountryId() {
		return this.sancCountryId;
	}

	public void setSancCountryId(int sancCountryId) {
		this.sancCountryId = sancCountryId;
	}

	int sancCountryId;

	@JsonProperty("sancBranchId")
	public int getSancBranchId() {
		return this.sancBranchId;
	}

	public void setSancBranchId(int sancBranchId) {
		this.sancBranchId = sancBranchId;
	}

	int sancBranchId;

	@JsonProperty("sancCountryType")
	public String getSancCountryType() {
		return this.sancCountryType;
	}

	public void setSancCountryType(String sancCountryType) {
		this.sancCountryType = sancCountryType;
	}

	String sancCountryType;

	@JsonProperty("modeOfTransportId")
	public int getModeOfTransportId() {
		return this.modeOfTransportId;
	}

	public void setModeOfTransportId(int modeOfTransportId) {
		this.modeOfTransportId = modeOfTransportId;
	}

	int modeOfTransportId;

	@JsonProperty("archive")
	public int getArchive() {
		return this.archive;
	}

	public void setArchive(int archive) {
		this.archive = archive;
	}

	int archive;

	@JsonProperty("requestedDate")
	public String getRequestedDate() {
		return this.requestedDate;
	}

	public void setRequestedDate(String requestedDate) {
		this.requestedDate = requestedDate;
	}

	String requestedDate;

	@JsonProperty("requestedBy")
	public String getRequestedBy() {
		return this.requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	String requestedBy;

	@JsonProperty("statusId")
	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	int statusId;

	@JsonProperty("comments")
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	String comments;

	@JsonProperty("sancCountryReqQuestionnaireSecB")
	public SancCountryReqQuestionnaireSecB getSancCountryReqQuestionnaireSecB() {
		return this.sancCountryReqQuestionnaireSecB;
	}

	public void setSancCountryReqQuestionnaireSecB(SancCountryReqQuestionnaireSecB sancCountryReqQuestionnaireSecB) {
		this.sancCountryReqQuestionnaireSecB = sancCountryReqQuestionnaireSecB;
	}

	SancCountryReqQuestionnaireSecB sancCountryReqQuestionnaireSecB;
}
