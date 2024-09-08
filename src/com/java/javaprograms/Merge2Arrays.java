package com.java.javaprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Merge2Arrays {

	public static void main(String[] args) {

		int[] arr1 = {4,5,13,22};
		int[] arr2 = {0,9,3,7,12,11};
		
		int[] arr3 = new int[arr1.length+arr2.length];
		int k = 0;
		for(int i = 0; i<arr1.length; i++) {
			arr3[k] = arr1[i];
			k++;
		}
		
		for(int i = 0; i<arr2.length; i++) {
			arr3[k] = arr2[i];
			k++;
		}
		Arrays.sort(arr3);
		for(int v : arr3) {
			System.out.println(v);
		}
		
		Arrays.asList(arr1).stream();
		
		int [] arr12 = {1,2,5,4,3,6};

		List<Integer> list = Arrays.stream(arr12)
				.mapToObj( c -> (int) c)
				.collect(Collectors.toList());
				
		Collections.sort(list);

		System.out.println(list.get(1));
	}

}
