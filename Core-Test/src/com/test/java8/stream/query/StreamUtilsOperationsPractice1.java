package com.test.java8.stream.query;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamUtilsOperationsPractice1 {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeRepository1.getEmployeeList1();
		System.out.println("1. Find how many male and female in org.");
		System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
		Map<String, Long> deptEmpMap1 = empList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("1.");
		Map<String, List<Employee>> deptEmpMap = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		for (String key : deptEmpMap.keySet()) {
			System.out.println(deptEmpMap.get(key));
		}
		employeeSortingOpertations(empList);
		employeeGroupingByOpertations(empList);
		employeeFilterOpertations(empList);
		employeeMapOperation(empList);
		employeeCollectorsOpertations(empList);
		reduceOpertations();
	}

	private static void employeeSortingOpertations(List<Employee> empList) {
		System.out.println(" 1. Sort employee based on there name");
		empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println(" 2. Sort employee based on there salary and name");
		empList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary)
						.thenComparing(Comparator.comparing(Employee::getName)))
				.collect(Collectors.toList()).forEach(System.out::println);

		System.out.println(" 3. Sort employee based on there join date ");
		empList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println(" 4. Sort employee in descending order based on sal");
		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList())
				.forEach(System.out::println); // revered ascending(descending) order

		System.out.println(" 5. Sort employee in ascending order based on sal");
		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList())
				.forEach(System.out::println); // ascending order
	}

	private static void employeeGroupingByOpertations(List<Employee> empList) {
		System.out.println(" 1. Count each deptment employee");
		Map<String, Long> deptCount = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(deptCount);
		Function.identity();

	}

	private static void employeeFilterOpertations(List<Employee> empList) {
		System.out.println(" 1. Count employee who name start with S");
		System.out.println(empList.stream().filter(e -> e.getName().startsWith("S")).count());

		System.out.println(" 1. Print employee name who empid 555");
		empList.stream().filter(emp -> emp.getId() == 555).findFirst().ifPresent(System.out::print);
		empList.stream().filter(emp -> emp.getId() == 222).findFirst().ifPresent(e -> {
			System.out.println(e.getName());
		});

		empList.stream().filter(emp -> emp.getId() == 111).map(Employee::getName).findFirst()
				.ifPresent(System.out::println);

		Optional<Employee> e = empList.stream().filter(emp -> emp.getId() == 222).findFirst();
	}

	private static void employeeMapOperation(List<Employee> empList) {
		System.out.println("1. Increase employee sal by 10 percent");
		// map method have Function type agrs take input return output
		empList.stream().map(e -> {
			e.setSalary(e.getSalary() + (e.getSalary() * 10 / 100));
			return e;
		}).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println(
				"2. Increase employee sal by 10 percent if sal >10000 and  15if percent sal >50000&& sal<10000 below 5000 increase 20 percent");
		int percent = 0;
		/*
		 * empList.stream().filter( e-> e.getSalary() > 10000? percent=10:e->
		 * e.getSalary() >50000 && e.getSalary() < 10000 ? percent=15:
		 * e.getSalary()<5000:percent=20
		 * 
		 * 
		 * ).map(e -> { e.setSalary(e.getSalary() +(e.getSalary() * 10 / 100)); return
		 * e; }).collect(Collectors.toList()).forEach(System.out::println);
		 */
	}

	private static void employeeCollectorsOpertations(List<Employee> empList) {
		System.out.println(
				"Sum of all emp sal :" + empList.stream().collect(Collectors.summingDouble(Employee::getSalary)));

		System.out.println("Sum of all emp sal dept wise : " + empList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary))));
		System.out.println("Average salary for all emp : "+empList.stream().collect(Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("Average salary dept wise : "+empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))));;
		

	}
	private static void reduceOpertations() {
		 int[] numbers = {1, 2, 3};

		  // 1st argument, init value = 0
		  //int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
		int  sum=Arrays.stream(numbers).reduce(0,(a,b)-> a+b);
		sum=Arrays.stream(numbers).reduce(0,Integer::sum);
		sum=Arrays.stream(numbers).reduce(1,(v1,v2)-> v1*v2);
		sum=Arrays.stream(numbers).reduce(1,(v1,v2)-> v1*v2);
		  System.out.println("sum : " + sum); // 55	
		  
		  System.out.println(Arrays.stream(numbers).average());
		  System.out.println(Arrays.stream(numbers).sequential().count());

	}
}
