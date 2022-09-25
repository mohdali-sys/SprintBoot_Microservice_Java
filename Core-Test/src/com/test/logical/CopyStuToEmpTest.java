package com.test.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyStuToEmpTest {

	public static void main(String[] args) {
		
		List<Integer> source = Arrays.asList(1, 2, 3,6);
		List<Integer> dest = Arrays.asList(5, 6, 7, 8, 9, 10);
		Collections.copy(dest,source);
		System.out.println(dest);
		Student s1 = new Student("S1", 21);
		Student s2 = new Student("S2", 22);
		Student s3 = new Student("S3", 23);
		Student s4 = new Student("S4", 19);
		Student s5 = new Student("S5", 18);
		Student s6 = new Student("S6", 19);

		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);

		List<Employee> employeeList = new ArrayList<>();

		//Collections.copy(studentList, employeeList);

	}

}
