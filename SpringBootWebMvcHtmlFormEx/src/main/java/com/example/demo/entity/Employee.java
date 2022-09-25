package com.example.demo.entity;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Employee {

	private Integer empId;
	
	@NotBlank(message = "Name is mandatory" )
	
	private String empName;
	private Double empSal;
}
