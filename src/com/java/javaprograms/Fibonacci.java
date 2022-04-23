package com.java.javaprograms;

public class Fibonacci {

	public static void main(String[] args) {

		int tem, c=0, d=1;
		
		System.out.print(c+" "+ d);
		for(int i=0; i<8; i++) {
			tem = c+d;
			System.out.print(" "+tem);
			c = d;
			d = tem;
		}
		
		System.out.println("-------------------");
		System.out.print(a+" "+ b);
		fibonacci(8);
	}
	
	static int temp, a=0,b=1;

	static void fibonacci(int n) {
		if(n>0) {
			temp = a+b;
			System.out.print(" "+temp);
			a=b;
			b=temp;
			fibonacci(n-1);
		}
		
	}
}
