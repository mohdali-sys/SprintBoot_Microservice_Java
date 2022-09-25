package com.example.dao.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.entity.Student;

@Repository
@Transactional
public class StudentDAOImpl {
	
	@PersistenceContext
	private EntityManager entityManager;

	public Student saveStudent(Student student) {
		// entityManager.persist(student);
		entityManager.merge(student);
		return student;
	}

	public Student getStudent(int id) {
		// Optional<Student> studentResponse = studentRepository.findById(id);
		Student student = entityManager.find(Student.class, id);
		return student;
	}

}
