package com.java.model;

import java.util.List;

public class Department {

	private int id;
	private String dptName;
	List<Employee> emp;
	public Department() {
		super();
	}
	public Department(int id, String dptName, List<Employee> emp) {
		super();
		this.id = id;
		this.dptName = dptName;
		this.emp = emp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDptName() {
		return dptName;
	}
	public void setDptName(String dptName) {
		this.dptName = dptName;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "\n Department [id=" + id + ", dptName=" + dptName + ", emp=" + emp + "]";
	}	
}
