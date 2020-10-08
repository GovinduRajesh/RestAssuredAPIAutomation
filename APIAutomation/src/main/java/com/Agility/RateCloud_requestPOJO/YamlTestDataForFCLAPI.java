
package com.Agility.RateCloud_requestPOJO;

import java.util.List;

import com.Agility.YamlData.TestData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Origin",
    "Destination",
    "Containers"
})


public class YamlTestDataForFCLAPI extends TestData {

    @JsonProperty("Origin")
    private Origin origin;
    @JsonProperty("Destination")
    private Destination destination;
    @JsonProperty("Containers")
    private List<Container> containers = null;

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

    @JsonProperty("Containers")
    public List<Container> getContainers() {
        return containers;
    }

    @JsonProperty("Containers")
    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

   

}
