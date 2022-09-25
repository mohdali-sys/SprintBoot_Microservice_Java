package com.test.java8.stream;

import java.time.LocalDate;

public class Employee
{
    private long id;

    private String empId;

    private String name;

    private String location;

    private LocalDate joinDate;
    
    private long salary;
    
    
    
    public long getSalary()
    {
        return salary;
    }

    public void setSalary(long salary)
    {
        this.salary = salary;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    private int age;

    public Employee(long id, String empId, String name, String location, LocalDate joinDate,int age,long salary)
    {
        super();
        this.id = id;
        this.empId = empId;
        this.name = name;
        this.location = location;
        this.joinDate = joinDate;
        this.age=age;
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
            + joinDate + ", age="+age+", salary="+salary+"]";
    }

}
