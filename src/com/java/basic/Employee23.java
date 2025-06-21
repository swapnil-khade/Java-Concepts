package com.java.basic;

public class Employee23 {
	
	private Employee23() {
		
	}

	volatile private static Employee23 obj;
	
	public static Employee23 getInstance() {
		
		if(obj == null) {
			synchronized(Employee23.class) {
				if(obj == null) {
					obj = new Employee23();
				}
			}
		}
		return obj;
	}
}
