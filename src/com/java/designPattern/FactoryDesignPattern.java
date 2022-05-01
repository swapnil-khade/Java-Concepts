package com.java.designPattern;

enum OSType{
	APPLE,
	WINDOWS
}
public class FactoryDesignPattern {

	public static void main(String[] args) {

		OS obj = new Apple();
		
		OSFactory object = new OSFactory();
		OS obj1= object.getInstance(OSType.APPLE);
		obj1.show();
		
	}

}


//class OSFactory{
//	public OS getInstance(String str) {
//		if(str.equals("windows"))
//			return new Windows();
//		else
//			return new Apple();
//	}
//}

class OSFactory{
	public OS getInstance(OSType os) {
		switch(os) {
		case APPLE:
			return new Apple();
		default:
			return new Windows();
			
		}
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