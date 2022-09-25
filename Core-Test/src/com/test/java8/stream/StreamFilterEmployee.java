package com.test.java8.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterEmployee
{

    public static void main(String[] args)
    {
        String location = "mumbai";
        List<Employee> empList=EmployeeRepository.getEmployeeList();
       System.out.println(" filter emp :" +empList.stream().filter(x -> x.getLocation().equals("noida")).map(e -> e.getName().equals("Shibu")).collect(Collectors.toList()));

        List<Employee> noidaEmpList =
            empList.stream().filter((emp) -> emp.getLocation().equals(location)).collect(Collectors.toList());
        List<Employee> emp2020List =
            empList.stream().filter((emp) -> emp.getJoinDate().getYear() == 2020).collect(Collectors.toList());
        List<Employee> deliveryDate =
            empList.stream().filter((emp) -> LocalDate.now().isEqual(emp.getJoinDate())).collect(Collectors.toList());

        LocalDate today = LocalDate.now();
        int months = today.getMonthValue();
        int dayOfMonths = today.getDayOfMonth();

        List<Employee> todayEmpBrithday = empList.stream().filter(
            (emp) -> emp.getJoinDate().getMonthValue() == months && emp.getJoinDate().getDayOfMonth() == dayOfMonths)
            .collect(Collectors.toList());
        System.out.println("Size :" + noidaEmpList.size());
        System.out.println("2020 Size :" + emp2020List.size());
        System.out.println("deliveryDate:" + deliveryDate.size());
        System.out.println("todayEmpBrithday:" + todayEmpBrithday.size());
        System.out.println(noidaEmpList);
        System.out.println(emp2020List);

        System.out.println(todayEmpBrithday);
        
        System.out.println("Filtered element: "+empList.stream().filter(e -> "banglore".equalsIgnoreCase(e.getLocation())).distinct().findAny().get());
        System.out.println("Filtered element: "+empList.stream().filter(e -> "banglore".equalsIgnoreCase(e.getLocation())).filter(e -> "Tabrej".equalsIgnoreCase(e.getName())).collect(Collectors.toList()));
        System.out.println("Filtered with limit element: "+empList.stream().filter(e -> "banglore".equalsIgnoreCase(e.getLocation())).limit(1).collect(Collectors.toList()));
        
        List<Employee> noidaEmployee=empList.stream().filter(e -> "noida".equals(e.getLocation())).collect(Collectors.toList());
        List<Employee> mumbaiEmployee=empList.stream().filter(e -> "mumbai".equals(e.getLocation())).collect(Collectors.toList());
        List<Employee> kolkattaEmployee=empList.stream().filter(e -> "kolkatta".equals(e.getLocation())).collect(Collectors.toList());
        List<Employee> bangloreEmployee=empList.stream().filter(e -> "banglore".equals(e.getLocation())).collect(Collectors.toList());
        
        System.out.println(noidaEmployee);
        System.out.println(mumbaiEmployee);
        System.out.println(kolkattaEmployee);
        System.out.println(bangloreEmployee);
        System.out.println(empList.stream().distinct().count());
        
    }

   

}
