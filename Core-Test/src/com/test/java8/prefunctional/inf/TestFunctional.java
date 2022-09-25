package com.test.java8.prefunctional.inf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.test.java8.stream.Employee;
import com.test.java8.stream.EmployeeRepository;

public class TestFunctional
{

    public static void main(String[] args)
    {

        List<Employee> empList = EmployeeRepository.getEmployeeList();

        Function<Employee, String> function = (e) -> e.getEmpId();

       // System.out.println(function.apply());
        for (Employee e : empList)
        {
            System.out.println(function.apply(e));
        }

        empList.forEach(e -> System.out.println(e));
    }

}
