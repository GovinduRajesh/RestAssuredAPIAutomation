package com.Agility.ComplianceSC_ResponsePOJO;

public class SCRequestResponse {
	
	

	String succeeded;
	String message;
	String errors;
	int data;
	
	public String getSucceeded() {
		return succeeded;
	}
	public void setSucceeded(String succeeded) {
		this.succeeded = succeeded;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "SCRequestResponse [succeeded=" + succeeded + ", message=" + message + ", errors=" + errors + ", data="
				+ data + "]";
	}
	

}
