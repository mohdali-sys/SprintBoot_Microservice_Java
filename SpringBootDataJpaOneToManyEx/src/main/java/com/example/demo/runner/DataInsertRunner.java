package com.example.demo.runner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Model;
import com.example.demo.entity.Product;
import com.example.demo.repo.ModelRepository;
import com.example.demo.repo.ProductRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private ModelRepository mrepo;
	
	@Autowired
	private ProductRepository prepo;
	
	public void run(String... args) throws Exception {
		Model m1 = new Model(1051, "MINI");
		Model m2 = new Model(1052, "MICRO");
		
		mrepo.save(m1);
		mrepo.save(m2);
		
		Set<Model> s1 = new HashSet<>();
		s1.add(m1);
		s1.add(m2);
		
		Product p1 = new Product(10, "LAPTOP-A", s1);
		
		prepo.save(p1);
		
		
	}

}

