package com.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Test {
	
	static String call() {
		try {
//			int i = 5/0;
			System.out.println("1");
			return "A";
		}catch(Exception e) {
			System.out.println("2");
			return "b";
		}finally {
			System.out.println("3");
			return "c";
		}
		
	}
	
	public static void main(String[] args) {
		
		String call = call();
		
		System.out.println(call);
		
		System.exit(0);
		
		int []arr = {-7,-6,4,-5,3,2,-1};
		
		
		//output -1,2,3,4, -5 -6 -7
		
		List<Integer> collect2 = Arrays.stream(arr)
		.boxed()
		.sorted((o1,o2) -> Math.abs(o1) - Math.abs(o2))
		.collect(Collectors.toList());
		
		System.out.println(collect2);
		
	
		
		
	
		
		System.exit(0);

		Employee1 e1 = new Employee1(1,"Java", "HR",1000);
		Employee1 e2 = new Employee1(2,"Java", "IT",2000);
		Employee1 e3 = new Employee1(3,"Java", "HR",5000);
		Employee1 e4 = new Employee1(4,"Java", "HR",6000);
		Employee1 e5 = new Employee1(5,"Java", "IT",4000);
		Employee1 e6 = new Employee1(6,"Java", "HR",3000); 
		
		List<Employee1> empList = new ArrayList<Employee1>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		
		List<Employee1> empList1 = List.of(e1,e2,e3,e4,e5,e6);
		
		
		Map<String, Double> collect = empList.stream()
				.collect(Collectors.groupingBy(Employee1::dpt,Collectors.averagingDouble(Employee1::salary)));
		
		System.out.println(collect);
		

		System.exit(0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String struuu = "Inter view";

		Map<Character, Long> map = struuu.chars()
										.mapToObj(c -> (char) c)
										.map(c -> Character.toLowerCase(c))
										.filter(c -> !Character.isSpace(c))
										.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		map.forEach((k,v) -> System.out.println(k+" : " + v));
		
		
		
		int a=1;
		for(int i=1; i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		
		
		//System.out.println(recursion(5));
		System.out.println(disp1());

	}
	
	static int disp1() {
		
		try {
			System.out.println("Before finally");
			//System.exit(0);
			return 1111;
			
		}catch(Exception e) {
			
		}finally {
			System.out.println("In finally");
		}
		return 2222;
	}
	static int recursion (int i){

		if(i==0)
		{
		return 1;
		}

		return i*recursion(i-1);

		}
	
	public void display() {
		try {
			
		}
		finally {
			
		}
	}

	
	public void display1() {
		System.out.println("Inside");
		System.out.println("display1");


		
	}
	
	public void display2() {
		
	}

}
