package com.test.mycollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Collectors;

import com.test.java8.stream.query.Employee;
import com.test.java8.stream.query.EmployeeRepository1;

public class ArrayListFailSafeItration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = EmployeeRepository1.getEmployeeList1();
		List<String> arrayList = new ArrayList<>();
		List<String> vector = new Vector<>();
		List<String> LinkedList = new LinkedList<>();

		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();

		for (int i = 0; i < empList.size(); i++) {
			Employee e = empList.get(i);
			e.setSalary(100);
			empList.set(i, e);
			System.out.println(e);
		}

		empList.stream().map(e -> {
			e.setSalary(e.getSalary() +(e.getSalary() * 10 / 100));
			return e;
		}).collect(Collectors.toList()).forEach(System.out::println);
	}

}
