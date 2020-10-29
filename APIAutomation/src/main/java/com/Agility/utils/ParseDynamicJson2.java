package com.Agility.utils;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseDynamicJson2 {

	// How to parse dynamic JSON?
	// How to parse nested JSON?
	// Code Explanation : https://www.youtube.com/watch?v=ZjZqLUGCWxo
	
	
	

	public static String parseObject(JSONObject json, String key) {
		// System.out.println(json.has(key));
		if(json.get(key)=="") {
			System.out.println("=====Value not found======");
		}else {
		System.out.println(json.get(key));
		}
		
		return (String) json.get(key);
	}

	public static String getKey(JSONObject json, String key) {

		boolean exists = json.has(key);
		Iterator<?> keys;
		String nextKeys;

		if (!exists) {
			keys = json.keys();
			while (keys.hasNext()) {
				nextKeys = (String) keys.next();
				try {

					if (json.get(nextKeys) instanceof JSONObject) {

						if (exists == false) {
							getKey(json.getJSONObject(nextKeys), key);
						}

					} else if (json.get(nextKeys) instanceof JSONArray) {
						JSONArray jsonarray = json.getJSONArray(nextKeys);
						for (int i = 0; i < jsonarray.length(); i++) {
							String jsonarrayString = jsonarray.get(i).toString();
							JSONObject innerJSOn = new JSONObject(jsonarrayString);

							if (exists == false) {
								getKey(innerJSOn, key);
							}

						}

					}

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("=======Value not found==========");
				}

			}

		} else {
			//parseObject(json, key);
			return parseObject(json, key);
		}
		//return parseObject(json, key);
		return parseObject(json, key);

	}

	public static void main(String[] args) {

		String inputJson = "{\"internationalFreight\":[{\"identifier\":247571,\"carrierScacCode\":\"WAIC\",\"contractUploadReference\":\"SHIPCO\",\"contractNumber\":null,\"effectiveDate\":\"2020-10-01T00:00:00\",\"expiryDate\":\"2020-10-31T00:00:00\",\"originPortIsoCode\":\"INMAA\",\"transhipment\":[{\"portIsoCode\":\"-\"},{\"portIsoCode\":\"-\"}],\"destinationPortIsoCode\":\"USLAX\",\"transitTime\":0,\"charge\":[{\"chargeIdentifier\":35888499,\"chargeCode\":\"F6D\",\"chargeName\":\"Ocean Freight\",\"effectiveDate\":\"2020-10-01T00:00:00\",\"expiryDate\":\"2020-10-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"per W/M\",\"containerSize\":null,\"maximum\":0,\"minimum\":56,\"unitCost\":56,\"rateapplicability\":null,\"notes\":\"-\",\"baseChargeCode\":null},{\"chargeIdentifier\":35888500,\"chargeCode\":\"B2L\",\"chargeName\":\"IMO2020\",\"effectiveDate\":\"2020-10-01T00:00:00\",\"expiryDate\":\"2020-10-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"\",\"containerSize\":null,\"maximum\":0,\"minimum\":4,\"unitCost\":4,\"rateapplicability\":null,\"notes\":\"-\",\"baseChargeCode\":null},{\"chargeIdentifier\":35888501,\"chargeCode\":\"M2A\",\"chargeName\":\"Other\",\"effectiveDate\":\"2020-10-01T00:00:00\",\"expiryDate\":\"2020-10-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"per W/M\",\"containerSize\":null,\"maximum\":0,\"minimum\":31.1,\"unitCost\":31.1,\"rateapplicability\":null,\"notes\":\"DDC (Door Delivery Charge)\",\"baseChargeCode\":null}]},{\"identifier\":35888499,\"carrierScacCode\":\"SQST\",\"contractUploadReference\":\"SQST_IN\",\"contractNumber\":null,\"effectiveDate\":\"2020-10-25T00:00:00\",\"expiryDate\":\"2020-11-30T00:00:00\",\"originPortIsoCode\":\"INMAA\",\"transhipment\":[],\"destinationPortIsoCode\":\"USLAX\",\"transitTime\":35,\"charge\":[{\"chargeIdentifier\":648477,\"chargeCode\":\"B2L\",\"chargeName\":\"Bunker Transitioning Charge\",\"effectiveDate\":\"2020-10-25T00:00:00\",\"expiryDate\":\"2020-11-30T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"per W/M\",\"containerSize\":null,\"maximum\":0,\"minimum\":0,\"unitCost\":0,\"rateapplicability\":null,\"notes\":null,\"baseChargeCode\":null},{\"chargeIdentifier\":648479,\"chargeCode\":\"M2A\",\"chargeName\":\"Miscellaneous charges\",\"effectiveDate\":\"2020-10-25T00:00:00\",\"expiryDate\":\"2020-11-30T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"per W/M\",\"containerSize\":null,\"maximum\":0,\"minimum\":0,\"unitCost\":0,\"rateapplicability\":null,\"notes\":null,\"baseChargeCode\":null},{\"chargeIdentifier\":648480,\"chargeCode\":\"F6H\",\"chargeName\":\"PSS\",\"effectiveDate\":\"2020-10-25T00:00:00\",\"expiryDate\":\"2020-11-30T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"per W/M\",\"containerSize\":null,\"maximum\":0,\"minimum\":0,\"unitCost\":0,\"rateapplicability\":\"SubjectTo\",\"notes\":null,\"baseChargeCode\":null},{\"chargeIdentifier\":648482,\"chargeCode\":\"F6G\",\"chargeName\":\"GRI\",\"effectiveDate\":\"2020-10-25T00:00:00\",\"expiryDate\":\"2020-11-30T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"per W/M\",\"containerSize\":null,\"maximum\":0,\"minimum\":0,\"unitCost\":0,\"rateapplicability\":\"SubjectTo\",\"notes\":null,\"baseChargeCode\":null},{\"chargeIdentifier\":648478,\"chargeCode\":\"F6D\",\"chargeName\":\"Oceanfreight\",\"effectiveDate\":\"2020-10-25T00:00:00\",\"expiryDate\":\"2020-11-30T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"per W/M\",\"containerSize\":null,\"maximum\":0,\"minimum\":0,\"unitCost\":0,\"rateapplicability\":null,\"notes\":null,\"baseChargeCode\":null},{\"chargeIdentifier\":648481,\"chargeCode\":\"B2A\",\"chargeName\":\"BAF\",\"effectiveDate\":\"2020-10-25T00:00:00\",\"expiryDate\":\"2020-11-30T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"per W/M\",\"containerSize\":null,\"maximum\":0,\"minimum\":0,\"unitCost\":0,\"rateapplicability\":\"SubjectTo\",\"notes\":null,\"baseChargeCode\":null}]}],\"originCharges\":[{\"chargeIdentifier\":56374,\"chargeCode\":\"C1A\",\"chargeName\":\"Pick-Up Charges\",\"effectiveDate\":\"2020-06-19T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"INR\",\"uomCode\":\"Per KG\",\"containerSize\":\"Per KG\",\"maximum\":null,\"minimum\":null,\"unitCost\":39500,\"rateapplicability\":null,\"notes\":\"Subject to chargeable weight calculated on the basisi of 1 CBM = 333 KGS\",\"baseChargeCode\":null},{\"chargeIdentifier\":56375,\"chargeCode\":\"B1E\",\"chargeName\":\"Inland Fuel Surcharge\",\"effectiveDate\":\"2020-06-13T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"INR\",\"uomCode\":\"% Of Other Charge\",\"containerSize\":\"% Of Other Charge\",\"maximum\":null,\"minimum\":null,\"unitCost\":25,\"rateapplicability\":null,\"notes\":\"Inland Additional Charge\",\"baseChargeCode\":\"C1A\"},{\"chargeIdentifier\":56377,\"chargeCode\":\"A6O\",\"chargeName\":\"Export Customs Clearance\",\"effectiveDate\":\"2020-06-13T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"INR\",\"uomCode\":\"Per Shipment\",\"containerSize\":\"Per Shipment\",\"maximum\":null,\"minimum\":null,\"unitCost\":2000,\"rateapplicability\":null,\"notes\":null,\"baseChargeCode\":null},{\"chargeIdentifier\":56379,\"chargeCode\":\"A2A\",\"chargeName\":\"BL Fee\",\"effectiveDate\":\"2020-06-13T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"INR\",\"uomCode\":\"Per BL\",\"containerSize\":\"Per BL\",\"maximum\":null,\"minimum\":null,\"unitCost\":3000,\"rateapplicability\":null,\"notes\":null,\"baseChargeCode\":null},{\"chargeIdentifier\":56380,\"chargeCode\":\"A8S\",\"chargeName\":\"SOLAS/VGM Administration/Processing Fees\",\"effectiveDate\":\"2020-06-13T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per BL\",\"containerSize\":\"Per BL\",\"maximum\":null,\"minimum\":null,\"unitCost\":20,\"rateapplicability\":null,\"notes\":null,\"baseChargeCode\":null},{\"chargeIdentifier\":56389,\"chargeCode\":\"H1E\",\"chargeName\":\"Origin THC\",\"effectiveDate\":\"2020-06-13T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"INR\",\"uomCode\":\"Per W/M\",\"containerSize\":\"Per W/M\",\"maximum\":null,\"minimum\":null,\"unitCost\":450,\"rateapplicability\":null,\"notes\":null,\"baseChargeCode\":null},{\"chargeIdentifier\":56390,\"chargeCode\":\"R1A\",\"chargeName\":\"CFS Charges\",\"effectiveDate\":\"2020-06-13T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"INR\",\"uomCode\":\"Per W/M\",\"containerSize\":\"Per W/M\",\"maximum\":null,\"minimum\":null,\"unitCost\":1330,\"rateapplicability\":null,\"notes\":null,\"baseChargeCode\":null},{\"chargeIdentifier\":56440,\"chargeCode\":\"A8E\",\"chargeName\":\"Automated Manifest System (AMS)\",\"effectiveDate\":\"2020-06-13T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per BL\",\"containerSize\":\"Per BL\",\"maximum\":null,\"minimum\":null,\"unitCost\":30,\"rateapplicability\":null,\"notes\":\"Advance manifestation charges\",\"baseChargeCode\":null},{\"chargeIdentifier\":56617,\"chargeCode\":\"H2F\",\"chargeName\":\"Handling Agility\",\"effectiveDate\":\"2020-06-25T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"INR\",\"uomCode\":\"Per Shipment\",\"containerSize\":\"Per Shipment\",\"maximum\":null,\"minimum\":null,\"unitCost\":4000,\"rateapplicability\":null,\"notes\":\"Agility Handling Fee\\r\\n\",\"baseChargeCode\":null}],\"destinationCharges\":[{\"chargeIdentifier\":17523,\"chargeCode\":\"E1C\",\"chargeName\":\"Chassis Charge\",\"effectiveDate\":\"2016-10-01T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per W/M\",\"containerSize\":\"Per W/M\",\"maximum\":null,\"minimum\":null,\"unitCost\":4,\"rateapplicability\":null,\"notes\":null,\"baseChargeCode\":null},{\"chargeIdentifier\":17524,\"chargeCode\":\"H2F\",\"chargeName\":\"Handling Agility\",\"effectiveDate\":\"2016-10-01T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per HBL\",\"containerSize\":\"Per HBL\",\"maximum\":null,\"minimum\":null,\"unitCost\":60,\"rateapplicability\":null,\"notes\":null,\"baseChargeCode\":null},{\"chargeIdentifier\":17527,\"chargeCode\":\"A6Q\",\"chargeName\":\"Import Customs Clearance\",\"effectiveDate\":\"2016-10-01T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per Declaration\",\"containerSize\":\"Per Declaration\",\"maximum\":null,\"minimum\":null,\"unitCost\":100,\"rateapplicability\":null,\"notes\":\"Customs Process Fees-Customs Entry (Only if cleared by Agility)\",\"baseChargeCode\":null},{\"chargeIdentifier\":17533,\"chargeCode\":\"M2A\",\"chargeName\":\"Miscellaneous charges\",\"effectiveDate\":\"2016-10-01T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per Shipment\",\"containerSize\":\"Per Shipment\",\"maximum\":null,\"minimum\":null,\"unitCost\":65,\"rateapplicability\":null,\"notes\":\"Doc Turnover Fee applicable when Agility is not the customs broker.\",\"baseChargeCode\":null},{\"chargeIdentifier\":18040,\"chargeCode\":\"A8H\",\"chargeName\":\"Importer Security Filing (ISF)\",\"effectiveDate\":\"2017-01-19T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per Shipment\",\"containerSize\":\"Per Shipment\",\"maximum\":null,\"minimum\":null,\"unitCost\":35,\"rateapplicability\":null,\"notes\":\"For first 3 lines\",\"baseChargeCode\":null},{\"chargeIdentifier\":31314,\"chargeCode\":\"D1A\",\"chargeName\":\"Delivery Charges\",\"effectiveDate\":\"2018-03-19T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per KG\",\"containerSize\":\"Per KG\",\"maximum\":null,\"minimum\":null,\"unitCost\":120,\"rateapplicability\":null,\"notes\":\"1 CBM = 330 KGs\",\"baseChargeCode\":null},{\"chargeIdentifier\":41377,\"chargeCode\":\"R1A\",\"chargeName\":\"CFS Charges\",\"effectiveDate\":\"2018-08-01T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per W/M\",\"containerSize\":\"Per W/M\",\"maximum\":null,\"minimum\":null,\"unitCost\":34.63,\"rateapplicability\":null,\"notes\":\"* CFS WAREHOUSE FEE * TRUCKING LOADING FEE * PIER PASS FEE * CLEAN TRUCK FEE * CHASSIS SPLIT FEE * FUEL SURCHARGE FEE * STRIPPING FEE\",\"baseChargeCode\":null},{\"chargeIdentifier\":41378,\"chargeCode\":\"R1E\",\"chargeName\":\"CFS Handling\",\"effectiveDate\":\"2018-08-01T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per Shipment\",\"containerSize\":\"Per Shipment\",\"maximum\":null,\"minimum\":null,\"unitCost\":105,\"rateapplicability\":null,\"notes\":\"* CFS DOCUMENTATION FEE * CFS FACILITY FEE * CARRIER PORT SECURITY FEE * WHARFAGE FEE * EQUIPMENT FEE\",\"baseChargeCode\":null},{\"chargeIdentifier\":52284,\"chargeCode\":\"T1H\",\"chargeName\":\"Pier Pass Fee\",\"effectiveDate\":\"2016-10-01T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per W/M\",\"containerSize\":\"Per W/M\",\"maximum\":null,\"minimum\":null,\"unitCost\":4,\"rateapplicability\":null,\"notes\":\"VIA LAX PORT\",\"baseChargeCode\":null},{\"chargeIdentifier\":52285,\"chargeCode\":\"T1E\",\"chargeName\":\"Clean Truck Fee\",\"effectiveDate\":\"2016-10-01T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per W/M\",\"containerSize\":\"Per W/M\",\"maximum\":null,\"minimum\":null,\"unitCost\":3,\"rateapplicability\":null,\"notes\":\"VIA LAX PORT\",\"baseChargeCode\":null},{\"chargeIdentifier\":57102,\"chargeCode\":\"A8E\",\"chargeName\":\"Automated Manifest System (AMS)\",\"effectiveDate\":\"2020-08-26T00:00:00\",\"expiryDate\":\"2020-12-31T00:00:00\",\"currencyIsoCode\":\"USD\",\"uomCode\":\"Per HBL\",\"containerSize\":\"Per HBL\",\"maximum\":null,\"minimum\":null,\"unitCost\":25,\"rateapplicability\":null,\"notes\":null,\"baseChargeCode\":null}]}";
		JSONObject inputJSONOBject = new JSONObject(inputJson);
		
		

		 getKey(inputJSONOBject, "uomCode");
		/*String value = getKey(inputJSONOBject, "uomCode");
		if(value=="") {
			System.out.println("=========Failed=========");
		}else {
		System.out.println(value);*/

		}
	//}

}