package com.java.basic;

class BaseMethodClass {

    public static void printMessage() {								// Compiler responsible for method resolution
        System.out.println("base static method");
    }
    void printMessage1(Integer i) throws Exception {											// JVM responsible for method resolution 
    	System.out.println("base instance method--------------");
    }
}
class ChildMethodClass extends BaseMethodClass {					// exception is also considered

    public static void printMessage() {
        System.out.println("child static method");
    }
    void printMessage1(int i) throws Exception {											// cannot reduce visibility of method using access modifier 
    	super.printMessage1(new Integer(12));
    	System.out.println("child instance method------------");
    	super.printMessage1(new Integer(12));
    }
}  
public class MethodHiding{
	public static void main(String args[]) {
		BaseMethodClass b = new ChildMethodClass();
		//ChildMethodClass c = (ChildMethodClass) new BaseMethodClass();			// cast 
		//ChildMethodClass c= new ChildMethodClass();
		//c.printMessage();
		//b.printMessage();
		try {
			int a=2;
			b.printMessage1(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}  
}  