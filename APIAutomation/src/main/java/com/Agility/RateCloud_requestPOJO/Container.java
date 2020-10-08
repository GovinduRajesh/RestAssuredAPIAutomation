
package com.Agility.RateCloud_requestPOJO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Isocode",
    "Quantity"
})
public class Container {

    @JsonProperty("Isocode")
    private String isocode;
    @JsonProperty("Quantity")
    private String quantity;

    @JsonProperty("Isocode")
    public String getIsocode() {
        return isocode;
    }

    @JsonProperty("Isocode")
    public void setIsocode(String isocode) {
        this.isocode = isocode;
    }

    @JsonProperty("Quantity")
    public String getQuantity() {
        return quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

   /* @Override
    public String toString() {
        return new ToStringBuilder(this).append("isocode", isocode).append("quantity", quantity).toString();
    }
*/
}
