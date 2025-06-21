package com.java.basic;

public record Employee1(int id, String name, String dpt, int salary) {

	@Override
	public String toString() {
		return "\n [id=" + id + ", name=" + name + ", dpt=" + dpt + ", salary=" + salary + "]";
	}
	
	

}
