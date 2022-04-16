package com.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapImpl {

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
		
		
		HashMap<Student,String> studentData1 = new HashMap<Student, String>();
		studentData1.put(s1,"V1");			//s1-v10
		studentData1.put(s2,"V2");			//s2-v2
		studentData1.put(s3,"V3");			//s3-v6
		studentData1.put(s4,"V4");			//s4-v4
		studentData1.put(s5,"V5");			//s5-v9
		studentData1.put(s6,"V6");			
		studentData1.put(s7,"V7");			//s7-v7
		studentData1.put(s8,"V8");			//s8 v8
		studentData1.put(s9,"V9");		
		
		studentData1.put(s2,"V22");			//s2-v2
		studentData1.put(s3,"V33");	
		System.out.println(studentData1);
		System.out.println(studentData1.size());
		System.out.println("----------------------------------------------");
		
		Set<Student> keys = studentData1.keySet();										// to get all keys
		
		for (Student key : keys) {
			System.out.println("using for loop: "+studentData1.get(key));
		}
		
		System.out.println("----------------------------------------------");
		
		Set<Map.Entry<Student, String>> values = studentData1.entrySet();				// Map interface has Entry interface inside
		
		for (Map.Entry<Student, String> entry : values) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}

}
