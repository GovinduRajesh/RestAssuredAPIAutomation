package com.Agility.ComplianceSC_RequestPOJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SancCountryReqQuestionnaireSecB {

	@JsonProperty("sancCountryQustSecBId")
	public int getSancCountryQustSecBId() {
		return this.sancCountryQustSecBId;
	}

	public void setSancCountryQustSecBId(int sancCountryQustSecBId) {
		this.sancCountryQustSecBId = sancCountryQustSecBId;
	}

	int sancCountryQustSecBId;

	@JsonProperty("requestId")
	public int getRequestId() {
		return this.requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	int requestId;

	@JsonProperty("isPartiesInvolvedInTrans")
	public int getIsPartiesInvolvedInTrans() {
		return this.isPartiesInvolvedInTrans;
	}

	public void setIsPartiesInvolvedInTrans(int isPartiesInvolvedInTrans) {
		this.isPartiesInvolvedInTrans = isPartiesInvolvedInTrans;
	}

	int isPartiesInvolvedInTrans;

	@JsonProperty("isTransInvInMilitaryItems")
	public int getIsTransInvInMilitaryItems() {
		return this.isTransInvInMilitaryItems;
	}

	public void setIsTransInvInMilitaryItems(int isTransInvInMilitaryItems) {
		this.isTransInvInMilitaryItems = isTransInvInMilitaryItems;
	}

	int isTransInvInMilitaryItems;

	@JsonProperty("isComplianceCertificate")
	public int getIsComplianceCertificate() {
		return this.isComplianceCertificate;
	}

	public void setIsComplianceCertificate(int isComplianceCertificate) {
		this.isComplianceCertificate = isComplianceCertificate;
	}

	int isComplianceCertificate;

	@JsonProperty("statusId")
	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	int statusId;

}
