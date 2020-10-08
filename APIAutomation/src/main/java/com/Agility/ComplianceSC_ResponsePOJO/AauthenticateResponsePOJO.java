package com.Agility.ComplianceSC_ResponsePOJO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"succeeded",
"message",
"errors",
"data"
})
public class AauthenticateResponsePOJO {

@JsonProperty("succeeded")
private Boolean succeeded;
@JsonProperty("message")
private String message;
@JsonProperty("errors")
private Object errors;
@JsonProperty("data")
private Data data;

@JsonProperty("succeeded")
public Boolean getSucceeded() {
return succeeded;
}

@JsonProperty("succeeded")
public void setSucceeded(Boolean succeeded) {
this.succeeded = succeeded;
}

@JsonProperty("message")
public String getMessage() {
return message;
}

@JsonProperty("message")
public void setMessage(String message) {
this.message = message;
}

@JsonProperty("errors")
public Object getErrors() {
return errors;
}

@JsonProperty("errors")
public void setErrors(Object errors) {
this.errors = errors;
}

@JsonProperty("data")
public Data getData() {
return data;
}

@JsonProperty("data")
public void setData(Data data) {
this.data = data;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("succeeded", succeeded).append("message", message).append("errors", errors).append("data", data).toString();
}

}