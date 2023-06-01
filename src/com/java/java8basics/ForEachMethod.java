package com.java.java8basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		for (Integer integer : list) {								//enhanced for loop
			System.out.print(integer+" ");
		}

		System.out.println("-------------");
		list.forEach(i->System.out.print(i+" "));					//internal for loop   forEach() method takes object Consumer interface

		list.forEach(System.out::println);
		
		System.out.println("-------------");
		Consumer<Integer> c = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.print(t+" ");
			}
		};
		list.forEach(c);
		
		Boolean b = Boolean.parseBoolean("TRUE");
		System.out.println(b);
		
	}
}