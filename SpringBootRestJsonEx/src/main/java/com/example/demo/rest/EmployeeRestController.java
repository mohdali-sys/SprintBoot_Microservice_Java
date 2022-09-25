package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService;

	// @RequestBody JSON (input) ---> Object
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	// @ResponseBody Object---> JSON (Output)
	@GetMapping("/fetch/{empId}")
	// @ResponseBody
	public ResponseEntity<Employee> getOneEmployee(@PathVariable Integer empId) {
		ResponseEntity<Employee> response = null;
		try {
			Employee employee = employeeService.findEmployeeById(empId);
			response = new ResponseEntity<Employee>(employee, HttpStatus.OK);
		} catch (EmployeeNotFoundException e) {
			throw e;
		}
		return response;
	}

	// @ResponseBody Object---> JSON (Output)
	@GetMapping("/fetch/all")
	// @ResponseBody
	public List<Employee> getAllEmployee() {
		return employeeService.findAll();
	}

	// 6. partial data update
	@PatchMapping("/modify/{empId}/{empName}")
	public ResponseEntity<String> updateEmployeeName(@PathVariable Integer empId, @PathVariable String empName) {
		ResponseEntity<String> response = null;
		employeeService.updateEmployeeNameById(empName, empId);
		response = new ResponseEntity<String>("Employee '" + empId + "' Updated!", HttpStatus.OK);
		return response;
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee) {
		ResponseEntity<String> response = null;
		employeeService.updateEmployee(employee);
		response = new ResponseEntity<String>("Employee '" + employee + "' Updated!", HttpStatus.OK);
		return response;
	}

	// 6. delete
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable Integer empId) {
		ResponseEntity<String> response = null;
		employeeService.deleteEmployeeById(empId);
		response = new ResponseEntity<String>("Employee id '" + empId + "' deleted !", HttpStatus.OK);
		return response;
	}
}
