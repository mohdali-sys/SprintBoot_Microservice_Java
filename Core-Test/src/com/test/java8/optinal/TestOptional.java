package com.test.java8.optinal;

import java.util.Optional;

import com.test.design.builder.Computer;

public class TestOptional {

	public static void main(String[] args) {
	Computer co=new Computer.ComputerBuilder("HDD","RAM").setBluetoothEnabled(true).build();
	Address1 add= new Address1("101", "jan", "Janunpur");
	//Employee1 e1= new Employee1("Tabrej", add, 101L, 1000d);
	}

}



class Employee1
{
	String name;
	Address address;
	Long id;
	Double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Optional<Address> getAddress() {
		return Optional.ofNullable(address);
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee1(String name, Address address, Long id, double salary) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
		this.salary = salary;
	}
}

class Address1
{
	String hno;
	String city;
	String distict;
	public Address1(String hno, String city, String distict) {
		super();
		this.hno = hno;
		this.city = city;
		this.distict = distict;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistict() {
		return distict;
	}
	public void setDistict(String distict) {
		this.distict = distict;
	}
}