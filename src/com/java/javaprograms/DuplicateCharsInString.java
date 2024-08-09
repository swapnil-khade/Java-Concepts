package com.java.javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DuplicateCharsInString {

	public static void main(String[] args) {

		String input = "JavaJBavaEE";
		
		char[] charArray1 = input.toCharArray();
		
		

        // convert string into stream
		Map < Character, Long > result = input
	            .chars().mapToObj(c -> (char) c)
	            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((k, v) -> {
            if (v >= 1) {
                System.out.println(k + " : " + v);
            }
        });
        
        System.out.println("******************");
        /////////////////////////////////////////////
        
     // given input string
        String input1 = "JavaJavaEEcbgfcffff";

        // create a HashMap
        Map < Character, Integer > countDuplicateMap = new HashMap < > ();

        // Converts this string to a new character array.
        char[] charArray = input1.toCharArray();

        for (char c: charArray) {

            if (countDuplicateMap.containsKey(c)) {

                // get value by key and increment it's value by a
                countDuplicateMap.put(c, countDuplicateMap.get(c) + 1);
            } else {
                countDuplicateMap.put(c, 1);
            }
        }


        for (Entry< Character, Integer > entry: countDuplicateMap.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
	}

}
