package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductTestRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		Product p = new Product();
		p.setProdId(885);
		p.setProdCost(500.0);
		p.setProdName("LAPTOP BAG");
		//repo.save(p);
		//repo.flush();
		System.out.println(repo.findAll());
		System.out.println(repo.findById(885));
	}

}

