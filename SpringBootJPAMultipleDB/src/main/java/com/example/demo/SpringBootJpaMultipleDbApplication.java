package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.customer.repo.CustomerRepo;
import com.example.demo.model.customer.Customer;
import com.example.demo.model.product.Product;
import com.example.demo.product.repo.ProductRepo;

@SpringBootApplication
public class SpringBootJpaMultipleDbApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaMultipleDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerRepo.saveAll(Arrays.asList(new Customer(101,"Emp1","emp1@gmail.com"),new Customer(102,"Emp2","emp2@gmail.com")));
		productRepo.saveAll(Arrays.asList(new Product(101,"Gel","Pen"),new Product(102,"Jet","Pen")));

	}

}
