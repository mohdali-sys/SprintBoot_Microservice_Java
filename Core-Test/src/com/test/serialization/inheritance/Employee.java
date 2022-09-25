package com.test.serialization.inheritance;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	// Its recommended to add serial version for each entity
	//private static final long serialVersionUID = 1L;

	// Case 1:
	// Even if we not mention serial version , object still  getting saved,How ? , 
	 // If not mention serial version in class , compiler will add serial version add the time of compilation.
	// Case 2:
	//If i saved object in file and then change in class file for example added one more instance variable salary and try to get existing object with new class.the will get exception as
	//java.io.InvalidClassException: com.test.serialization.simple.Employee; local class incompatible: stream classdesc serialVersionUID = -3756147680491134774, local class serialVersionUID = 8062043219257310601
	// if becase after add new field in class compiler change serial version so , exsiting and new class version will mis match
	
	
    private long id;

    private String empId;

    private String name;

    private String location;

    private LocalDate joinDate;
    
    private long salary=100;

    public Employee(long id, String empId, String name, String location, LocalDate joinDate,long salary)
    {
        super();
        this.id = id;
        this.empId = empId;
        this.name = name;
        this.location = location;
        this.joinDate = joinDate;
        this.salary=salary;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getEmpId()
    {
        return empId;
    }

    public void setEmpId(String empId)
    {
        this.empId = empId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public LocalDate getJoinDate()
    {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate)
    {
        this.joinDate = joinDate;
    }

    @Override
    public String toString()
    {
        return "Employee [id=" + id + ", empId=" + empId + ", name=" + name + ", location=" + location + ", joinDate="
            + joinDate + "]";
    }

	
	  public long getSalary() { return salary; }
	  
	  public void setSalary(long salary) { this.salary = salary; }
	 
    
}
