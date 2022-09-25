package com.example.demo.global.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.EmployeeNotFoundException;

//@ControllerAdvice
@RestControllerAdvice

public class MyCustomGlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	ResponseEntity<String> handleProductNotFoundException(EmployeeNotFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
