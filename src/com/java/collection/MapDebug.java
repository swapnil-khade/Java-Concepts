package com.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <String, Integer> values = new HashMap<String, Integer>();
		String s="a";
		System.out.println(s.hashCode());
		values.put("null", 10);
		values.put("a", 11);
		values.put("b", 12);
		values.put("c", 13);
		values.put("d", 14);
		values.put("e", 15);
		values.put("f", 16);
		
		Set<String> keys = values.keySet();
		
		for (String key : keys) {
			System.out.println(key +" : "+values.get(key));
		}
		
		Set<Map.Entry<String, Integer>> entry = values.entrySet();
		
		System.out.println("------------------------");
		
		for (Map.Entry<String, Integer> entry2 : entry) {
			System.out.println(entry2.getKey()+" : "+entry2.getValue());
		}

	}

}
