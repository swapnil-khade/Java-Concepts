package com.java.designPattern;

public class FactoryDesignPattern {

	public static void main(String[] args) {

		OS obj = new Apple();
		
		OSFactory object = new OSFactory();
		OS obj1= object.getInstance("apple");
		obj1.show();
		
	}

}

class OSFactory{
	public OS getInstance(String str) {
		if(str.equals("windows"))
			return new Windows();
		else
			return new Apple();
	}
}

interface OS{
	public void show();
}

class Windows implements OS{

	@Override
	public void show() {
		System.out.println("Inside Windows");
		
	}
	
}

class Apple implements OS{

	@Override
	public void show() {
		System.out.println("Inside Apple");
		
	}
	
}