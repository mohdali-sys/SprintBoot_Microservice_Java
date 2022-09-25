package com.test.serialization.inheritance;

import java.time.LocalDate;

import com.test.serialization.simple.Employee;

public class SalariedEmplyee extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long salary = 100;

	public SalariedEmplyee(long id, String empId, String name, String location, LocalDate joinDate, long salary) {
		super(id, empId, name, location, joinDate);
		this.salary=salary;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
}
