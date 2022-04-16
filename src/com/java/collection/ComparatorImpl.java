package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImpl {

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
	students1Data.add(new Student(152,"Vv1", "a1@mail.com" ,"M"));
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

	}

	
}
