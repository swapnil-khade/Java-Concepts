package com.java.interfaces;

interface Marker{
	
}

class Demo implements Marker{
	void show() {
		System.out.println("Inside demo.");
	}
}
public class MarkerInterface {

	public static void main(String[] args) {

		Demo m = new Demo();
		if(m instanceof Marker)
			m.show();
		else
			System.out.println("Not an instance of Marker");
	}

}
