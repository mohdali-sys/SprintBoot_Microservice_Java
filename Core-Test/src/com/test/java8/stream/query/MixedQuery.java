package com.test.java8.stream.query;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MixedQuery {

	public static void main(String[] args) {
	List<Employee> empList=EmployeeRepository1.getEmployeeList1();
	
	//print name of all employee who age greater than 20
	empList.stream().filter(e -> e.getAge() >= 20 && e.getAge()<= 25).map(e-> e.getName())
	.collect(Collectors.toList()).forEach(System.out::println);
	
	//count employee who age 20 year.
	
	System.out.println("Employee count who age 25: "+empList.stream().filter(e -> e.getAge() == 25).count());
	
	// find max age emp
	
	System.out.println("Max age emp:"+empList.stream().max(Comparator.comparingInt(Employee::getAge)));
	// Sort emp based on age in ascending order
	System.out.println("*********Sort emp based on age in ascending order*******************");
	empList.stream().sorted(Comparator.comparing(Employee::getAge))
	.collect(Collectors.toList()).forEach(System.out::println);
	
	// Sort emp based on age in descending order
	System.out.println("***************Sort emp based on age in descending order********************");
	empList.stream().sorted(Comparator.comparing(Employee::getAge).reversed())
	.collect(Collectors.toList()).forEach(System.out::println);

	}

}
