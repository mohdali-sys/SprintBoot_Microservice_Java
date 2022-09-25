package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Employee;

public interface EmployeeRepsitory extends JpaRepository<Employee, Integer>{

	@Modifying 	//non-select
	@Query("UPDATE Employee SET empName=:empName WHERE empId=:empId")
	public Integer updateEmployeeNameById(String empName,Integer empId);

}
