package com.java.java17basics;

public class RecordClass {

	public static void main(String[] args) {

		EmployeeRecord e1 = new EmployeeRecord(0, "Derok", "Dranf");				
		
		

	    // Auto generated getter methods
	    System.out.println(e1.id() + " " + e1.firstName()
	                       + " " + e1.lastName());

	    // Auto-generated toString() method
	    System.out.println(e1.toString());
	}

}
