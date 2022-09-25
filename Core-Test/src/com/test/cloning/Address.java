package com.test.cloning;

public class Address implements Cloneable{

	private String city="Noida";
	
	private String country="India";
	
	public Address clone() throws CloneNotSupportedException
	{
		Address a=	(Address)super.clone();
		return a;
	}
}
