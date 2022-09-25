package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.service.StudentDAOImpl;
import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentServiceImpl {

	@Autowired
	private StudentRepository studentRepository;

	private StudentDAOImpl studentDAOImpl;

	public Student saveStudent(Student student) {
		studentDAOImpl.saveStudent(student);
		return student;
	}

	public Student getStudent(int id) {
		return studentDAOImpl.getStudent(id);
	}

}
