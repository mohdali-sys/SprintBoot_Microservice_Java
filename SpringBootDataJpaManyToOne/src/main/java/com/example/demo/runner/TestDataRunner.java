package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repo.DepartmentRepository;
import com.example.demo.repo.EmployeeRepository;

public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private DepartmentRepository drepo;
	
	@Autowired
	private EmployeeRepository erepo;
	
	public void run(String... args) throws Exception {
		Department d1 = new Department(1501, "DEV");
		Department d2 = new Department(1502, "QA");
		
		drepo.save(d1);
		drepo.save(d2);
		
		Employee e1 = new Employee(10, "AJAY", d1);
		Employee e2 = new Employee(11, "SYED", d1);
		Employee e3 = new Employee(12, "SAM", d2);
		Employee e4 = new Employee(13, "RAM", d2);
		
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		erepo.save(e4);
		
	}



}
