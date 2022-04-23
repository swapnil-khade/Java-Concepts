package com.java.javaprograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=1;
		for(int i =5;i>0;i--) {
			v=v*i;
		}
		System.out.println(v);
		System.out.println("-------------");
		System.out.println(factorial(5));
	}

	static int factorial(int i) {
		if(i==0)
			return 1;
		else
			return i*factorial(i-1);
	}
}
