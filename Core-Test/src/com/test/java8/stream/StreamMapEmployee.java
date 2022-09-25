package com.test.java8.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapEmployee
{

    public static void main(String[] args)
    {
        String location = "mumbai";
        List<Employee> empList = EmployeeRepository.getEmployeeList();
        System.out.println(empList.stream().map((e) -> {
            int i = 1;
            if ("noida".equalsIgnoreCase(e.getLocation()))
            {
                e.setEmpId("noida-" + i);
                i++;
            }
            return e;
        }).collect(Collectors.toList()));

        System.out.println(empList.stream().filter((e) -> "noida".equalsIgnoreCase(e.getLocation())).map(e -> {
            e.setEmpId("noida-1");
            return e;
        }).collect(Collectors.toList()));

    }

}
