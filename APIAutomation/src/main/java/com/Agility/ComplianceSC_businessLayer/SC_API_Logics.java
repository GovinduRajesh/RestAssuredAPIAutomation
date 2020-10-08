package com.Agility.ComplianceSC_businessLayer;

import static io.restassured.RestAssured.given;

import com.Agility.ComplianceSC_RequestPOJO.AuthenticateData;
import com.Agility.ComplianceSC_RequestPOJO.CreateSCRequest;
import com.Agility.ComplianceSC_ResponsePOJO_Ext.GetRequestByIDResponse;
import com.Agility.dataProvider.PropertyFileReader;

import io.restassured.response.Response;

public class SC_API_Logics {
	
	public static String BaseURL = PropertyFileReader.getPropertyData().getApis().get("scBaseURL");
	
	
	public Response AuthenticateAPI(AuthenticateData data) {
		
		/*AuthenticateData data = new AuthenticateData();
		
		data.setEmail("coordinator@agility.com");
		data.setPassword("Pass@123");*/
		
		String URI = BaseURL+ PropertyFileReader.getPropertyData().getApis().get("scAuthenticate");
		
		Response response = 
				given()
						.body(data)
						.contentType("application/json")
				.when()
						.post(URI);
		
		return response;
		
	}
	
	public Response CreateSC_Request(CreateSCRequest data,String token){
		
		String URI = BaseURL+ PropertyFileReader.getPropertyData().getApis().get("scCreateRequest");
		
		Response response = 
				given()
						.body(data)
						.contentType("application/json")
						.header("Authorization", "Bearer "+token)
				.when()
						.post(URI);
		
		return response;
		
	}
	
	
	public Response Get_SC_RequestDetails(String token, int RequestID) {
		
		String URI = BaseURL+ PropertyFileReader.getPropertyData().getApis().get("scRequestDetailsByID")+ RequestID;
		
		Response response = 
				given()
						.header("Authorization", "Bearer "+token)
				.when()
						.get(URI);
		
		
		
		return response;
		
	}
	
	
	public Response SaveSecA(String token, int Requestid, String consignmentId, int MOT) {
		
	String URI = BaseURL+ PropertyFileReader.getPropertyData().getApis().get("scSecA");
		
	String body = "{\"requestId\":"+Requestid+",\"consignmentId\":\""+consignmentId+"\",\"countryId\":4,\"sancCountryId\":1,\"sancBranchId\":1,\"sancCountryType\":\"new\",\"modeOfTransportId\":"+MOT+",\"archive\":0,\"requestedDate\":\"2020-09-30T13:41:30.711\",\"requestedBy\":\"rgovindu\",\"statusId\":1,\"comments\":\"status id is 2\",\"SanCountryReqQuestionnaireSecA\":{\"sancCountryQustId\":0,\"requestId\":"+Requestid+",\"isShipper\":0,\"modeOfTransportId\":1,\"shipmentOrigin\":\"AU\",\"shipmentOriginCountryId\":4,\"shipmentDestination\":\"IN\",\"shipmentDestCountryId\":7,\"isTranshipment\":0,\"transhipmentCountryId\":4,\"carrierId\":1,\"vessel\":\"Vessel\",\"productsToBeShipped\":\"Garments\",\"endUserProducts\":\"Garments\",\"hsCommodityCodes\":\"hsc\",\"ecn\":\"ecn\",\"countryOfOriginId\":4,\"currencyOfPaymentId\":\"AUD\",\"othCurrenciesInvInTrans\":\"INR\",\"statusId\":5,\"modeOfTransportMode\":\"Air\",\"shipmentOriginCountryCode\":\"AU\",\"shipmentOriginCountryName\":\"Australia\",\"shipmentDestCountryCode\":\"IN\",\"shipmentDestCountryName\":\"India\",\"transhipmentCountryCode\":\"AU\",\"transhipmentCountryName\":\"Australia\",\"carrierCode\":\"MAEU\",\"carrierName\":\"Mearsk\",\"countryOfOriginCode\":\"AU\",\"countryOfOriginName\":\"Australia\",\"statusStatusDesc\":\"Questionnaire Sec A Saved\"},\"questSecB\":null,\"questionnaireBanks\":[{\"questionnaireBankId\":0,\"requestId\":"+Requestid+",\"name\":\"ICICI - AU\",\"city\":\"Melbourne\",\"countryId\":4,\"countryname\":\"AU\"}],\"stkDetails\":[{\"reqStkDetailsId\":0,\"stakeholderTypeId\":1,\"stakeholderName\":\"Ransome\",\"street\":\"Street1\",\"city\":\"Melbourne\",\"state\":\"Melbourne\",\"country\":\"Australia\",\"postalCode\":\"500067\",\"requestId\":"+Requestid+",\"stakeholderId\":1}]}";
	
	System.out.println(body);
	
	Response response = 
			given()
					.body(body)
					.contentType("application/json")
					.header("Authorization", "Bearer "+token)
			.when()
					.post(URI);
		
		return response;
		
	}
	
	public Response CompleteSecA(String body, String token) {
		String URI = BaseURL+ PropertyFileReader.getPropertyData().getApis().get("scSecA");
		
		System.out.println(body);
		
		Response response = 
				given()
						.body(body)
						.contentType("application/json")
						.header("Authorization", "Bearer "+token)
				.when()
						.post(URI);
			
			return response;
		
	}
	
	

}
