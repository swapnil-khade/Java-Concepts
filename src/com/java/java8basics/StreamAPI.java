package com.java.java8basics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Product{
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class StreamAPI {

	static List<Product> productList = new ArrayList<Product>();
	

	public static void main(String[] args) {

		productList.add(new Product(1, "HP", 35499));
		productList.add(new Product(2, "Sony", 25000));
		productList.add(new Product(3, "Dell", 15000));
		productList.add(new Product(4, "Lenovo", 25000));
		productList.add(new Product(5, "HP", 35000));
		productList.add(new Product(6, "Sony", 55000));
		productList.add(new Product(7, "Macbook", 85000));	
		
		Stream<Product> productStream = productList.stream();			// create stream
		Stream<Product> productStream1 = productList.parallelStream();			// create stream
 
		Predicate<Product> p = new Predicate<Product>() {
			
			@Override
			public boolean test(Product t) {
				// TODO Auto-generated method stub
				return t.id>3;
			}
		}; 
		
		Function<Product, Integer> f = new Function<Product, Integer>() {
			
			@Override
			public Integer apply(Product t) {
				// TODO Auto-generated method stub
				return t.price+500;
			}
		};
		BinaryOperator<Product> bo = new BinaryOperator<Product>() {
			
			@Override
			public Product apply(Product t, Product u) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		productList.stream()
					//.map(f)											// map takes object of Function 
				    
					.filter(p)   // filter(t->t.id>3) 					// filter takes object of Predicate which returns boolean
				    
				    .map(f)      // map(t->t.price+500)
				    .forEach(i->System.out.println(i));					// forEach takes object of Consumer
		
	}

}
