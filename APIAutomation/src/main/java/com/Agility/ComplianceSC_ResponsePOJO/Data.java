package com.Agility.ComplianceSC_ResponsePOJO;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"userName",
"email",
"roles",
"isVerified",
"jwToken",
"refreshToken"
})
public class Data {

@JsonProperty("id")
private String id;
@JsonProperty("userName")
private String userName;
@JsonProperty("email")
private String email;
@JsonProperty("roles")
private List<String> roles = null;
@JsonProperty("isVerified")
private Boolean isVerified;
@JsonProperty("jwToken")
private String jwToken;
@JsonProperty("refreshToken")
private String refreshToken;

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("userName")
public String getUserName() {
return userName;
}

@JsonProperty("userName")
public void setUserName(String userName) {
this.userName = userName;
}

@JsonProperty("email")
public String getEmail() {
return email;
}

@JsonProperty("email")
public void setEmail(String email) {
this.email = email;
}

@JsonProperty("roles")
public List<String> getRoles() {
return roles;
}

@JsonProperty("roles")
public void setRoles(List<String> roles) {
this.roles = roles;
}

@JsonProperty("isVerified")
public Boolean getIsVerified() {
return isVerified;
}

@JsonProperty("isVerified")
public void setIsVerified(Boolean isVerified) {
this.isVerified = isVerified;
}

@JsonProperty("jwToken")
public String getJwToken() {
return jwToken;
}

@JsonProperty("jwToken")
public void setJwToken(String jwToken) {
this.jwToken = jwToken;
}

@JsonProperty("refreshToken")
public String getRefreshToken() {
return refreshToken;
}

@JsonProperty("refreshToken")
public void setRefreshToken(String refreshToken) {
this.refreshToken = refreshToken;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("id", id).append("userName", userName).append("email", email).append("roles", roles).append("isVerified", isVerified).append("jwToken", jwToken).append("refreshToken", refreshToken).toString();
}

}