package com.test.java8.optinal;

import java.util.Optional;

public class OptinalTest {

	public static void main(String[] args) {
		Address add = new Address("101", "jan", "Janunpur");
		Employee e1 = new Employee("Tabrej", add, 101L, 1000d);
		Employee e2 = new Employee("Tabrej", null, 101L, 1000d);
		Employee e3 = new Employee("Tabrej", add, 101L, 1000d);
		Employee e4 = new Employee("Tabrej", add, 101L, 1000d);
		Employee e5 = new Employee("Tabrej", add, 101L, 1000d);
		Employee e6 = new Employee("Tabrej", add, 101L, 1000d);
		Employee e7 = new Employee("Tabrej", null, 101L, 1000d);
		// e2=null;
		System.out.println(e1.getAddress().orElse(new Address(null, null, null)).getCity());
		System.out.println(e2.getAddress().orElse(new Address("", "", "")).getDistict());

		// create Optional container
		Optional<Employee> opt = Optional.empty();
		//Optional<Employee> opt1=Optional.of(null);
		Optional<Employee> opt2 = Optional.ofNullable(null);
		
		Optional<Employee> emp1Opt=Optional.of(e1);
		System.out.println(emp1Opt);
		emp1Opt.ifPresent(emp -> System.out.println(emp.getAddress().get().getCity()));
		
		e7=null;
		Optional<Employee> emp7Opt=Optional.ofNullable(e7);
		System.out.println(emp7Opt);
		emp7Opt.ifPresent(emp -> System.out.println(emp.getAddress().get().getCity()));
		
		if(emp7Opt.isPresent())
		{
		System.out.println(emp7Opt.get().getAddress().get().getDistict());
		}
		
		// System.out.println(opt.get()); // return java.util.NoSuchElementException: No
		// value present

		// Optional<Employee> opt1=Optional.of(new Employee("Tabrej", add, 101L,
		// 1000d));
		// Optional<Employee> opt1=Optional.of(null);//Returns the given non-null value.//Exception in thread "main"// java.lang.NullPointerException
		//Optional<Employee> opt1 = Optional.ofNullable(null); // Returns the given value, if non-null, otherwise returns an empty
		//System.out.println(opt1.empty()); // return java.util.NoSuchElementException: No value present

	}

}

class Employee {
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

	public Employee(String name, Address address, Long id, Double salary) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
		this.salary = salary;
	}
}

class Address {
	String hno;
	String city;
	String distict;

	public Address(String hno, String city, String distict) {
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