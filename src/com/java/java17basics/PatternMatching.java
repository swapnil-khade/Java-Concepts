package com.java.java17basics;


public class PatternMatching {

	public static void main(String[] args) {

		Object obj = "Maverick";
		
		if ( obj instanceof String) {
			String str = (String) obj;
			System.out.println(str);
		}
		
		
		if ( obj instanceof String str) {			// No need to perform type casting 
			
			System.out.println(str);
		}
	}

}
