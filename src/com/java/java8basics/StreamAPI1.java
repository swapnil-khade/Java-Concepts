package com.java.java8basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,3,3,3,4,5,6,7,8,9);
		
		Stream<Integer> stream = list.stream();
		Stream<Integer> stream1 = list.parallelStream();
		
		Function<Integer, Integer> f = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*2;
			}																		//distinct
		};
		stream.distinct().map(f).forEach(i->System.out.print(i+" "));	  			// map takes object of Function
		
		System.out.println();
		System.out.println("--------------");
		
		Predicate<Integer> p = new Predicate<Integer>() {							// forEach takes object of Consumer
			
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t>4;
			}
		};
		list.stream().filter(p).forEach(i->System.out.print(i+" "));				// filter takes object of Predicate
	
		System.out.println();
		System.out.println("--------------");
		
		BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
		};
		System.out.println(list.stream().reduce(bo));								// reduce takes object of BinaryOperator returns Optional
		System.out.println(list.stream().reduce((t,u)->t+u));								
		System.out.println(list.stream().reduce(10,(t,u)->t+u));	
		System.out.println(list.stream().reduce(10,(t,u)->Integer.sum(t, u)));	
		System.out.println(list.stream().reduce(10,Integer::sum));		

		System.out.println("--------------");
		
		System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));		

		System.out.println("find first         =  "+list.stream().filter(i->i%2==0).findFirst().get());		

		System.out.println(list.stream()
								.filter(i->i%2==0)
								.findFirst()
								.orElse(125));	
		
		System.out.println(list.stream()
				.filter(i->i%3==0)
				.findAny()
				.orElse(125));

		
			
		System.out.println(list.stream()
				.filter(i->i%2==0)
				.collect(Collectors.toList()));										// store in collection 
		
		System.out.println("--------------");
		Supplier<Double> s = new Supplier<Double>() {

			@Override
			public Double get() {
				// TODO Auto-generated method stub
				return  Math.random();
			}
		};
		Supplier<Double> s1 = ()-> {return  Math.random();};
		Supplier<Double> s2 = ()->   23.3;
		
		System.out.println(s.get());
		
		System.out.println("--------------");
		
		System.out.println(list.stream()											// limit
				.limit(3)
				.collect(Collectors.toList()));	

		System.out.println(list.stream()											// skip
				.skip(3)
				.collect(Collectors.toList()));	
		
		System.out.println("--------------");
		
		System.out.println(list.stream()											// anyMatch
				.anyMatch(p));	
		
		System.out.println(list.stream()											// allMatch
				.allMatch(i->i<20));	
		
		System.out.println(list.stream()											// noneMatch
				.noneMatch(i->i>30));	


	}
}