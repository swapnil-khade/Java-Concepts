package com.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

		String s = "1, -2,3,4,5";
		s = s.replaceAll("\\s", "");
		List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
		List<Long> l = new ArrayList<Long>();
		
		for(String s1 : myList) {
			l.add(Long.valueOf(s1));
		}
		System.out.println(l);
	}

}
