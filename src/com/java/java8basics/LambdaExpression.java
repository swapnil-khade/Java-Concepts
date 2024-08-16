package com.java.java8basics;


interface FunctionalInterface{
	int operation (int i, int j);
}


public class LambdaExpression {

	public static void main(String[] args) {

		FunctionalInterface fi = new FunctionalInterface(){

			@Override
			public int operation(int i, int j) {
			
				return i+j;
			}
			
		};
		
		FunctionalInterface sum = (i,j) -> i+j;
		
		int total = sum.operation(2, 3);
		
		System.out.println(total);
		
	}

}
