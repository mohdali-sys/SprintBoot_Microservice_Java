package com.example.demo.save.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		Employee emp = new Employee();
		//emp.setId("AA1234");
		emp.setEid(2016);
		emp.setEname("SAM");
		emp.setEsal(600.25);
		repo.save(emp);
		
	}
}
