package com.example.demo.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repo.CourseRepository;
import com.example.demo.repo.StudentRepository;

@Component
public class TestDataRunner implements CommandLineRunner {

	@Autowired
	private CourseRepository crepo;
	@Autowired
	private StudentRepository srepo;
	
	public void run(String... args) throws Exception {
		Course c1 = new Course(85, "CJ", 200.0);
		Course c2 = new Course(86, "AJ", 400.0);
		Course c3 = new Course(87, "SB", 500.0);
		Course c4 = new Course(88, "MS", 600.0);
		
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		crepo.save(c4);
		
	//	Student s1 = new Student(1051, "AJAY", Set.of(c2,c4));
	//	Student s2 = new Student(1052, "SAM", Set.of(c1,c2));
	//	Student s3 = new Student(1053, "SYED", Set.of(c3,c4));
		
	//	srepo.save(s1);
	//	srepo.save(s2);
	//	srepo.save(s3);
	}

}

