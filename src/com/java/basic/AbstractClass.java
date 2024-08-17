package com.java.basic;

abstract class Demo{
	
	public Demo(int x) {
		System.out.println("In Demo constructor.");
	}
	
	public abstract void display();
}

class DemoImpl extends Demo{
	
	public DemoImpl() {
		super(12);
		System.out.println("In DemoImpl constructor.");
	}

	@Override
	public void display() {

		System.out.println("In display method.");
		
	}
	
}

public class AbstractClass {
	
	public static void main(String[] args) {
		
		Demo obj = new DemoImpl();
		obj.display();
	}

}
