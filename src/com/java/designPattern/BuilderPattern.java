package com.java.designPattern;

public class BuilderPattern {

	public static void main(String[] args) {

		Phone p = new Phone(101, "Apple");
		System.out.println(p);
		
		Phone p2 = new PhoneBuilder().setId(102).build();
		System.out.println(p2);
		
		
	}

}

class Phone{
	
	private int id;
	private String brandName;
	
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Phone(int id, String brandName) {
		super();
		this.id = id;
		this.brandName = brandName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	@Override
	public String toString() {
		return "Phone [id=" + id + ", brandName=" + brandName + "]";
	}
}

class PhoneBuilder{
	private int id;
	private String brandName;
	
	public PhoneBuilder setId(int id) {												// only setters
		this.id = id;
		return this;																// return this
	}
	public PhoneBuilder setBrandName(String brandName) {
		this.brandName = brandName;
		return this;
	}

	public Phone build() {															// return instance
		return new Phone(id, brandName);
	}
}