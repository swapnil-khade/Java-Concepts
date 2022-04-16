package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;


public class SetImpl {

	//hashset ---> hashmap with value									duplicate elements are not allowed. order is not fixed.
	//linkedhashset --. linkedhashmap..
	
	//num & 16 --> 0 to 15 --> 0 bucket --> 15 num ka
	
	public static void main(String[] args) {
			
		Student s1 = new Student(1,"v", "a1@mail.com" ,"M");	
		Student s2 = new Student(2,"AAsAA1", "a2@mail.com" ,"M");
		Student s3 = new Student(3,"xAAAA1", "a1@mail.com" ,"M");	
		Student s4 = new Student(4,"4", "a3@mail.com" ,"M");
		Student s5 = null;
		Student s6 = new Student(6,"yAAAA1", "a1@mail.com" ,"M");
		Student s7 = new Student(7,"AAA4A1", "a1@mail.com" ,"M");	
		Student s8 = new Student(8,"3", "a6@mail.com" ,"M");
		Student s9 = null;
		Student s10 = null;
		Student s11= null;
		Student s12 = s1;
		
		
		//s1 s2 s3  s4  s5  s7 s8
		HashSet<Student> studentData = new HashSet<Student>();
		studentData.add(s1);
		studentData.add(s2);
		studentData.add(s3);
		studentData.add(s4);
		studentData.add(s5);
		studentData.add(s6);
		studentData.add(s7);
		studentData.add(s8);
		studentData.add(s9);
		studentData.add(s10);
		studentData.add(s11);
		studentData.add(s12);
		
		System.out.println("Using HashSet"+studentData);
		System.out.println(studentData.size());
		
		
		LinkedHashSet<Student> studentData2 = new LinkedHashSet<Student>();
		studentData2.add(s1);
		studentData2.add(s2);
		studentData2.add(s3);
		studentData2.add(s4);
		studentData2.add(s5);
		studentData2.add(s6);
		studentData2.add(s7);
		studentData2.add(s8);
		studentData2.add(s9);
		studentData2.add(s10);
		studentData2.add(s11);
		studentData2.add(s12);
		
		System.out.println("Using LinkedHashSet"+studentData2);
		System.out.println(studentData2.size());

		
		// No SEQ  ---> Only Unique and Single Null 
		// No Seq/Order --> but unique + single Null
		HashSet<Integer> number1 = new HashSet<Integer>();
		number1.add(10);
		number1.add(10);
		number1.add(-10);
		number1.add(null);
		number1.add(null);
		number1.add(null);
		number1.add(1909);
		number1.add(1320);
	//	number1.add("10");
	//	number1.add("10");
		System.out.println("HashSet"+number1);
		
		
		//In a Seq but not in Order --> ASC/DESC
		LinkedHashSet<Integer> number2 = new LinkedHashSet<Integer>();
		number2.add(10);
		number2.add(10);
		number2.add(-10);
		number2.add(null);
		number2.add(null);
		number2.add(null);
		number2.add(1909);
		number2.add(1320);
		System.out.println("LinkedHashSet"+number2);
	
			
	}
}
