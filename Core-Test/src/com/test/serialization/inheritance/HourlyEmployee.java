package com.test.serialization.inheritance;

import java.time.LocalDate;

import com.test.serialization.simple.Employee;

public class HourlyEmployee extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	long salaryPerHours = 100;

	public HourlyEmployee(long id, String empId, String name, String location, LocalDate joinDate,
			long salaryPerHours) {
		super(id, empId, name, location, joinDate);
		this.salaryPerHours = salaryPerHours;
	}

	public long getSalaryPerHours() {
		return salaryPerHours;
	}

	public void setSalaryPerHours(long salaryPerHours) {
		this.salaryPerHours = salaryPerHours;
	}

}
