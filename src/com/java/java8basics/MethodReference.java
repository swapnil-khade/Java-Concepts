package com.java.java8basics;

import java.util.List;
import java.util.stream.Collectors;



public class MethodReference {
	
	static void  display(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodReference m = new MethodReference();
		List<String> strList = List.of("Java","Python","GoLang");
		strList.forEach(MethodReference::display);							//Method Reference
		
		strList.stream()
				.map(mapper -> new Student(mapper))
				.collect(Collectors.toList())
				.forEach(x->System.out.println(x));
		
		strList.stream()
				.map(Student::new)											//Constructor Reference
				.collect(Collectors.toList())
				.forEach(x->System.out.println(x));
	}

}


class Student{
	private String name;
	
	public Student() {
		
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}	
	
}