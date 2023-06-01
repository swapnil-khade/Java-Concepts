package com.java.basic;

import org.json.*;

public class JsonStringToJsonObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "{\"statusCode\":404,\r\n" + 
				"\"listingId\":\"15003982519512\",\r\n" + 
				"\r\n" + 
				"\"errors\":[{\"errorId\":100013,\r\n" + 
				"	\"domain\":\"lpsErrorDomain\",\r\n" + 
				"	\"subdomain\":\"Selling\",\r\n" + 
				"	\"category\":\"REQUEST\",\r\n" + 
				"	\"message\":\"Item Id not found\",\r\n" + 
				"	\"longMessage\":\"Item Id not found\"\r\n" + 
				"	}]\r\n" + 
				"\r\n" + 
				"}";
		
		JSONObject j = new JSONObject(str);
		
		System.out.println(j.getJSONArray("errors").getJSONObject(0).get("message"));

	}

}
