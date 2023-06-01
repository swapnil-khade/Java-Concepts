package com.java.model;

import java.util.Optional;

public class Employee {
	
	private int id;
	
	private String name;

	public Employee() {
		
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Optional<String> getName() {											//Optional return Type
		return Optional.ofNullable(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "\n Employee [id=" + id + ", name=" + name + "]";
	}
	

}
