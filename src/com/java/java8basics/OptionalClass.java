package com.java.java8basics;

 import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.java.model.Employee;

public class OptionalClass {
	
	static List<Employee> employeeList = new ArrayList<Employee>();

	public static void main(String[] args) {

			employeeList.add(new Employee(1, "Swapnil"));
			employeeList.add(new Employee(2, "Maya"));
		
		employeeList.add(new Employee(3, "Arav"));
		employeeList.add(new Employee(4, null));
		employeeList.add(new Employee(2, "Maya"));
		employeeList.add(new Employee(2, "Maya"));
		
		
		Optional<Object> empty = Optional.empty();
		System.out.println(empty);
		
		//Optional<String> of = Optional.of(employeeList.get(3).getName());  					// Optional.of will give null pointer exception
		//System.out.println(of);
//					
//					How this code is different from any code without Optional? Well, 
//					the biggest advantage of this code is that it will throw a NullPointerException immediately if Person p is null, 
//					rather than throwing a NullPointerException when you try to access any field of the person object.
//					
		
		//Optional<String> ofNullable = Optional.ofNullable(employeeList.get(3).getName());  					
		
		
		Optional<String> ofNullable = employeeList.get(3).getName();  					
		System.out.println(ofNullable);
		//System.out.println(ofNullable.get());													// No such element exception
		
		if(ofNullable.isPresent()) {
			System.out.println(ofNullable.get());
		}
		
		ofNullable.ifPresent(System.out::println);										// this is the correct way.
		
		System.out.println(ofNullable.orElse("default"));
		
		System.out.println(employeeList.stream()
				.filter(p -> p.getName().get().equalsIgnoreCase("Arav"))
				.findAny()
				.orElse(new Employee(5,"Khade")));
		
//		employeeList.stream()
//				.filter( p -> 
//					p.getName().get().equalsIgnoreCase("Arav")
//				)
//				.forEach(e ->{
//					System.out.println("***********"+e.getId()+"  "+e.getName().get());
//				});
		
//		String str = employeeList.get(1).getName().get();
//		
//		Optional<List<Employee>> emp = Optional.ofNullable(employeeList);
//		
//		employeeList.forEach(e -> {
//			System.out.println(e);
//			});
		
//		if(emp.isPresent()) {
//			System.out.println(emp);
//		}
		System.out.println("--------------");
		int i=0;
		for(Employee emp : employeeList) {
			if(emp.getName().get().equalsIgnoreCase("Arav")) {
				System.out.println(emp);
				break;
			}
			System.out.println(++i);
		}
		System.out.println("--------------");
	}

}
