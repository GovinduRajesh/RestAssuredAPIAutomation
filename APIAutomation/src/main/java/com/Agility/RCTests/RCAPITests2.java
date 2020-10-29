package com.Agility.RCTests;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.Test;

import com.Agility.RateCloud_ResponsePOJO.Charge;
import com.Agility.RateCloud_ResponsePOJO.FCLResponse;
import com.Agility.RateCloud_ResponsePOJO.InternationalFreight;
import com.Agility.RateCloud_ResponsePOJO.LCLResponse;
import com.Agility.RateCloud_ResponsePOJO.RCTokenResponsePojo;
import com.Agility.RateCloud_businessLayer.RCAPIBussinessLogic;
import com.Agility.RateCloud_requestPOJO.YamlTestDataForFCLAPI;
import com.Agility.RateCloud_requestPOJO.YamlTestDataForLCLAPI;
import com.Agility.RateCloud_requestPOJO.YamlTestDataForRCTokenAPI;
import com.Agility.dataProvider.DataProviderClass;
import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.core.JsonProcessingException;
import API_Validation.ResponseValidation;
import bsh.StringUtil;
import io.restassured.response.Response;

public class RCAPITests2 {

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
		LCLResponse LclResp = response.as(LCLResponse.class);

		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);
		ResponseValidation.logPayload(lcldata);
		ResponseValidation.logJsonSize(response, "internationalFreight");
		ResponseValidation.logJsonSize(response, "originCharges");
		ResponseValidation.logJsonSize(response, "destinationCharges");
		ResponseValidation.logJsonPath(response, "internationalFreight.charge.currencyIsoCode");
		ResponseValidation.logJsonPath(response, "internationalFreight.charge.uomCode");

		ResponseValidation.logString(response, "internationalFreight.charge.uomCode", "<b> UOM Code is </b>");

		ResponseValidation.logResponse(response);

		try {
			int Currencycount = 0;
			int UomCount = 0;
			List<InternationalFreight> list = LclResp.getInternationalFreight();
			for (InternationalFreight a : list) {

				List<Charge> charges = a.getCharge();
				for (Charge charge : charges) {
					//charge.setCurrencyIsoCode(null);
					if (charge.getCurrencyIsoCode() == null || StringUtils.isEmpty(charge.getCurrencyIsoCode())) {
						Currencycount = Currencycount + 1;
					}
					//charge.setUomCode("");
					if (charge.getUomCode() == null || (charge.getUomCode() == "")) {

						UomCount = UomCount + 1;
					}
				}
			}
			if (Currencycount > 0) {
				ResponseValidation.logAsFail(Currencycount + " CurrencyCode's are empty or null");
			}
			if (UomCount > 0) {
				ResponseValidation.logAsFail(UomCount + " UOM's are empty or null");
			}
			
			System.out.println("currencycount is " + Currencycount);
			System.out.println("uomcycount is " + UomCount);
			if(Currencycount > 0||UomCount > 0) {
				org.testng.Assert.fail("you wandered onto the wrong path");
			}
		} catch (Exception e) {
			ResponseValidation.logAsFail("Unexected Response -  Please verify the input data");
			e.printStackTrace();
		}

	}

	@Test(priority = 2, dataProvider = "RC_test_data_provider", dataProviderClass = DataProviderClass.class)
	public static void FCL_RateSearch(YamlTestDataForFCLAPI fcldata) throws JsonProcessingException {

		Response response = RCAPIBussinessLogic.FCL_RateSearch(Utoken, fcldata);

		FCLResponse FCLResponse = response.as(FCLResponse.class);

		ResponseValidation.responseCodeValiddation(response, 200);
		ResponseValidation.responseTimeValidation(response);

		ResponseValidation.logPayload(fcldata);

		ResponseValidation.logJsonSize(response, "internationalFreight");
		ResponseValidation.logJsonSize(response, "originCharges");
		ResponseValidation.logJsonSize(response, "destinationCharges");
		ResponseValidation.logJsonPath(response, "internationalFreight.charge.currencyIsoCode");
		ResponseValidation.logJsonPath(response, "internationalFreight.charge.uomCode");
		ResponseValidation.logResponse(response);

		try {
			int Currencycount = 0;
			int UomCount = 0;
			List<InternationalFreight> list = FCLResponse.getInternationalFreight();
			for (InternationalFreight a : list) {

				List<Charge> charges = a.getCharge();
				for (Charge charge : charges) {
					charge.setCurrencyIsoCode(null);
					if (charge.getCurrencyIsoCode() == null || StringUtils.isEmpty(charge.getCurrencyIsoCode())) {
						Currencycount = Currencycount + 1;
					}
					charge.setUomCode("");
					if (charge.getUomCode() == null || (charge.getUomCode() == "")) {

						UomCount = UomCount + 1;
					}
				}
			}
			if (Currencycount > 0) {
				ResponseValidation.logAsFail(Currencycount + " CurrencyCode's are empty or null");
			}
			if (UomCount > 0) {
				ResponseValidation.logAsFail(UomCount + " UOM's are empty or null");
			}
			
			System.out.println("currencycount is " + Currencycount);
			System.out.println("uomcycount is " + UomCount);
			if(Currencycount > 0||UomCount > 0) {
			org.testng.Assert.fail("you wandered onto the wrong path");
			}
		} catch (Exception e) {
			ResponseValidation.logAsFail("Unexected Response -  Please verify the input data");
			e.printStackTrace();
		}
	}

}
