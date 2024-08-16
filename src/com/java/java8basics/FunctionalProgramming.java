package com.java.java8basics;


interface Calculator {
	int operation (int i, int j);
	
}
public class FunctionalProgramming {

	public static void main(String args[]) {
		
		int k = num(5,2,(i,j) -> i+j);
		System.out.println("Hi "+k);
		
		
	}
	
	private static int num(int i, int j, Calculator cal) {
		
		return cal.operation(i, j);		
	}
}
