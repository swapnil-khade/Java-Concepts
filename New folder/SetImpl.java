package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class SetImpl {

	//hashset ---> hashmap with value
	//linkedhashset --. linkedhashmap..
	
	//num & 16 --> 0 to 15 --> 0 bucket --> 15 num ka
	
	public static void main(String[] args) {
		
		
		Comparator<Student> idSort = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getStudId() - o2.getStudId();
			}
		};
		
		Comparator<Student> emailSort = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getStudEmail().compareTo(o2.getStudEmail());
			}
		};
		
		
		Comparator<Student> idNName = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int temp = o1.getStudId() - o2.getStudId();
				if (temp==0) {
					temp = o1.getStudName().compareTo(o2.getStudName());
					if(temp == 0) {
						// email cha
							if(temp==0) {
								//gender
							}
					}
				}
				return temp;
			}
		};
		
		
		List<Student> students1Data = new ArrayList<Student>();
		students1Data.add(new Student(1501,"Vv1", "a1@mail.com" ,"M"));
		students1Data.add(new Student(151,"4v1", "a3@mail.com" ,"F"));
		
		
		students1Data.add(new Student(101,"Z31", "4a1@mail.com" ,"M"));
		students1Data.add(new Student(501,"T51", "5a1@mail.com" ,"M"));
		students1Data.add(new Student(501,"Fv1", "a61@mail.com" ,"F"));
		students1Data.add(new Student(101,"v31", "a31@mail.com" ,"F"));
		
		
		
		
		System.out.println("Without sort "+students1Data);
		Collections.sort(students1Data,idSort);
		System.out.println("ID sort "+students1Data);
		Collections.sort(students1Data,emailSort);
		System.out.println("Email sort "+students1Data);
		Collections.sort(students1Data,idNName);
		System.out.println("ID and Name sort "+students1Data);
		
		System.exit(0);
		System.out.println("Before Sort : "+students1Data);
		Collections.sort(students1Data);
		System.out.println("After Sort : "+students1Data);

		System.exit(0);
		
		
		//sort it
		
		//asc -->Ve  --> swap
		//List<Integer> List<Integer>
		
		
		
		//Hashcode/equals -- Use nah karta- --> hashtable ds nah hai
		// instead - balanced --> Comparable or comparator
		TreeSet<Integer> numbs = new TreeSet<Integer>();
		numbs.add(10);
		numbs.add(130);
		numbs.add(610);
		numbs.add(160);
		numbs.add(170);
		numbs.add(108);
			numbs.add(108);
			numbs.add(108);
		numbs.add(1408);
		numbs.add(1508);
		
		System.out.println(numbs.size());
		System.out.println(numbs);
		
		
		
		TreeSet<Student> studentsTree = new TreeSet<Student>();
		studentsTree.add(new Student(1501,"v1", "a1@mail.com" ,"M"));
		studentsTree.add(new Student(12501,"v2", "a1@mail.com" ,"F"));
		studentsTree.add(new Student(15031,"v3", "a1@mail.com" ,"F"));
		studentsTree.add(new Student(15401,"v4", "a1@mail.com" ,"M"));
		studentsTree.add(new Student(15501,"v4", "a1@mail.com" ,"M"));
		
		System.out.println(studentsTree.size());
		System.out.println(studentsTree);
		
		System.exit(0);
		
		
		for(int i=0;i<10;i++) {
			System.out.println(ThreadLocalRandom.current().nextInt(1, 1000));
		}
		System.exit(0);
		
		Student s1 = new Student(1501,"v", "a1@mail.com" ,"M");	
		Student s2 = new Student(101,"AAsAA1", "a2@mail.com" ,"M");
						Student s3 = new Student(101,"xAAAA1", "a1@mail.com" ,"M");	
		Student s4 = new Student(1041,"4", "a3@mail.com" ,"M");
		Student s5 = null;
						Student s6 = new Student(101,"yAAAA1", "a1@mail.com" ,"M");
		Student s7 = new Student(16012,"AAA4A1", "a1@mail.com" ,"M");	
		Student s8 = new Student(101,"3", "a6@mail.com" ,"M");
						Student s9 = null;
						Student s10 = s1;
		
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
		
		System.out.println(studentData);
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
		
		System.out.println(studentData2);
		System.out.println(studentData2.size());
		
		System.exit(0);
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
				studentData1.put(s10,"V10");
		studentData1.put(s2,"V22");			//s2-v2
		studentData1.put(s3,"V33");	
		System.out.println(studentData1);
		System.out.println(studentData1.size());
		
		
		System.exit(0);
		
		
		
		
		
		studentData.add(new Student(101,"AAAA1", "a1@mail.com" ,"M"));
		studentData.add(new Student(1021,"AAAA2", "a2@mail.com" ,"F"));
		studentData.add(new Student(1301,"AAAA3", "a3@mail.com" ,"F"));
		studentData.add(new Student(1041,"AAAA4", "a4@mail.com" ,"M"));
		studentData.add(new Student(1501,"AAAA5", "a5@mail.com" ,"M"));
		
			studentData.add(new Student(101,"AAAA1", "a2@mail.com" ,"M"));
			studentData.add(new Student(101,"AAAA1", "a3@mail.com" ,"M"));
		
		System.out.println(studentData.size());
		System.out.println(studentData);
		System.exit(0);
		
	
		/**
		 * 1 --> same ch yeil 
		 * 2 --> diff ch asel --> Always True	
		 * 					hashcode is diff			s1 --> 101  		%5 -->1
		 * 												s1 --> 1003			%5  --> 1
		 * 							1. bucket same
		 * 							2. bucket diff
		 * 							
		 *		5 
		 * 
		 */
		
		System.out.println(studentData);
		
		
		HashSet<Integer> num = new HashSet<Integer>();
		num.add(10);
		num.add(10);
		
		
		HashSet<String> num1 = new HashSet<String>();
		num1.add("A");
		num1.add("A");
		
		
		HashSet<StringBuffer> num2 = new HashSet<StringBuffer>();
		num2.add(new StringBuffer("A"));
		num2.add(new StringBuffer("A"));
		
		System.out.println("STBUffer --"+num2);
		System.out.println(num1);
		System.out.println("------------------------");
		System.out.println("Number1 " +num);
		
		System.out.println("String " +num1);
		System.exit(0);
		
		// No SEQ  ---> Only Unique and Single Null 
		// No Seq/Order --> but unique + single Null
		HashSet<Integer> number1 = new HashSet<Integer>();
		number1.add(10);
			number1.add(10);
		number1.add(-10);
		number1.add(null);
		number1.add(1909);
		number1.add(1320);
	//	number1.add("10");
	//	number1.add("10");
		System.out.println(number1);
		
		
		//In a Seq but not in Order --> ASC/DESC
		LinkedHashSet<Integer> number2 = new LinkedHashSet<Integer>();
		number2.add(10);
		number2.add(10);
		number2.add(-10);
		number2.add(null);
		number2.add(1909);
		number2.add(1320);
		System.out.println(number2);
	
		//ORDER --> ASC/DESC
		TreeSet<Integer> number3 = new TreeSet<Integer>();
		number3.add(10);
		number3.add(10);
		number3.add(-10);
		//number3.add(null);
		number3.add(1909);
		number3.add(1320);
		System.out.println(number3);
		
		
		
		
	}
}
