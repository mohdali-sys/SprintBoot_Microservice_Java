package com.example.repository;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Serializable> {
	
	
	
	

}
