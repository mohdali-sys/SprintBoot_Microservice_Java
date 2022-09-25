package com.example.demo.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
//@Entity
public class Address {
	
	private long id;
	
	private String hno;
	
	private String city;
	private long pinCode;

}
