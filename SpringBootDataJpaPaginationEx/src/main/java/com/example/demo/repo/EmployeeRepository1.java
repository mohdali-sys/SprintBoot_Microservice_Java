package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Employee1;

public interface EmployeeRepository1  extends JpaRepository<Employee1, Integer>{

}
