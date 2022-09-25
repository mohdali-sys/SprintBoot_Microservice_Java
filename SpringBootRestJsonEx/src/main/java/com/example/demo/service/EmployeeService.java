package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.repo.EmployeeRepsitory;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepsitory repo;

	@Transactional
	public Employee save(Employee e) {
		return repo.save(e);
	}

	public List<Employee> findAll() {
		return repo.findAll();
	}

	public Employee findEmployeeById(Integer empId) {
		Optional<Employee> emp = repo.findById(empId);
		if (!emp.isPresent()) {
			throw new EmployeeNotFoundException("Employee '" + empId + "' Not Exist");
		}
		return emp.get();
	}

	public boolean deleteEmployeeById(Integer empId) {
		repo.deleteById(empId);
		return true;
	}

	public boolean updateEmployeeNameById(String empName, Integer empId) {
		repo.updateEmployeeNameById(empName, empId);
		return true;
	}

	@Transactional
	// Replace below
	/*
	 * UserTransaction utx = entityManager.getTransaction();
	 * 
	 * try { utx.begin(); businessLogic(); utx.commit(); } catch(Exception ex) {
	 * utx.rollback(); throw ex; }
	 */
	public Employee updateEmployee(Employee e) {
		return repo.save(e);
	}
}
