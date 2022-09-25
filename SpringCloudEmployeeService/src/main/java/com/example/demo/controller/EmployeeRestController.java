package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Value("${server.port}")
	private String port;

	@GetMapping("/show")
	public ResponseEntity<String> showData() {
		return ResponseEntity.ok("WELCOME TO ALL!! " + port);
	}

}
