package com.java.basic;

class BaseMethodClass {

    public static void printMessage() {								// Compiler responsible for method resolution
        System.out.println("base static method");
    }
    void printMessage1() {											// JVM responsible for method resolution 
    	System.out.println("base instance method--------------");
    }
}
class ChildMethodClass extends BaseMethodClass {

    public static void printMessage() {
        System.out.println("child static method");
    }
    void printMessage1() {											// cannot reduce visibility of method using access modifier 
    	super.printMessage1();
    	System.out.println("child instance method------------");
    	super.printMessage1();
    }
}  
public class MethodHiding{
	public static void main(String args[]) {
		BaseMethodClass b = new ChildMethodClass();
		//ChildMethodClass c= new ChildMethodClass();
		//c.printMessage();
		//b.printMessage();
		b.printMessage1();
		
	}  
}  