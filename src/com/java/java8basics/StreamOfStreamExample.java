package com.java.java8basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.model.Department;
import com.java.model.Employee;

public class StreamOfStreamExample {
			
	public static void main(String[] args) {

		List<Employee> empList1 = new ArrayList<>();
		empList1.add(new Employee(1,"Swapnil"));
		empList1.add(new Employee(2,"Maya"));
		empList1.add(new Employee(3,"Arav"));
		
		List<Employee> empList2 = new ArrayList<>();
		empList2.add(new Employee(1,"A"));
		empList2.add(new Employee(2,"B"));
		empList2.add(new Employee(3,"C"));
														//empList2.addAll(empList1);
		
		List<Employee> empList3 = new ArrayList<>();
		empList3.add(new Employee(1,"X"));
		empList3.add(new Employee(2,"Y"));
		empList3.add(new Employee(3,"Z"));
		
		List<Department> dpt = new ArrayList<>();
		dpt.add(new Department(1, "CSE", empList1));
		dpt.add(new Department(2, "MECH", empList2));
		dpt.add(new Department(3, "IT", empList3));
		
		
		List<Employee> ids = dpt.stream()
								//.filter(f -> f.getDptName().equals("MECH"))
								.flatMap(mapper -> mapper.getEmp().stream())
								.filter(f -> f.getId()> 1)
								.collect(Collectors.toList());
		
		System.out.println(ids);
	}

}
