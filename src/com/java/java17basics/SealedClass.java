package com.java.java17basics;


sealed class Shape permits SealedClass {
	
}

public sealed class SealedClass extends Shape permits Circle{					// must be final, sealed, non-sealed 

	public static void main(String[] args) {
		
		System.out.println("In Sealed class.");
		
	}

}

final class Circle extends  SealedClass {
	
}
