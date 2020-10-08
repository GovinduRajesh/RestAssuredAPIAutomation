package com.Agility.RateCloud_ResponsePOJO;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Transhipment {

	
	
	@JsonProperty("portIsoCode")
	private String portIsoCode;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("portIsoCode")
	public String getPortIsoCode() {
	return portIsoCode;
	}

	@JsonProperty("portIsoCode")
	public void setPortIsoCode(String portIsoCode) {
	this.portIsoCode = portIsoCode;
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
		return "Transhipment [portIsoCode=" + portIsoCode + ", additionalProperties=" + additionalProperties + "]";
	}

	
	
}
