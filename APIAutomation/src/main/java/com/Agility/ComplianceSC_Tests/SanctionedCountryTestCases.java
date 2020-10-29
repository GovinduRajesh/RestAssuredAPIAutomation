package com.Agility.ComplianceSC_Tests;

import org.testng.annotations.Test;

import com.Agility.ComplianceSC_RequestPOJO.AuthenticateData;
import com.Agility.ComplianceSC_RequestPOJO.CreateSCRequest;
import com.Agility.ComplianceSC_RequestPOJO.PutRequestPOJO;
import com.Agility.ComplianceSC_RequestPOJO.SancCountryReqQuestionnaireSecB;
import com.Agility.ComplianceSC_RequestPOJO.SectionBPOJO;
import com.Agility.ComplianceSC_ResponsePOJO.AauthenticateResponsePOJO;
import com.Agility.ComplianceSC_ResponsePOJO.SCRequestResponse;
import com.Agility.ComplianceSC_ResponsePOJO_Ext.Data;
import com.Agility.ComplianceSC_ResponsePOJO_Ext.GetRequestByIDResponse;
import com.Agility.ComplianceSC_businessLayer.SC_API_Logics;
import com.Agility.dataProvider.DataProviderClass;
import com.Agility.utils.ParseDynamicJson;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import API_Validation.ResponseValidation;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SanctionedCountryTestCases {

	String JWTtoken;
	int RequestId;
	String payloadforPWS;
	String Screener_JWTtoken;

	GetRequestByIDResponse SavedSecA;
	GetRequestByIDResponse SecACompleted;
	GetRequestByIDResponse SecBCompleted;
	Data completeSecA;
	SectionBPOJO SecBdata;
	PutRequestPOJO screenerdata;
	SC_API_Logics BusinessLogic = new SC_API_Logics();
	ObjectMapper objMap = new ObjectMapper();

	@Test(priority = 1, enabled = true, dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void SC_CoordinatorAuthentication(AuthenticateData data) {
		data.setTestCategory(null);
		Response response = BusinessLogic.AuthenticateAPI(data);

		AauthenticateResponsePOJO resp = response.as(AauthenticateResponsePOJO.class);

		JWTtoken = resp.getData().getJwToken();

		System.out.println("JwToken is " + resp.getData().getJwToken());
		
	//	JsonPath json = response.jsonPath();
		
		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);
		ResponseValidation.logString(response, "data.jwToken", "<b>Token is </b>");
		ResponseValidation.logPayload(data);
		
		ResponseValidation.logResponse(response);
		
		
	}

	@Test(priority = 2, enabled = true, dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void SC_CreateSC_Request(CreateSCRequest data) {

		Response response = BusinessLogic.CreateSC_Request(data, JWTtoken);
		response.jsonPath().prettyPrint();

		SCRequestResponse SCR = response.as(SCRequestResponse.class);

		RequestId = SCR.getData();

		System.out.println("======== Create Request Response is==============");

		System.out.println(SCR.toString());

		System.out.println("Request id is " + RequestId);
		
		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);
		
		ResponseValidation.logMessage("<b> Sanction Country Request ID is </b> "+Integer.toString(RequestId));
		
		
		ResponseValidation.logResponse(response);
		

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
		
		
		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);
		
		ResponseValidation.logMessage("<b>Questionnaire Sec A Status is </b>"+SavedSecA.getData().getSanCountryReqQuestionnaireSecA().getStatusStatusDesc());
		
		//<pre id="json"></pre>
		
		ResponseValidation.logResponse(response);
		
		
		
	}

	@Test(priority = 4, enabled = true)
	public void CompleteSectionA() throws JsonProcessingException {

		completeSecA = SavedSecA.getData();
		completeSecA.getSanCountryReqQuestionnaireSecA().setStatusId(6);
		System.out.println("=== new == \n" + completeSecA.toString());

		String payload = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(completeSecA);

		Response response = BusinessLogic.CompleteSecA(payload, JWTtoken);
		System.out.println("======== Complete Section A Response is==============");
		response.jsonPath().prettyPrint();

		SecACompleted = response.as(GetRequestByIDResponse.class);
		
		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);

		ResponseValidation.logMessage("<b>Request Status is </b>"+SecACompleted.getData().getStatusStatusDesc());
		ResponseValidation.logMessage("<b>Questionnaire Sec A Status is </b> "+SecACompleted.getData().getSanCountryReqQuestionnaireSecA().getStatusStatusDesc());
		
		
		ResponseValidation.logResponse(response);

		

	}

	@Test(priority = 5, enabled = true)
	public void SendToScreener() throws JsonProcessingException {

		

		screenerdata = new PutRequestPOJO();
		screenerdata.setRequestId(SecACompleted.getData().getRequestId());
		screenerdata.setConsignmentId(SecACompleted.getData().getConsignmentId());
		screenerdata.setCountryId(SecACompleted.getData().getCountryId());

		screenerdata.setSancCountryId(SecACompleted.getData().getSancCountryId());

		screenerdata.setSancBranchId(SecACompleted.getData().getSancBranchId());

		screenerdata.setSancCountryType(SecACompleted.getData().getSancCountryType());

		screenerdata.setModeOfTransportId(SecACompleted.getData().getModeOfTransportId());

		screenerdata.setArchive(SecACompleted.getData().getArchive());

		screenerdata.setRequestedDate(SecACompleted.getData().getRequestedDate());

		screenerdata.setRequestedBy(SecACompleted.getData().getRequestedBy());

		screenerdata.setStatusId(2);
		screenerdata.setComments(SecACompleted.getData().getComments());

		String payload = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(screenerdata);

		System.out.println("========put payload is ===========\n " + payload);

		Response response = BusinessLogic.SendToScreener(screenerdata, JWTtoken, RequestId);
		System.out.println("======== Sent to Screener Response is==============");
		response.prettyPrint();
		
		
		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);

		ResponseValidation.logString(response, "data.statusStatusDesc", "<b> Request Status is </b>");
		//ResponseValidation.logString(response, "data.sanCountryReqQuestionnaireSecA.statusStatusDesc", "Questionnaire Sec A Status is ");

		ResponseValidation.logResponse(response);
		

	}

	@Test(priority = 6, enabled = true, dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public void SC_ScreenerAuthentication(AuthenticateData data) {

		Response response = BusinessLogic.AuthenticateAPI(data);

		AauthenticateResponsePOJO scresp = response.as(AauthenticateResponsePOJO.class);

		System.out.println("======== Login as Screener Response is==============");

		Screener_JWTtoken = scresp.getData().getJwToken();

		System.out.println("JwToken is " + scresp.getData().getJwToken());
		
		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);
		ResponseValidation.logString(response, "data.jwToken", "<b>Token is </b>");
		ResponseValidation.logPayload(data);
		

		
	}

	@Test(priority = 7, enabled = true)
	public void SaveSecB() throws JsonProcessingException {

		SecBdata = new SectionBPOJO();

		SecBdata.setRequestId(SecACompleted.getData().getRequestId());
		SecBdata.setConsignmentId(SecACompleted.getData().getConsignmentId());
		SecBdata.setCountryId(SecACompleted.getData().getCountryId());

		SecBdata.setSancCountryId(SecACompleted.getData().getSancCountryId());

		SecBdata.setSancBranchId(SecACompleted.getData().getSancBranchId());

		SecBdata.setSancCountryType(SecACompleted.getData().getSancCountryType());

		SecBdata.setModeOfTransportId(SecACompleted.getData().getModeOfTransportId());

		SecBdata.setArchive(SecACompleted.getData().getArchive());

		SecBdata.setRequestedDate(SecACompleted.getData().getRequestedDate());

		SecBdata.setRequestedBy(SecACompleted.getData().getRequestedBy());
		

		SecBdata.setStatusId(2);
		SecBdata.setComments(SecACompleted.getData().getComments());

		SecBdata.setSancCountryReqQuestionnaireSecB(new SancCountryReqQuestionnaireSecB());

		SecBdata.getSancCountryReqQuestionnaireSecB().setSancCountryQustSecBId(0);
		SecBdata.getSancCountryReqQuestionnaireSecB().setRequestId(SecACompleted.getData().getRequestId());

		SecBdata.getSancCountryReqQuestionnaireSecB().setIsPartiesInvolvedInTrans(0);
		SecBdata.getSancCountryReqQuestionnaireSecB().setIsTransInvInMilitaryItems(1);
		SecBdata.getSancCountryReqQuestionnaireSecB().setIsComplianceCertificate(1);
		SecBdata.getSancCountryReqQuestionnaireSecB().setStatusId(7);

		String SecBpayload = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(SecBdata);
		System.out.println("===============Save SecB payload is ===========");

		System.out.println(SecBpayload + "\n ===================================");

		Response response = BusinessLogic.SecB(SecBdata, Screener_JWTtoken);

		SecBCompleted = response.as(GetRequestByIDResponse.class);

		System.out.println("Saved Sec B Response is ===================================");

		response.prettyPrint();
		
		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);

		ResponseValidation.logString(response, "data.statusStatusDesc", "<b>Request Status is </b>");
		ResponseValidation.logString(response, "data.sanCountryReqQuestionnaireSecA.statusStatusDesc", "<b> Questionnaire Sec A Status is </b>");
		ResponseValidation.logString(response, "data.questSecB.statusStatusDesc", "<b> Questionnaire Sec B Status is </b>");

		ResponseValidation.logResponse(response);
		
		

	}

	@Test(priority = 8, enabled = true)
	public void CompleteSecB() {
		SecBdata.getSancCountryReqQuestionnaireSecB().setStatusId(8);

		SecBdata.getSancCountryReqQuestionnaireSecB()
				.setSancCountryQustSecBId(SecBCompleted.getData().getQuestSecB().getSancCountryQustSecBId());

		Response response = BusinessLogic.SecB(SecBdata, Screener_JWTtoken);
		response.prettyPrint();
		
		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);

		ResponseValidation.logString(response, "data.statusStatusDesc", "<b>Request Status is </b>");
		ResponseValidation.logString(response, "data.sanCountryReqQuestionnaireSecA.statusStatusDesc", "<b> Questionnaire Sec A Status is </b>");
		ResponseValidation.logString(response, "data.questSecB.statusStatusDesc", "<b>Questionnaire Sec B Status is </b>");

		ResponseValidation.logResponse(response);

	}

	@Test(priority = 9, enabled = true)
	public void ApproveRequest() throws JsonProcessingException {

		screenerdata.setStatusId(3);
		screenerdata.setArchive(1);

		String Approvedpayload = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(screenerdata);

		System.out.println("========put payload is ===========\n " + Approvedpayload);

		Response response = BusinessLogic.SendToScreener(screenerdata, JWTtoken, RequestId);
		System.out.println("========Approved Response is ===========\n ");
		response.prettyPrint();
		
		
		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);

		ResponseValidation.logString(response, "data.statusStatusDesc", "<b>Request Status is </b>");
		//ResponseValidation.logString(response, "data.sanCountryReqQuestionnaireSecA.statusStatusDesc", "Questionnaire Sec A Status is ");
		//ResponseValidation.logString(response, "data.questSecB.statusStatusDesc", "Questionnaire Sec B Status is ");

		ResponseValidation.logResponse(response);

	}

}
