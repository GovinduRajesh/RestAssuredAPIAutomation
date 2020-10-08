package com.Agility.RateCloud_ResponsePOJO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InternationalFreight {

	@JsonProperty("identifier")
	private Integer identifier;
	@JsonProperty("carrierScacCode")
	private String carrierScacCode;
	@JsonProperty("contractUploadReference")
	private String contractUploadReference;
	@JsonProperty("contractNumber")
	private Object contractNumber;
	@JsonProperty("effectiveDate")
	private String effectiveDate;
	@JsonProperty("expiryDate")
	private String expiryDate;
	@JsonProperty("originPortIsoCode")
	private String originPortIsoCode;
	@JsonProperty("transhipment")
	private List<Transhipment> transhipment = null;
	@JsonProperty("destinationPortIsoCode")
	private String destinationPortIsoCode;
	@JsonProperty("transitTime")
	private Object transitTime;
	@JsonProperty("charge")
	private List<Object> charge = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("identifier")
	public Integer getIdentifier() {
	return identifier;
	}

	@JsonProperty("identifier")
	public void setIdentifier(Integer identifier) {
	this.identifier = identifier;
	}

	@JsonProperty("carrierScacCode")
	public String getCarrierScacCode() {
	return carrierScacCode;
	}

	@JsonProperty("carrierScacCode")
	public void setCarrierScacCode(String carrierScacCode) {
	this.carrierScacCode = carrierScacCode;
	}

	@JsonProperty("contractUploadReference")
	public String getContractUploadReference() {
	return contractUploadReference;
	}

	@JsonProperty("contractUploadReference")
	public void setContractUploadReference(String contractUploadReference) {
	this.contractUploadReference = contractUploadReference;
	}

	@JsonProperty("contractNumber")
	public Object getContractNumber() {
	return contractNumber;
	}

	@JsonProperty("contractNumber")
	public void setContractNumber(Object contractNumber) {
	this.contractNumber = contractNumber;
	}

	@JsonProperty("effectiveDate")
	public String getEffectiveDate() {
	return effectiveDate;
	}

	@JsonProperty("effectiveDate")
	public void setEffectiveDate(String effectiveDate) {
	this.effectiveDate = effectiveDate;
	}

	@JsonProperty("expiryDate")
	public String getExpiryDate() {
	return expiryDate;
	}

	@JsonProperty("expiryDate")
	public void setExpiryDate(String expiryDate) {
	this.expiryDate = expiryDate;
	}

	@JsonProperty("originPortIsoCode")
	public String getOriginPortIsoCode() {
	return originPortIsoCode;
	}

	@JsonProperty("originPortIsoCode")
	public void setOriginPortIsoCode(String originPortIsoCode) {
	this.originPortIsoCode = originPortIsoCode;
	}

	@JsonProperty("transhipment")
	public List<Transhipment> getTranshipment() {
	return transhipment;
	}

	@JsonProperty("transhipment")
	public void setTranshipment(List<Transhipment> transhipment) {
	this.transhipment = transhipment;
	}

	@JsonProperty("destinationPortIsoCode")
	public String getDestinationPortIsoCode() {
	return destinationPortIsoCode;
	}

	@JsonProperty("destinationPortIsoCode")
	public void setDestinationPortIsoCode(String destinationPortIsoCode) {
	this.destinationPortIsoCode = destinationPortIsoCode;
	}

	@JsonProperty("transitTime")
	public Object getTransitTime() {
	return transitTime;
	}

	@JsonProperty("transitTime")
	public void setTransitTime(Object transitTime) {
	this.transitTime = transitTime;
	}

	@JsonProperty("charge")
	public List<Object> getCharge() {
	return charge;
	}

	@JsonProperty("charge")
	public void setCharge(List<Object> charge) {
	this.charge = charge;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "InternationalFreight [identifier=" + identifier + ", carrierScacCode=" + carrierScacCode
				+ ", contractUploadReference=" + contractUploadReference + ", contractNumber=" + contractNumber
				+ ", effectiveDate=" + effectiveDate + ", expiryDate=" + expiryDate + ", originPortIsoCode="
				+ originPortIsoCode + ", transhipment=" + transhipment + ", destinationPortIsoCode="
				+ destinationPortIsoCode + ", transitTime=" + transitTime + ", charge=" + charge
				+ ", additionalProperties=" + additionalProperties + "]";
	}
	
	
	
}
