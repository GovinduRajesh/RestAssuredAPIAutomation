package com.Agility.RateCloud_ResponsePOJO;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OriginCharge {
	
	
	@JsonProperty("chargeIdentifier")
	private Integer chargeIdentifier;
	@JsonProperty("chargeCode")
	private String chargeCode;
	@JsonProperty("chargeName")
	private String chargeName;
	@JsonProperty("effectiveDate")
	private String effectiveDate;
	@JsonProperty("expiryDate")
	private String expiryDate;
	@JsonProperty("currencyIsoCode")
	private String currencyIsoCode;
	@JsonProperty("uomCode")
	private String uomCode;
	@JsonProperty("containerSize")
	private String containerSize;
	@JsonProperty("maximum")
	private Object maximum;
	@JsonProperty("minimum")
	private Object minimum;
	@JsonProperty("unitCost")
	private Double unitCost;
	@JsonProperty("rateapplicability")
	private Object rateapplicability;
	@JsonProperty("notes")
	private String notes;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("chargeIdentifier")
	public Integer getChargeIdentifier() {
	return chargeIdentifier;
	}

	@JsonProperty("chargeIdentifier")
	public void setChargeIdentifier(Integer chargeIdentifier) {
	this.chargeIdentifier = chargeIdentifier;
	}

	@JsonProperty("chargeCode")
	public String getChargeCode() {
	return chargeCode;
	}

	@JsonProperty("chargeCode")
	public void setChargeCode(String chargeCode) {
	this.chargeCode = chargeCode;
	}

	@JsonProperty("chargeName")
	public String getChargeName() {
	return chargeName;
	}

	@JsonProperty("chargeName")
	public void setChargeName(String chargeName) {
	this.chargeName = chargeName;
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

	@JsonProperty("currencyIsoCode")
	public String getCurrencyIsoCode() {
	return currencyIsoCode;
	}

	@JsonProperty("currencyIsoCode")
	public void setCurrencyIsoCode(String currencyIsoCode) {
	this.currencyIsoCode = currencyIsoCode;
	}

	@JsonProperty("uomCode")
	public String getUomCode() {
	return uomCode;
	}

	@JsonProperty("uomCode")
	public void setUomCode(String uomCode) {
	this.uomCode = uomCode;
	}

	@JsonProperty("containerSize")
	public String getContainerSize() {
	return containerSize;
	}

	@JsonProperty("containerSize")
	public void setContainerSize(String containerSize) {
	this.containerSize = containerSize;
	}

	@JsonProperty("maximum")
	public Object getMaximum() {
	return maximum;
	}

	@JsonProperty("maximum")
	public void setMaximum(Object maximum) {
	this.maximum = maximum;
	}

	@JsonProperty("minimum")
	public Object getMinimum() {
	return minimum;
	}

	@JsonProperty("minimum")
	public void setMinimum(Object minimum) {
	this.minimum = minimum;
	}

	@JsonProperty("unitCost")
	public Double getUnitCost() {
	return unitCost;
	}

	@JsonProperty("unitCost")
	public void setUnitCost(Double unitCost) {
	this.unitCost = unitCost;
	}

	@JsonProperty("rateapplicability")
	public Object getRateapplicability() {
	return rateapplicability;
	}

	@JsonProperty("rateapplicability")
	public void setRateapplicability(Object rateapplicability) {
	this.rateapplicability = rateapplicability;
	}

	@JsonProperty("notes")
	public String getNotes() {
	return notes;
	}

	@JsonProperty("notes")
	public void setNotes(String notes) {
	this.notes = notes;
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
		return "OriginCharge [chargeIdentifier=" + chargeIdentifier + ", chargeCode=" + chargeCode + ", chargeName="
				+ chargeName + ", effectiveDate=" + effectiveDate + ", expiryDate=" + expiryDate + ", currencyIsoCode="
				+ currencyIsoCode + ", uomCode=" + uomCode + ", containerSize=" + containerSize + ", maximum=" + maximum
				+ ", minimum=" + minimum + ", unitCost=" + unitCost + ", rateapplicability=" + rateapplicability
				+ ", notes=" + notes + ", additionalProperties=" + additionalProperties + "]";
	}


}
