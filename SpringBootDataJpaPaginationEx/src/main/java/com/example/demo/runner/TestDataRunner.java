package com.example.demo.runner;

import java.io.FileInputStream;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Employee1;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.repo.EmployeeRepository1;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	@Autowired
	private EmployeeRepository1 repo1;

	public void run(String... args) throws Exception {

		repo.save(new Employee(102, "CC", 500.0));
		repo.save(new Employee(102, "CC", 500.0));
		repo.save(new Employee(103, "BB", 300.0));
		repo.save(new Employee(104, "DD", 200.0));
		repo.save(new Employee(105, "FF", 400.0));
		repo.save(new Employee(106, "EE", 200.0));
		repo.save(new Employee(107, "TT", 200.0));
		repo.save(new Employee(108, "JJ", 400.0));
		repo.save(new Employee(109, "MM", 600.0));

		List<Employee> list = repo.findAll();
		list.forEach(System.out::println);

		System.out.println("---------------");
		Pageable pageable = PageRequest.of(0, 3);

		Page<Employee> page = repo.findAll(pageable);
		page.forEach(System.out::println);

		// metadata
		System.out.println("Size: " + page.getSize());
		System.out.println("First: " + page.isFirst());
		System.out.println("Last: " + page.isLast());
		System.out.println("Next: " + page.hasNext());
		System.out.println("Previous: " + page.hasPrevious());
		System.out.println("Total Pages: " + page.getTotalPages());
		System.out.println("Total rows: " + page.getTotalElements());
		System.out.println("Empty Page: " + page.isEmpty());

		// Reading data from a File to byte[]
		FileInputStream fis = new FileInputStream("C:\\Users\\tahamad\\OneDrive - Sopra Steria\\Desktop\\Report\\ps\\land\\pay15k.PNG");
		byte[] img = new byte[fis.available()];
		fis.read(img);
		
		String input = "Hello How are you where are you.. welcome to HYD  Hello How are you where are you.. welcome to HYD  Hello How are you where are you.. welcome to HYD  Hello How are you where are you.. welcome to HYD  ";
		char[] note = input.toCharArray();
		
		repo1.save(new Employee1(105, "AJAY", new Date(), new Date(), new Date(),img,note));
		fis.close();


	}
}
