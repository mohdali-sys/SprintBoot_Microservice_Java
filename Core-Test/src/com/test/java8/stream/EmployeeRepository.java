package com.test.java8.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository
{

    private EmployeeRepository()
    {

    }

    public static List<Employee> getEmployeeList()
    {
        Employee e1 = new Employee(1, "emp1", "Raman", "noida", LocalDate.of(2020, 01, 01), 25,1000);
        Employee e2 = new Employee(2, "emp2", "Akbar", "banglore", LocalDate.of(2020, 01, 05), 27,1200);
        Employee e3 = new Employee(3, "emp3", "Javed", "noida", LocalDate.of(2018, 01, 10), 28,1300);
        Employee e4 = new Employee(4, "emp4", "Tabrej", "mumbai", LocalDate.of(2019, 01, 01), 31,1000);
        Employee e5 = new Employee(5, "emp5", "Shibu", "noida", LocalDate.of(2020, 02, 19), 30,1500);

        Employee e6 = new Employee(6, "emp6", "Bablu", "noida", LocalDate.of(2020, 03, 06), 30,1100);
        Employee e7 = new Employee(7, "emp7", "Chaula", "kolkatta", LocalDate.of(2019, 06, 20), 29,1000);
        Employee e8 = new Employee(8, "emp8", "Dabbu", "noida", LocalDate.of(2019, 07, 21), 26,1100);
        Employee e9 = new Employee(9, "emp9", "Eric", "noida", LocalDate.of(2020, 10, 25), 28,1300);
        Employee e10 = new Employee(10, "emp10", "Firoz", "noida", LocalDate.of(2018, 11, 03), 31,1400);
        Employee e11 = new Employee(11, "emp11", "Irafan", "kolkatta", LocalDate.of(2020, 12, 20), 23,1400);
        Employee e12 = new Employee(12, "emp12", "Kamal", "mumbai", LocalDate.of(2020, 12, 01), 32,1500);
        Employee e13 = new Employee(13, "emp13", "Lallu", "banglore", LocalDate.of(2021, 9, 03), 35,1300);

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        empList.add(e8);
        empList.add(e9);
        empList.add(e10);
        empList.add(e11);
        empList.add(e12);
        empList.add(e13);

        return empList;
    }
}
