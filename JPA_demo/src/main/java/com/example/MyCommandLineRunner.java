package com.example;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.dao.service.StudentDAOImpl;
import com.example.entity.Student;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Autowired
	private StudentDAOImpl studentDAOImpl;
	
	@Value("${spring.application.name}")
	String applicationName;
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(MyCommandLineRunner.class);

	@Override
	public void run(String... args) throws Exception {

		log.info("Application Name " + applicationName);
		
		Student s = new Student();
		s.setId(1);
		s.setName("Tabrej");
		s.setRollNumber("1000123022");
		s.setUniversity("Integral university");
		s = studentDAOImpl.saveStudent(s);
		log.info("Generated id: " + s.getId());

	}

}
