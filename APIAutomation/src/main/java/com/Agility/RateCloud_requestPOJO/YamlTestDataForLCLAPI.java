package com.Agility.RateCloud_requestPOJO;

import com.Agility.YamlData.TestData;
import com.fasterxml.jackson.annotation.JsonProperty;

public class YamlTestDataForLCLAPI extends TestData{
	
	@JsonProperty("Origin")
	private Origin origin;
	@JsonProperty("Destination")
	private Destination destination;

	@JsonProperty("Origin")
	public Origin getOrigin() {
	return origin;
	}

	@JsonProperty("Origin")
	public void setOrigin(Origin origin) {
	this.origin = origin;
	}

	@JsonProperty("Destination")
	public Destination getDestination() {
	return destination;
	}

	@JsonProperty("Destination")
	public void setDestination(Destination destination) {
	this.destination = destination;
	}

	@Override
	public String toString() {
		return "YamlTestDataForLCLAPI [origin=" + origin + ", destination=" + destination + "]";
	}
	
	

	/*@Override
	public String toString() {
	return new ToStringBuilder(this).append("origin", origin).append("destination", destination).toString();
	}*/

	
	/*public YamlTestDataForLCLAPI(Origin OrgData,Destination DesData) {
		this.OrgData=OrgData;
		this.DesData=DesData;		
	}*/
	
	
	
	

}
