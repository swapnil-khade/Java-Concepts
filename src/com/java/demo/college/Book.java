package com.java.demo.college;

public class Book {
	
	private int bookId;
	private String bookName;
	private double bookPrice;
	
	public Book(Book bk) {		// Copy Constructor --> but this is parameteried
		// object clone karnyasathi.
	}
	
	private Book(int bookId, String bookName, double bookPrice) {		// param constructor
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

/*
 * 1. default
 * 2  no-arg
 * 3. param
 * 
 * 1 --> kadhich  2 and 3 sbt nh yet
 * 2 and 3 --> sbt yeu shktata
 * 
 * 22	--> kadhich possible nah
 * 333333* -- param change --. overload
 * 
 */



	//developer can never add -- default constructor
			// we can simply add -->  no-arg/param constructor
	public static void main(String[] args) {
		//Book b1 = new Book();	// default		--> NoArg
	}
}
