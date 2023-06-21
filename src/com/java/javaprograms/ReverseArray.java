package com.java.javaprograms;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6};
		int start = 0;
		int end = a.length-1;
		reverseArray(a,start,end);
		for(int s:a) {
			System.out.print(s+" ");
		}
		
	}
	
	static int[] reverseArray(int a[], int start,int end) {
		int temp = 0;
		while(start<end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
		return a;
	}

}
