package com.java;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetImpl {

	
	
	//Collection -- Complete --> except -- Queue -- [Multithreading mein...]
	
	public static void main(String[] args) {
		Comparator<Integer> viter = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -(o1-o2);
			}
		};
		
		TreeSet<Integer> values =new TreeSet<Integer>();		// TreeMap<Key,Value>
		values.add(192);
		values.add(12);
		values.add(92);
		values.add(122);
		values.add(1222);
		values.add(88);
		values.add(50);
		values.add(921);
		
		System.out.println(values);
		
		System.out.println(values.ceiling(50));// >=
		System.out.println(values.ceiling(51));	// >=
		System.out.println(values.floor(50));	// <=
		System.out.println(values.floor(51));	// <=
		System.out.println(values.higher(50));	// >
		System.out.println(values.higher(51));	// >
		
		System.out.println(values.lower(50));	// <
		System.out.println(values.lower(51));	// <
		
		System.out.println(values.headSet(50));	
		System.out.println(values.headSet(51));
		System.out.println(values.tailSet(50));
		System.out.println(values.tailSet(51));
		System.out.println(values.subSet(50,122));
		System.out.println(values.subSet(50,123));
		
		
		System.exit(0);
		
		
		
		
		Comparator<Book> priceComparator = new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return (int) (o1.getBookPrice() - o2.getBookPrice());
			}
		};
		
		
		
		TreeSet<Book> books =new TreeSet<Book>(priceComparator);	// if we pass comparator-- then comparable will not be considered
		books.add(new Book(111,"Spring3",27,129.23));
		books.add(new Book(311,"Spring4",23,122.23));
		books.add(new Book(41,"Spring3",43,1249.23));
		books.add(new Book(11,"Spring2",63,612.23));
		books.add(new Book(1,"Spring1",2,1297.23));
		
		System.out.println(books); // it wont works --reason - where is the comparable ???
		
		books.floor(new Book(1111,"Java", 239, 1000.0));
		
	
		
	}
}


class Book implements Comparable<Book>{
	private int bookId;
	private String bookName;
	private int bookQty;
	private double bookPrice;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookId != other.bookId)
			return false;
		return true;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName, int bookQty, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookQty = bookQty;
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "\n [bookId=" + bookId + ", bookName=" + bookName + ", bookQty=" + bookQty + ", bookPrice=" + bookPrice
				+ "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookQty() {
		return bookQty;
	}
	public void setBookQty(int bookQty) {
		this.bookQty = bookQty;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public int compareTo(Book o) {
		return (this.bookId - o.getBookId());
	}
	
	
	
	
}