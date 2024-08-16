package com.java.java17basics;

public class SwitchStatement {

	public static void main(String[] args) {

		
		int i = 12;
		
		switch(i) {		
		case 10:
			System.out.println("10");
			break;
		case 11:
			System.out.println("11");
			break;
		default:
			System.out.println("default");
		}
		
		switch(i) {													// switch statement 
		case 10 -> System.out.println("10");
		case 11 -> System.out.println("11");
		default -> System.out.println("default");
		}
		
		int j = switch (i) {										// switch expression
			case 10 : yield 100;
			case 11 : yield 200;
			default : yield 300;		
		};
		System.out.println("j : "+j);
		
		int k = switch (i) {
		case 10 -> 100;
		case 11 -> 200;
		default -> 300;		
		};
		System.out.println("k : "+k);
	}

}
