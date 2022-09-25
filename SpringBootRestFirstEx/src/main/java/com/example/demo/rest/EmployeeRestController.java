package com.example.demo.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	// Return type of your method:
	// String, void, Collection/ClassType, ***ResponseEntity<___>

	@GetMapping("/all")
	public String getEmployeeData() {
		return "FROM EMPLOYEE FETCH";
	}

	@PostMapping("/save")
	public String createEmployeeData() {
		return "FROM EMPLOYEE SAVE";
	}

	@PutMapping("/modify")
	public String modifyEmployeeData() {
		return "FROM EMPLOYEE UPDATE";
	}

	@DeleteMapping("/remove")
	public String removeEmployeeData() {
		return "FROM EMPLOYEE REMOVE";
	}

	@PatchMapping("/update/mail")
	public String modifyEmployeeMail() {
		return "FROM EMPLOYEE PARTIAL UPDATE";
	}
}
