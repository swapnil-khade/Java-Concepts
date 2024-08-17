package com.java.javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {

		int [] num1 = {1,2,3,4,5};
		int [] num2 = {2,4,1,3,5};
		
		Map<Integer,Integer> map2 = new LinkedHashMap<>();
		
		for(int i = 0; i<num2.length; i++) {
			map2.put(num2[i], i);
		}
		
		map2.forEach((k,v) -> System.out.println(k+" : "+v));
		
		Map<Integer,Integer> map1 = new LinkedHashMap<>();
		
		for(int i = 0; i<num1.length; i++) {
			if(map2.containsKey(num1[i])) {
				map1.put(num1[i], map2.get(num1[i]));
			}
		}
		map1.forEach((k,v) -> System.out.println(k+" : "+v));
	}

}
