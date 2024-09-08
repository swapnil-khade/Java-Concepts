package com.java.java8basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.model.Employee;
import com.java.model.Product;
import com.java.model.Student;

public class StreamAPI {
	
	static List<Product> productList = new ArrayList<Product>();
	static List<Product> productList1 = new ArrayList<Product>();

	static List<Student> studentList = new ArrayList<>();
	
	public static void main(String[] args) {
		


		boolean add = productList.add(new Product(1, "HP", 35499));
		productList.add(new Product(2, "Sony", 25000));
		productList.add(new Product(3, "Dell", 15000));
		productList.add(new Product(4, "Lenovo", 25000));
		productList.add(new Product(5, "HP", 35000));
		productList.add(new Product(6, "Sony", 55000));
		productList.add(new Product(7, "Macbook", 85000));	
		productList.add(new Product(7, null, 85000));	
		
		studentList.add(new Student("Maya",    Arrays.asList("1111","2222")));
		studentList.add(new Student("Maya",    Arrays.asList("1111","2222")));
		studentList.add(new Student("Maya",    Arrays.asList("1111","2222")));
		studentList.add(new Student("Swapnil", Arrays.asList("3333","4444")));
		studentList.add(new Student("Arav",    Arrays.asList("5555","6666")));
		
		Map<String, Long> collect3 = studentList.stream()
					.map(mapper -> mapper.getName().get())
					.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		List<Product> collect4 = productList.stream()
					.sorted((o1,o2) -> o2.getPrice()-o1.getPrice())
					.collect(Collectors.toList());
		
		List<Integer> collect5 = productList.stream()
					.map(mapper -> mapper.getPrice())
					.sorted(Comparator.reverseOrder())
					.collect(Collectors.toList());
		
		System.out.println(collect5);
		
		System.exit(0);
		
		Stream<Product> productStream = productList.stream();			// create stream
		Stream<Product> productStream1 = productList.parallelStream();			// create stream
 
		Predicate<Product> p = new Predicate<Product>() {
			
			@Override
			public boolean test(Product t) {
				// TODO Auto-generated method stub
				return t.getId()>3;
			}
		}; 
		
		Function<Product, Integer> f = new Function<Product, Integer>() {
			
			@Override
			public Integer apply(Product t) {
				// TODO Auto-generated method stub
				return t.getPrice()+500;
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
				    
					.filter(t-> t.getPrice()>1 && t.getName() != null )   // filter(t->t.id>3) 	// filter takes object of Predicate which returns boolean
				    .filter(t->t.getName().equals("Sony"))
				    //.map(f)      // map(t->t.price+500)
				    .forEach(i->{
				    	productList1.add(new Product(i.getId(),i.getName(),i.getPrice()));
				    	System.out.println(new Product(i.getId(),i.getName(),i.getPrice()));
				    });					// forEach takes object of Consumer
		
		
		System.out.println("--------------------------------------------------");
		
		Optional<Product> findFirst = Optional.ofNullable(productList.stream()
	   		.filter(t-> t.getPrice()>1 && t.getName() != null )   
	   		.filter(t->t.getName().equals("Sony"))
	   		.findFirst().orElse(null));	
		
		
		findFirst.ifPresent(System.out::println);
		
		List<String> collect = productList.stream()
				.filter(w -> w.getName() != null)
				.map(product -> product.getName())							// map takes stream T returns stream R
				.map(StreamAPI::toUppercase)
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
		Optional<List<String>> str = studentList.get(0).getPhoneNumbers();
		
		List<String> collect2 = studentList.stream()			
				.flatMap(mapper -> mapper.getPhoneNumbers().get().stream())			// flatmap takes stream of stream and returns stream
				.collect(Collectors.toList());
		
		System.out.println(collect2);
	}
	
	private  static String toUppercase(String str) {
		return str.toUpperCase();
	}
	

}
