package com.java.java17basics;

public record EmployeeRecord(int id, String firstName, String lastName) implements Cloneable{
	
	static int i = 0;
	
	public EmployeeRecord {											// this is parameterized constructor
		if(id == 0 )
			throw new IllegalArgumentException("Id can not be zero...!!!");
		
	}
	
	public void display() {
		
	}
}		


/*
 * Record can not have setter methods 
 * 		  can not extend class 
 * 		  can implement interfaces
 */
 		
 		
