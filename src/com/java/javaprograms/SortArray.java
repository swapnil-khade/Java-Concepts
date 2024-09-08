package com.java.javaprograms;

public class SortArray {

	public static void main(String[] args) {

		int[] array = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
		
		int temp = 0;
		for(int i = 0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}				
			}
			System.out.println(array[i]);
		}
		
		
	}

}
