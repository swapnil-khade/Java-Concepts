package com.java.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RepeatingElementInArray {

	public static void main(String[] args) {


		String str = "Java";	
		
		Map<Character , Long> map1 = str.chars()
											.mapToObj(c -> (char) c)
											.map(c -> Character.toLowerCase(c))
											.filter(c -> !Character.isSpaceChar(c))
											.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map1.forEach((k,v) -> System.out.println(k+" : "+v));
		
		
		int[] arr = {3,2,4,3,2,2,2,5,5,5,5,5,5,5,5};	
		LinkedHashMap<Integer, Long> collect = Arrays.stream(arr)
											//.mapToObj(c ->  (int) c)
											.boxed()
											.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		
		
		
		long max = Collections.max(collect.values());		
		collect.forEach((k,v) -> {if(v == max) {
			System.out.println(k);
		}});
		
				
		
		String[] str1 = {"Mango","Apple","Mango",  "Banana", "Apple"};
		
																			List<String> asList = Arrays.asList(str1);
		
		Map<String, Long> collect2 = Arrays.stream(str1)
											.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect2.forEach((k,v) -> System.out.println(k+" : "+v));
		
		
		String sentence = "alex brian charles alex charles david eric david";
		
		Map<String, Long> collect3 = Arrays.stream(sentence.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect3.forEach((k,v) -> System.out.println(k+" : "+v));
		
		
		Map<String, Long> result = Arrays.stream(str1)
							                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
							                .entrySet()
							                .stream()
							                .filter(s -> s.getValue() < 2)
							                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
									
		result.forEach((k,v) -> System.out.println(k+" : "+v));
		
		String strng = Arrays.stream(str1)
								.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
								.entrySet()
								.stream()
								.filter(s -> s.getValue() < 2)
								.map(entry -> entry.getKey())             
								.findFirst()
								.get();   
		
		
		List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 6, 6, 7, 2);
		//Collections.reverseOrder(numbers);
		System.out.println("------------------");
        Optional<Integer> secondLargest = numbers.stream()
                .distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort the stream in descending order
                .skip(1) // Skip the largest number
                .findFirst(); // Find the second largest number
        System.out.println(secondLargest);
        
        numbers.stream().sorted().collect(Collectors.toList());
        
        numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        System.out.println(numbers.stream()											// limit
				.limit(3)
				.collect(Collectors.toList()));	

		System.out.println(numbers.stream()											// skip
				.skip(3)
				.collect(Collectors.toList()));	
				
		System.out.println(numbers.stream()											// sum
				.mapToInt(i -> i)
				.sum());	
	}

}