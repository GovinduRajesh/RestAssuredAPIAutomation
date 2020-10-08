package com.Agility.ComplianceSC_Tests;

import java.util.List;

import org.testng.annotations.Test;

import com.Agility.ComplianceSC_RequestPOJO.AuthenticateData;
import com.Agility.ComplianceSC_RequestPOJO.CreateSCRequest;
import com.Agility.ComplianceSC_ResponsePOJO.AauthenticateResponsePOJO;
import com.Agility.ComplianceSC_ResponsePOJO.SCRequestResponse;
import com.Agility.ComplianceSC_ResponsePOJO_Ext.Data;
import com.Agility.ComplianceSC_ResponsePOJO_Ext.GetRequestByIDResponse;
import com.Agility.ComplianceSC_ResponsePOJO_Ext.QuestionnaireBank;
import com.Agility.ComplianceSC_businessLayer.SC_API_Logics;
import com.Agility.dataProvider.DataProviderClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SanctionedCountryTests {

	String JWTtoken;
	int RequestId;

	String payloadforPWS;
	GetRequestByIDResponse SavedSecA;
	Data completeSecA;
	SC_API_Logics logic = new SC_API_Logics();

	@Test(priority = 1, enabled = true, dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void SC_Authenticate(AuthenticateData data) {

		Response response = logic.AuthenticateAPI(data);

		AauthenticateResponsePOJO resp = response.as(AauthenticateResponsePOJO.class);

		JWTtoken = resp.getData().getJwToken();

		System.out.println("JwToken is "+resp.getData().getJwToken());

	}

	@Test(priority = 2, enabled = true, dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void SC_CreateSC_Request(CreateSCRequest data) {

		Response response = logic.CreateSC_Request(data, JWTtoken);

		SCRequestResponse SCR = response.as(SCRequestResponse.class);

		RequestId = SCR.getData();
		
		System.out.println("======== Create Request Response is==============");

		System.out.println(SCR.toString());

		System.out.println("Request id is " + RequestId);

	}

	// @Test(priority=3)
	public void GetRequestDetails() throws JsonProcessingException {
		// Response response = logic.Get_SC_RequestDetails(JWTtoken, RequestId);

		String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJDb29yZGluYXRvciIsImp0aSI6ImNlZWE0YjI0LTM5ZGMtNDY2Yi1iYTQ3LWJhYmY1YmU1NWQwYiIsImVtYWlsIjoiY29vcmRpbmF0b3JAYWdpbGl0eS5jb20iLCJ1aWQiOiIwZWI0NTdlMy0wMGQyLTQ4YzEtYTQ0MS0yOTZkZDc5MzgyYTEiLCJpcCI6IjEwLjEzOC4xMDguMTQwIiwicm9sZXMiOiJPcENvb3JkaW5hdG9yIiwiZXhwIjoxNjAxOTI4NjI0LCJpc3MiOiJDb3JlSWRlbnRpdHkiLCJhdWQiOiJDb3JlSWRlbnRpdHlVc2VyIn0.knPuB_QMl4oaCEY3DfpMtijHYJ16ep2R60FIlyavDWs";
		Response response = logic.Get_SC_RequestDetails(token, 343);

		JsonPath JO = response.jsonPath();

		JO.prettyPrint();
		// GetRequestByIDResponse obj = response.as(GetRequestByIDResponse.class);

		/*
		 * ObjectMapper objMap = new ObjectMapper(); String payload =
		 * objMap.writerWithDefaultPrettyPrinter().writeValueAsString(JO);
		 */

		// System.out.println(JO);

	}

	@Test(priority = 3, enabled = true)
	public void SaveSecA() {

		Response Details = logic.Get_SC_RequestDetails(JWTtoken, RequestId);
		GetRequestByIDResponse SaveSecA = Details.as(GetRequestByIDResponse.class);
		String Conid = SaveSecA.getData().getConsignmentId();
		Integer MOT = SaveSecA.getData().getModeOfTransportId();

		Response response = logic.SaveSecA(JWTtoken, RequestId, Conid, MOT);

		System.out.println("======== Save SectionA Request Response is==============");
		SavedSecA = response.as(GetRequestByIDResponse.class);
		completeSecA = SavedSecA.getData();
		completeSecA.getSanCountryReqQuestionnaireSecA().setStatusId(6);

	}

	@Test(priority = 4, enabled = true)
	public void CompleteSecA() throws JsonProcessingException {

		ObjectMapper objMap = new ObjectMapper();
		String payload = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(completeSecA);
		// System.out.println(payload);

		Response response = logic.CompleteSecA(payload, JWTtoken);
		System.out.println("======== Complete Section A Response is==============");
		
		
		GetRequestByIDResponse SecACompleted = response.as(GetRequestByIDResponse.class);
		SecACompleted.getData().setStatusId(2);
		
		 payloadforPWS = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(SecACompleted.getData());
		System.out.println(payloadforPWS);
		

	}
	
	@Test(priority = 5, enabled = true)
	public void SendToScreener() {
		
		
		Response response = logic.CompleteSecA(payloadforPWS, JWTtoken);
		System.out.println("======== Sent to Screener Response is==============");
		response.prettyPrint();
		
		
	}
	
	

	public void CompleteSecA2() {

		SavedSecA.getData().setStatusId(6);

		// System.out.println(SavedSecA.getData());

		List<QuestionnaireBank> list = SavedSecA.getData().getQuestionnaireBanks();
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setCity("Rajesh");

		}

		for (int i = 0; i < 5; i++) {
			QuestionnaireBank questionnaireBank = new QuestionnaireBank();
			questionnaireBank.setRequestId(i);

			list.add(questionnaireBank);

		}
		SavedSecA.getData().setQuestionnaireBanks(list);
		System.out.println("=====================================================");

		System.out.println(SavedSecA.getData().getQuestionnaireBanks());

		System.out.println("=====================================================");

		SavedSecA.getData().getSanCountryReqQuestionnaireSecA().setCarrierId(900);

	}

}
