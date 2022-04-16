package com.java.java8basics;

interface I{
	default void show() {
		System.out.println("In I");
	}
}
interface J{
	default void show() {
		System.out.println("In J");
	}
}
public class InterfaceInJava8 implements I,J{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In InterfaceInJava8");
		I.super.show();
		J.super.show();
	}
	
	public static void main(String[] args) {
		I obj = new InterfaceInJava8();
		obj.show();
		

	}

	

}
