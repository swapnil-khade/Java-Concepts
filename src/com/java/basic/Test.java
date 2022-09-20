package com.java.basic;

public class Test {

	public static void main(String[] args) {
		int a=1;
		for(int i=1; i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		
		
		System.out.println(recursion(5));

	}
	static int recursion (int i){

		if(i==0)
		{
		return 1;
		}

		return i*recursion(i-1);

		}
	
	public void display() {
		try {
			
		}
		finally {
			
		}
	}

	
	public void display1() {
		System.out.println("Inside");
		System.out.println("display1");


		
	}
	
	public void display2() {
		
	}

}
