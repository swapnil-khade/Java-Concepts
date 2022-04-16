package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Container<T extends Number>{								// T must be a class which extends Number
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public void show() {
		System.out.println(value.getClass().getName());
	}
	public void demo(ArrayList<? extends T> obj) {
		
	}
}

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container<Number> val = new Container<>();
		val.value=12;
		val.show();
		val.demo(new ArrayList<Integer>());
		val.demo(new ArrayList<Float>());
		
		Collection values = new ArrayList();
		values.add(12);
		values.add(122);
		values.add(120);
		values.add(127);

		Iterator i = values.iterator();							// Using Iterator
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
