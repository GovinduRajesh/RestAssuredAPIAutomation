package com.Agility.ComplianceSC_Tests;

import java.util.List;

import org.testng.annotations.Test;

import com.Agility.ComplianceSC_RequestPOJO.AuthenticateData;
import com.Agility.ComplianceSC_RequestPOJO.CreateSCRequest;
import com.Agility.ComplianceSC_ResponsePOJO.AauthenticateResponsePOJO;
import com.Agility.ComplianceSC_ResponsePOJO.SCRequestResponse;
import com.Agility.ComplianceSC_ResponsePOJO_Ext.GetRequestByIDResponse;
import com.Agility.ComplianceSC_ResponsePOJO_Ext.QuestionnaireBank;
import com.Agility.ComplianceSC_businessLayer.SC_API_Logics;
import com.Agility.dataProvider.DataProviderClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SanctionedCountryTests2_Copy {
	
	
	
	String JWTtoken;
	int RequestId;
	
	GetRequestByIDResponse SavedSecA;
	SC_API_Logics logic = new SC_API_Logics();
	
	
	@Test(priority=1,dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void SC_Authenticate(AuthenticateData data) {
		
		
		Response response = logic.AuthenticateAPI(data);
		
		AauthenticateResponsePOJO resp = response.as(AauthenticateResponsePOJO.class);
		
		JWTtoken = resp.getData().getJwToken();
		
		System.out.println(resp.getData().getJwToken());
		
		
		
	}
	
	@Test(priority=2,dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void SC_CreateSC_Request(CreateSCRequest data) {
		
		Response response = logic.CreateSC_Request(data, JWTtoken);
      
		SCRequestResponse SCR = response.as(SCRequestResponse.class);
		
		RequestId = SCR.getData(); 
		
		System.out.println(SCR.toString());
		
		System.out.println("Request id is "+RequestId);
	
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
	
	@Test(priority=3)
	public void SaveSecA() {
		
		Response Details = logic.Get_SC_RequestDetails(JWTtoken, RequestId);
		GetRequestByIDResponse obj = Details.as(GetRequestByIDResponse.class);
		String Conid = obj.getData().getConsignmentId();
		Integer MOT = obj.getData().getModeOfTransportId();
		
		Response response = logic.SaveSecA(JWTtoken, RequestId, Conid, MOT);
		
		SavedSecA = response.as(GetRequestByIDResponse.class);
		
		
		System.out.println("Save SecA");
		response.prettyPrint();

	}
	
	@Test(priority=4)
	public void CompleteSecA() {
		
	 SavedSecA.getData().setStatusId(6);
		
		//System.out.println(SavedSecA.getData());
		
	List<QuestionnaireBank> list = SavedSecA.getData().getQuestionnaireBanks();
		for(int i =0;i<list.size();i++) {
			list.get(i).setCity("Rajesh");
		
		}
		
		
	for(int i =0;i<5;i++) {
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
