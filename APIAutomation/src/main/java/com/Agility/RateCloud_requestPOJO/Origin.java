package com.Agility.RateCloud_requestPOJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Origin {
	
	@JsonProperty("Zipcode")
	private String zipcode;
	@JsonProperty("Type")
	private String type;
	@JsonProperty("State")
	private String state;
	@JsonProperty("PortIsoCode")
	private String portIsoCode;
	@JsonProperty("Place")
	private String place;
	@JsonProperty("CountryIsocode")
	private String countryIsocode;

	@JsonProperty("Zipcode")
	public String getZipcode() {
	return zipcode;
	}

	@JsonProperty("Zipcode")
	public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
	}

	@JsonProperty("Type")
	public String getType() {
	return type;
	}

	@JsonProperty("Type")
	public void setType(String type) {
	this.type = type;
	}

	@JsonProperty("State")
	public String getState() {
	return state;
	}

	@JsonProperty("State")
	public void setState(String state) {
	this.state = state;
	}

	@JsonProperty("PortIsoCode")
	public String getPortIsoCode() {
	return portIsoCode;
	}

	@JsonProperty("PortIsoCode")
	public void setPortIsoCode(String portIsoCode) {
	this.portIsoCode = portIsoCode;
	}

	@JsonProperty("Place")
	public String getPlace() {
	return place;
	}

	@JsonProperty("Place")
	public void setPlace(String place) {
	this.place = place;
	}

	@JsonProperty("CountryIsocode")
	public String getCountryIsocode() {
	return countryIsocode;
	}

	@JsonProperty("CountryIsocode")
	public void setCountryIsocode(String countryIsocode) {
	this.countryIsocode = countryIsocode;
	}

	@Override
	public String toString() {
		return "Origin [zipcode=" + zipcode + ", type=" + type + ", state=" + state + ", portIsoCode=" + portIsoCode
				+ ", place=" + place + ", countryIsocode=" + countryIsocode + "]";
	}
	
	

	/*@Override
	public String toString() {
	return new ToStringBuilder(this).append("zipcode", zipcode).append("type", type).append("state", state).append("portIsoCode", portIsoCode).append("place", place).append("countryIsocode", countryIsocode).toString();
	}*/

	
	
/*	public Origin(String Zipcode,String Type,String State,String PortIsoCode,String Place,String CountryIsocode) {
		this.Zipcode= Zipcode;
		this.Type=Type;
		this.State=State;
		this.PortIsoCode=PortIsoCode;
		this.Place=Place;
		this.CountryIsocode=CountryIsocode;
	}*/
	
}
