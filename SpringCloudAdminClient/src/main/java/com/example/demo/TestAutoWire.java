package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class TestAutoWire {
	
	
	@Autowired
	String s;
	
	@Autowired
	public TestAutoWire()
	{
		
	}
	
	@Autowired
	public void set(String s)
	{
		this.s=s;
	}
	
	@Autowired
	public String getS()
	{
		return s;
	}

}
