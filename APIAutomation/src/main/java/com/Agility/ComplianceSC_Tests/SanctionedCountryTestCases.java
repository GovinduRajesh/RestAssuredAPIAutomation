package com.Agility.ComplianceSC_Tests;

import org.testng.annotations.Test;

import com.Agility.ComplianceSC_RequestPOJO.AuthenticateData;
import com.Agility.ComplianceSC_RequestPOJO.CreateSCRequest;
import com.Agility.ComplianceSC_ResponsePOJO.AauthenticateResponsePOJO;
import com.Agility.ComplianceSC_ResponsePOJO.SCRequestResponse;
import com.Agility.ComplianceSC_ResponsePOJO_Ext.Data;
import com.Agility.ComplianceSC_ResponsePOJO_Ext.GetRequestByIDResponse;
import com.Agility.ComplianceSC_businessLayer.SC_API_Logics;
import com.Agility.dataProvider.DataProviderClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;

public class SanctionedCountryTestCases {
	
	String JWTtoken;
	int RequestId;
	String payloadforPWS;
	
	
	GetRequestByIDResponse SavedSecA;
	GetRequestByIDResponse SecACompleted;
	Data completeSecA;
	SC_API_Logics BusinessLogic = new SC_API_Logics();
	ObjectMapper objMap = new ObjectMapper();
	
	@Test(priority = 1, enabled = true, dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void SC_CoordinatorAuthentication(AuthenticateData data) {
		
		Response response = BusinessLogic.AuthenticateAPI(data);

		AauthenticateResponsePOJO resp = response.as(AauthenticateResponsePOJO.class);

		JWTtoken = resp.getData().getJwToken();

		System.out.println("JwToken is "+resp.getData().getJwToken());
	}
	
	@Test(priority = 2, enabled = true, dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void SC_CreateSC_Request(CreateSCRequest data) {
		
		Response response = BusinessLogic.CreateSC_Request(data, JWTtoken);

		SCRequestResponse SCR = response.as(SCRequestResponse.class);

		RequestId = SCR.getData();
		
		System.out.println("======== Create Request Response is==============");

		System.out.println(SCR.toString());

		System.out.println("Request id is " + RequestId);
		
	}
	
	@Test(priority = 3, enabled = true)
	public void SaveSectionA() {
		
		Response RequestDetails = BusinessLogic.Get_SC_RequestDetails(JWTtoken, RequestId);
		
		GetRequestByIDResponse SavedSecAResponse = RequestDetails.as(GetRequestByIDResponse.class);

		String Conid = SavedSecAResponse.getData().getConsignmentId();
		Integer MOT = SavedSecAResponse.getData().getModeOfTransportId();

		Response response = BusinessLogic.SaveSecA(JWTtoken, RequestId, Conid, MOT);

		System.out.println("======== Save SectionA Request Response is==============");
		SavedSecA = response.as(GetRequestByIDResponse.class);
	}
	
	@Test(priority = 4, enabled = true)
	public void CompleteSectionA() throws JsonProcessingException {
		
		
		completeSecA = SavedSecA.getData();
		completeSecA.getSanCountryReqQuestionnaireSecA().setStatusId(6);
		System.out.println("=== new == \n"+completeSecA.toString());
		
		String payload = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(completeSecA);
		

		Response response = BusinessLogic.CompleteSecA(payload, JWTtoken);
		System.out.println("======== Complete Section A Response is==============");
		response.jsonPath().prettyPrint();
		
		
		SecACompleted = response.as(GetRequestByIDResponse.class);
		
		/*SecACompleted.getData().setStatusId(2);
		
		 payloadforPWS = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(SecACompleted.getData());*/
		//System.out.println(payloadforPWS);
	
	}
	
	@Test(priority = 5, enabled = true)
	public void SendToScreener() throws JsonProcessingException {
		
		SecACompleted.getData().setStatusId(2);
		payloadforPWS = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(SecACompleted.getData());
		
		Response response = BusinessLogic.CompleteSecA(payloadforPWS, JWTtoken);
		System.out.println("======== Sent to Screener Response is==============");
		response.prettyPrint();
		
		
	}
	

}
