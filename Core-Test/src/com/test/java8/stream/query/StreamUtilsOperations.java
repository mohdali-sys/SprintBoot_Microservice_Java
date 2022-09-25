package com.test.java8.stream.query;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamUtilsOperations
{
    // https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
    // =======================Stream Operations(Stream is lazy)===============
    // Stream operations are either terminal are intermediate operations
    /*Intermediate Opereations: Intermedidate operatis are return stream instance example filter,map,flatMap,Sorted,Distinct,
     * peek,limit,seek,skip
     *Terminal Opereations: At end terminal operations must be present to end the streams example forEach,collect,match,count
     *min,max,anyMath,allMatch,findFirst,findAny,nonMatch
     * */

    public static void main(String[] args)
    {
        List<Employee> empList = EmployeeRepository1.getEmployeeList1();
        System.out.println("1. Find how many male and female in org.");
        System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));

        System.out.println("2. Print the name of all departments in the organization");
        empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        System.out.println("3. What is the average age of male and female employees");
        System.out.println(empList.stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));

        System.out.println("4. Get the details of highest paid employee in the organization");
        System.out.println(empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(empList.stream().max(Comparator.comparingDouble(Employee::getSalary)));
        
        System.out.println("5. Get the details of 2nd highest paid employee in the organization");
        // fail if 2 emp have highest sal
        System.out.println(empList.stream().sorted(Comparator.comparingDouble(Employee:: getSalary).reversed()).skip(1).findFirst());
        // Work fine even having more than 1 emp highest sal
        Optional<Employee> maxSal= empList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        Optional<Employee>  sec=empList.stream().filter( s -> s.getSalary() != maxSal.get().getSalary()).max(Comparator.comparing(Employee::getSalary));
        System.out.println("sec sal:"+sec.get());
        
        System.out.println(empList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst());
        System.out.println("5. find 1st three employee details based on highest salary");
        System.out.println(empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList()));

        System.out.println("6. Get the details of lowest paid employee in the organization");
        System.out.println(empList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));

        System.out.println("7. Get the names of all employees who have joined after 2015");
        empList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

        System.out.println("8. Count the number of employees in each department");
        System.out
            .println(empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));

        System.out.println("9. What is the average salary of each department");
        System.out.println(empList.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))));

        System.out.println("10.Get the details of youngest male employee in the product development department");
        System.out.println(empList.stream().filter(
            e -> e.getGender().equalsIgnoreCase("male") && e.getDepartment().equalsIgnoreCase("product development"))
            .min(Comparator.comparingInt(Employee::getAge)));

        System.out.println("11. Who has the most working experience in the organization");
        System.out
            .println(empList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining))));
        System.out.println(empList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst());

        System.out.println("12. Sort emp based on emp name");
        System.out
            .println(empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()));

        System.out.println("13. How many male and female employees are there in the sales and marketing team");
        System.out.println(empList.stream().filter(e -> "Sales And Marketing".equalsIgnoreCase(e.getDepartment()))
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));

        System.out.println("14. What is the average salary of male and female employees");
        System.out.println(empList.stream()
            .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))));

        System.out.println("15. List down the names of all employees in each department");
        System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getDepartment)));

        System.out.println("15. What is the average salary and total salary of the whole organization");
        DoubleSummaryStatistics employeeSalaryStatistics =
            empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary = " + employeeSalaryStatistics.getAverage());

        System.out.println("Total Salary = " + employeeSalaryStatistics.getSum());
        System.out.println(
            "16. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.");
        System.out.println(empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25)));
        Map<Boolean, List<Employee>> partitionEmployeesByAge =
            empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
        Set<Entry<Boolean, List<Employee>>> entrySet = partitionEmployeesByAge.entrySet();
        System.out.println(
            "17. Who is the oldest employee in the organization? What is his age and which department he belongs to?");
        System.out.println(empList.stream().max(Comparator.comparingInt(Employee::getAge)));
        System.out.println(empList.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getAge))));
        System.out.println(empList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).findFirst());
        
        System.out.println("18. Sort employee based on age in asc order");
        System.out.println(empList.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList()));
        
        System.out.println("18. Sort employee based on age in desc order");
        System.out.println(empList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList()));      
        empList.stream().sorted(Comparator.comparing(Employee::getName)).sequential().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList()).forEach(System.out::print);
    }

}
