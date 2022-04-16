package com.java.interfaces;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class A1 implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.print(t);
		
	}
	
}

public class ConsumerInterface {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		Consumer<Integer> c = new  A1();
		values.forEach(c);
		
		values.forEach(i->System.out.print(i));
		
		for (long integer : values) {
			System.out.print(integer);
		}
	}

}
