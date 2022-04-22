package com.java.javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class StringReverse {
	public static void main(String[] args) {
		
		String s="Maverick";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		System.out.println("Using for loop: "+s1);									// Using for loop
		System.out.println();
		//-------------------------------------------
		
		StringBuilder s2 = new StringBuilder("Maverick");
		System.out.println("Using String builder: "+s2.reverse());					// String builder
		System.out.println();
		
		StringBuffer s4 = new StringBuffer("Maverick");
		System.out.println("Using String buffer: "+s4.reverse());					// String buffer
		System.out.println();
		
		
		String s3 = "Maverick";														// toCharArray
		char[] c = s3.toCharArray();
		System.out.println("Using toCharArray: ");
		for (int i=c.length-1; i>=0;i--) {
			System.out.print(c[i]);
		}
		System.out.println();
		System.out.println();
		
		String s5 = "ArrayList";													// ArrayList
		char[] c1 = s5.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (Character character : c1) {
			list.add(character);
		}
		Collections.reverse(list);
		System.out.println(list);
		
		ListIterator li = list.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next());
		}
		System.out.println();
		System.out.println();
		
		String s6 = "Stack";														// Stack
		String s61="";
		char[] c2 = s6.toCharArray();
		Stack<Character> st = new Stack<Character>();
		for (Character character : c2) {
			st.push(character);
		}
		while(!st.isEmpty()) {
			s61=s61+st.pop();
		}
		System.out.println("Using stack: "+s61);
		System.out.println();
	}

}
