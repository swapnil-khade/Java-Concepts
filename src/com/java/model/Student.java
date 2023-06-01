package com.java.model;

import java.util.List;
import java.util.Optional;

public class Student {
	
	private String name;
	
	private List<String> phoneNumbers;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, List<String> phoneNumbers) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}

	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<List<String>> getPhoneNumbers() {
		return Optional.ofNullable(phoneNumbers);
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phoneNumbers=" + phoneNumbers + "]";
	}
}
