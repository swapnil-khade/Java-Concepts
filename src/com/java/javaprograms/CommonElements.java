package com.java.javaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElements {
	
	public static void main(String args[]) {
		
		List<Integer> list1 = List.of(1,2,3,4);
		List<Integer> list2 = List.of(1,2,3);
		List<Integer> list3 = List.of(1,2,3);
		
		Map<Integer,Integer> map = new HashMap<>();
		
		list1.forEach(i -> map.put(i, 1));
		
		
		list2.forEach(i -> {
			if(map.containsKey(i) && map.get(i) == 1) {
				map.put(i,2);
			}
		});
		
		list3.forEach(i -> {
			if(map.containsKey(i) && map.get(i) == 2) {
				map.put(i,3);
			}
		});
		
//		map.forEach((i,j) -> {
//			if(map.containsValue(3))
//				System.out.println(i+" ");
//		});
		
		ArrayList<Integer> commonElements = new ArrayList<>();
		for (int ele : map.keySet()) {
			if (map.get(ele) == 3)
            commonElements.add(ele);
		}
		
		commonElements.forEach(i -> System.out.println(i));
	}

}
