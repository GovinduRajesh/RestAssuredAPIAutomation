package com.Agility.RCTests;

import org.testng.annotations.Test;

import com.Agility.RateCloud_ResponsePOJO.RCTokenResponsePojo;
import com.Agility.RateCloud_businessLayer.RCAPIBussinessLogic;
import com.Agility.RateCloud_requestPOJO.YamlTestDataForFCLAPI;
import com.Agility.RateCloud_requestPOJO.YamlTestDataForLCLAPI;
import com.Agility.RateCloud_requestPOJO.YamlTestDataForRCTokenAPI;
import com.Agility.dataProvider.DataProviderClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import API_Validation.ResponseValidation;
import io.restassured.response.Response;

public class RCAPITests {

	static String Utoken;

	@Test(priority = 1, dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public static void RC_GetToken(YamlTestDataForRCTokenAPI testdata) throws JsonProcessingException {

		Response response = RCAPIBussinessLogic.RCGetToken(testdata);
		RCTokenResponsePojo RCtoken = response.as(RCTokenResponsePojo.class);
		Utoken = RCtoken.getToken();
		System.out.println("Token in Test class " + Utoken);

		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);

		ResponseValidation.logPayload(testdata);
		ResponseValidation.responseKeyValidationFromJsonObject(response, "token");
		ResponseValidation.logResponse(response);

	}

	@Test(priority = 3, dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public static void LCL_RateSearch(YamlTestDataForLCLAPI lcldata) throws JsonProcessingException {

		Response response = RCAPIBussinessLogic.LCL_RateSearch(Utoken, lcldata);

		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);

		ResponseValidation.logPayload(lcldata);
		ResponseValidation.logJsonSize(response, "internationalFreight");
		ResponseValidation.logJsonSize(response, "originCharges");
		ResponseValidation.logJsonSize(response, "destinationCharges");
		ResponseValidation.logJsonPath(response, "internationalFreight.charge.chargeName");
		ResponseValidation.logResponse(response);

	}

	@Test(priority = 2, dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public static void FCL_RateSearch(YamlTestDataForFCLAPI fcldata) throws JsonProcessingException {

		Response response = RCAPIBussinessLogic.FCL_RateSearch(Utoken, fcldata);

		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);

		ResponseValidation.logPayload(fcldata);

		ResponseValidation.logJsonSize(response, "internationalFreight");
		ResponseValidation.logJsonSize(response, "originCharges");
		ResponseValidation.logJsonSize(response, "destinationCharges");
		ResponseValidation.logJsonPath(response, "internationalFreight.charge.chargeName");
		ResponseValidation.logResponse(response);

	}

}
