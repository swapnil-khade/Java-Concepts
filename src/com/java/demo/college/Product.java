package com.java.demo.college;

public class Product {
	private int prodId;
	private String prodName;
	private double prodPrice;
	private int prodQty;
	private String prodVendor;
	
	public Product(int prodId, String prodName, double prodPrice, int prodQty, String prodVendor) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
		this.prodVendor = prodVendor;
	}
	
	// object properties clone karto.
	public Product(Product p1) {
		this.prodId = p1.prodId;
		this.prodName = p1.prodName;
		this.prodPrice = p1.prodPrice;
		this.prodQty = p1.prodQty;
		this.prodVendor = p1.prodVendor;
	}

	
	
	/// object chec contents
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodQty="
				+ prodQty + ", prodVendor=" + prodVendor + "]";
	}

	public static void main(String[] args) {
		Product p1  = new Product(101,"Mobile",12892.33,283,"Flipkart");
		Product p2 = new Product(p1);										// using copy constructor
		Product p3 = new Product(p1);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		//Constructors can be overloaded
				// cannot be overriden.
	}
	
	
	
}
