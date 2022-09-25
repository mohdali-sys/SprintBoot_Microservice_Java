package com.test.java8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamUtilOperations
{
    // =======================Stream Operations(Stream is lazy)===============
    // Stream operations are either terminal are intermediate operations
    /*Intermediate Opereations: Intermedidate operatis are return stream instance example filter,map,flatMap,Sorted,Distinct,
     * peek,limit,seek
     *Terminal Opereations: At end terminal operations must be present to end the streams example forEach,collect,match,count
     *min,max,anyMath,allMatch,findFirst,findAny,nonMatch
     * */

    public static void main(String[] args)
    {
        List<Employee> empList = EmployeeRepository.getEmployeeList();

        // 1. Find all emp who age > 30weq
        empList.stream().filter(emp -> {
            System.out.println("Hello");
            return emp.getAge() >= 30;
        });
        empList.stream().filter(emp -> emp.getAge() >= 30).forEach(emp -> {
            System.out.println(emp);
        });

        // 2. Count all emp who age > 30
        System.out.println("Emp have age >= 30 count :" + empList.stream().filter(emp -> emp.getAge() >= 30).count());
        // 3. Group employee have same location
        System.out.println(empList.stream().collect(Collectors.groupingBy(e -> e.getLocation().equals("mumbai"))));
        System.out.println(empList.stream().collect(Collectors.partitioningBy(e -> e.getLocation().equals("mumbai"))));
        // 4. Count employee for each location
        System.out
            .println(empList.stream().collect(Collectors.groupingBy(e -> e.getLocation(), Collectors.counting())));
        // 5. Find 2nd hightest sal emp object , IF 2 EMP on hight sal then will issue in below code
        System.out.println("2nd hight emp sal :"
            + empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst());

        String INVERTED_COMMA = "\"";
        String NEW_LINE = "\n";
        String CSV_DELIMITER = ",";
        String record = Stream.of("830", "Fixed", "ECSS", "Session code", "Hello", "Yes").collect(Collectors
            .joining(INVERTED_COMMA+CSV_DELIMITER+INVERTED_COMMA,INVERTED_COMMA,INVERTED_COMMA+NEW_LINE));
        System.out.println(record);

    }

}
