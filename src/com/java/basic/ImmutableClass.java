package com.java.basic;

class Engine{
	int maxTorque;

	public Engine(int maxTorque) {
		super();
		this.maxTorque = maxTorque;
	}

	
	public int getMaxTorque() {
		return maxTorque;
	}


	public void setMaxTorque(int maxTorque) {
		this.maxTorque = maxTorque;
	}


	@Override
	public String toString() {
		return "Engine [maxTorque=" + maxTorque + "]";			// Easy to test, automatically thread safe, no synchronization issue
	}
	
}

final class Car1{												// Make class final
	private final int maxSpeed;									// Make variables as private final	
	private final int price;									// No setter methods
	private final Engine engine;								// Make deep copy for objects
	
	private Car1(int maxSpeed, int price, Engine en) {			// Make Constructor private
		super();
		this.maxSpeed = maxSpeed;
		this.price = price;
		this.engine = new Engine(en.getMaxTorque());
		//this.engine = engine;									// this is shallow copy
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getPrice() {
		return price;
	}
	public Engine getEngine() {
		//return engine;
		return new Engine(engine.getMaxTorque());				//a new Engine object, with content copied to it, should be returned.
	}

	@Override
	public String toString() {
		return "Car1 [maxSpeed=" + maxSpeed + ", price=" + price + ", engine=" + engine + "]";
	}
	
	public static Car1 createInstance(int maxSpeed, int price, Engine engine) {				//Factory method to store object creation logic
		return new Car1(maxSpeed, price, engine);	
	}
	
	
}
public class ImmutableClass {
	public static void main(String[] args) {
		Engine en = new Engine(800);
		Car1 c = Car1.createInstance(90, 400000, en);
		System.out.println(c);
		en.maxTorque=900;
		System.out.println(c+" "+en);
		c.getEngine().setMaxTorque(500);
		
	}

}
