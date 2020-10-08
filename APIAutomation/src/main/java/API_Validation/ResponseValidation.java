package API_Validation;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import com.Agility.ExtentReport.ExtentListeners;
import com.Agility.utils.ParseDynamicJson;
import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ResponseValidation extends ExtentListeners {

	public static void responseCodeValiddation(Response response, int statusCode) {

		try {
			Assert.assertEquals(statusCode, response.getStatusCode());
			// test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test
			// Case Failed", ExtentColor.RED));
			test.log(Status.PASS, "Successfully validated status code, status code is :: " + response.getStatusCode());
		} catch (AssertionError e) {
			test.log(Status.FAIL, e.fillInStackTrace());
			test.log(Status.FAIL,
					"Expected status code is :: " + statusCode + " , insted of getting :: " + response.getStatusCode());
		} catch (Exception e) {
			test.log(Status.FAIL, e.fillInStackTrace());
		}
	}

	public static void responseKeyValidationfromArray(Response response, String key) {
		try {
			JSONArray array = new JSONArray(response.getBody().asString());
			for (int i = 0; i < array.length(); i++) {
				JSONObject obj = array.getJSONObject(i);
				test.log(Status.PASS, "Validetd values are  " + obj.get(key));

			}
		} catch (Exception e) {
			test.log(Status.FAIL, e.fillInStackTrace());
		}
	}

	public static void responseKeyValidationFromJsonObject(Response response, String key) {
		try {
			JSONObject json = new JSONObject(response.getBody().asString());
			if (json.has(key) && json.get(key) != null) {
				test.log(Status.PASS, "Sucessfully validated value of " + key + ". It is " + json.get(key));
			} else {
				test.log(Status.FAIL, "Key is not availble");
			}
		} catch (Exception e) {
			test.log(Status.FAIL, e.fillInStackTrace());
		}
	}

	public static void responseTimeValidation(Response response) {
		try {
			long time = response.time();
			test.log(Status.INFO, "<b>Api response time is :</b> " + time + " ms");
		} catch (Exception e) {
			test.log(Status.FAIL, e.fillInStackTrace());
		}
	}

	public static void logResponse(Response response) {
		try {
			test.log(Status.INFO, "<b>Api response is :</b>\n" + response.prettyPrint());
		} catch (Exception e) {
			test.log(Status.FAIL, e.fillInStackTrace());
		}
	}

	public static void logResponse(String response) {
		try {
			test.log(Status.INFO, "<b>Api response is :</b>\n" + response/* .prettyPrint() */);
		} catch (Exception e) {
			test.log(Status.FAIL, e.fillInStackTrace());
		}
	}

	public static void logKey(Response response, String key) {
		try {
			JSONObject json = new JSONObject(response);
			ParseDynamicJson.getKey(json, key);
			test.log(Status.INFO, key + "value in response is :: ");
		} catch (Exception e) {
			test.log(Status.FAIL, e.fillInStackTrace());
		}
	}

	public static void logJsonPath(Response response, String jsonpath) {
		try {
			JsonPath Jsonpath = response.jsonPath();
			test.log(Status.INFO, "<b>" + jsonpath + "</b> value in response is :: " + Jsonpath.getList(jsonpath));
		} catch (Exception e) {
			test.log(Status.FAIL, e.fillInStackTrace());
		}
	}

	public static void logJsonSize(Response response, String jsonpath) {
		try {
			JsonPath Jsonpath = response.jsonPath();
			test.log(Status.INFO, "<b>" + jsonpath + "</b> Count is :: " + Jsonpath.getList(jsonpath).size());
		} catch (Exception e) {
			test.log(Status.FAIL, e.fillInStackTrace());
		}
	}

	public static void logString(Response response, String path) {
		try {

			test.log(Status.INFO, path + " Count is :: " + response.jsonPath().get(path));
		} catch (Exception e) {
			test.log(Status.FAIL, e.fillInStackTrace());
		}
	}

	public static void logStringInfo(String value) {
		try {

			test.log(Status.INFO, " payload is :: " + value);
		} catch (Exception e) {
			test.log(Status.FAIL, e.fillInStackTrace());
		}
	}

	public static void logPayload(Object obj) {
		try {
			ObjectMapper objMap = new ObjectMapper();
			String payload = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(obj);

			test.log(Status.INFO, "<b> payload is :: </b>" + payload);
		} catch (Exception e) {
			test.log(Status.FAIL, e.fillInStackTrace());
		}
	}

}