package com.Agility.RateCloud_ResponsePOJO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LCLResponse {

	
	
	@JsonProperty("internationalFreight")
	private List<InternationalFreight> internationalFreight = null;
	@JsonProperty("originCharges")
	private List<OriginCharge> originCharges = null;
	@JsonProperty("destinationCharges")
	private List<DestinationCharge> destinationCharges = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("internationalFreight")
	public List<InternationalFreight> getInternationalFreight() {
	return internationalFreight;
	}

	@JsonProperty("internationalFreight")
	public void setInternationalFreight(List<InternationalFreight> internationalFreight) {
	this.internationalFreight = internationalFreight;
	}

	@JsonProperty("originCharges")
	public List<OriginCharge> getOriginCharges() {
	return originCharges;
	}

	@JsonProperty("originCharges")
	public void setOriginCharges(List<OriginCharge> originCharges) {
	this.originCharges = originCharges;
	}

	@JsonProperty("destinationCharges")
	public List<DestinationCharge> getDestinationCharges() {
	return destinationCharges;
	}

	@JsonProperty("destinationCharges")
	public void setDestinationCharges(List<DestinationCharge> destinationCharges) {
	this.destinationCharges = destinationCharges;
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
		return "LCLResponse [internationalFreight=" + internationalFreight + ", originCharges=" + originCharges
				+ ", destinationCharges=" + destinationCharges + ", additionalProperties=" + additionalProperties + "]";
	}
	
	
	
}
