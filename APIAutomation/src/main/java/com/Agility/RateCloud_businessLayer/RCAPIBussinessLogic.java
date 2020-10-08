package com.Agility.RateCloud_businessLayer;

import com.Agility.RateCloud_ResponsePOJO.RCTokenResponsePojo;
import com.Agility.RateCloud_requestPOJO.YamlTestDataForFCLAPI;
import com.Agility.RateCloud_requestPOJO.YamlTestDataForLCLAPI;
import com.Agility.RateCloud_requestPOJO.YamlTestDataForRCTokenAPI;
import com.Agility.dataProvider.PropertyFileReader;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class RCAPIBussinessLogic {

	public static String BaseURI = PropertyFileReader.getPropertyData().getApis().get("rcBaseURL");

	public static Response RCGetToken(YamlTestDataForRCTokenAPI Cred) {

		String URL = BaseURI + PropertyFileReader.getPropertyData().getApis().get("rcTokenAPI");

		System.out.println(URL);
		RestAssured.useRelaxedHTTPSValidation();

		Response tokenAPI = given().contentType("application/json").body(Cred).when().post(URL);
		@SuppressWarnings("unused")
		RCTokenResponsePojo RCtoken = tokenAPI.as(RCTokenResponsePojo.class);
		return tokenAPI;

	}

	public static Response LCL_RateSearch(String token, YamlTestDataForLCLAPI json) {

		String URL = BaseURI + PropertyFileReader.getPropertyData().getApis().get("lclRateSearch");
		RestAssured.useRelaxedHTTPSValidation();
		Response lclRC =
				given()
					.contentType("application/json")
					.body(json)
					.header("Authorization", "Bearer " + token)
				
				.when()
					.post(URL);

		System.out.println(lclRC.statusCode());
		return lclRC;

	}

	public static Response FCL_RateSearch(String token, YamlTestDataForFCLAPI json) {

		String FCLURL = BaseURI + PropertyFileReader.getPropertyData().getApis().get("fclRateSearch");
		System.out.println(FCLURL);
		RestAssured.useRelaxedHTTPSValidation();
		Response FclRC = given().contentType("application/json").body(json).header("Authorization", "Bearer " + token)
				.when().post(FCLURL);

		System.out.println(FclRC.statusCode());
		return FclRC;

	}

	public static RCTokenResponsePojo RCGetToken(String username, String password) {

		String URL = BaseURI + PropertyFileReader.getPropertyData().getApis().get("rcTokenAPI");

		System.out.println(URL);
		RestAssured.useRelaxedHTTPSValidation();

		Response tokenAPI =

				given().contentType("application/json")
						.body("{\"Username\": \"" + username + "\", \"Password\": \"" + password + "\"}").when()
						.post(URL);
		RCTokenResponsePojo RCtoken = tokenAPI.as(RCTokenResponsePojo.class);

		return RCtoken;

	}

}
