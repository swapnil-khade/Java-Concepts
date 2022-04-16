package com.java.interfaces;

//Java program to illustrate Cloneable interface
import java.lang.Cloneable;

//By implementing Cloneable interface
//we make sure that instances of class A
//can be cloned.
class A implements Cloneable
{
	int i;
	String s;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	// A class constructor
	public A(int i,String s)
	{
		this.i = i;
		this.s = s;
	}
	public A(A a) {														// copy constructor
		this.i=a.i;
		this.s=a.s;
	}

	// Overriding clone() method
	// by simply calling Object class
	// clone() method.
	@Override
	protected Object clone() 	throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class CloneableInterface
{
	public static void main(String[] args)		throws CloneNotSupportedException
	{
		A obj = new A(20, "GeeksForGeeks");
		
		A obj1 = obj;								// shallow copy

		A obj2 = new A();							// deep copy
		obj2.i = obj.i;
		obj2.s = obj.s;
		
		A obj3 = new A(obj);						// copy constructor for deep copy
		obj3.i = 12;
		System.out.println(obj3.i);
		System.out.println(obj3.s);
		
		System.out.println("-----------------------");
		
		A b = (A)obj.clone();						// object cloning

		System.out.println(b.i);
		System.out.println(b.s);
	}
}
