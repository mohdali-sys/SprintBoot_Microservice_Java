package com.test.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestListStream
{

    public static void main(String[] args)
    {
        List<Integer> salList = new ArrayList<>();

        List<String> streamList = Stream.of("ss", "cxcxc", "", "df", "vdff", "uurw", "uiup", "aqw", "bvtr")
            .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(streamList);
        salList.add(2000);
        salList.add(3000);
        salList.add(4000);
        salList.add(5000);
        salList.add(2000);
        salList.add(3000);
        salList.add(2000);
        salList.add(2000);
        salList.add(3000);
        salList.add(5000);
        salList.add(5000);
        salList.add(3000);
        salList.add(2000);
        salList.add(5000);
        salList.add(2000);
        salList.add(3000);
        salList.add(5000);
        // find emp who have 2000 sal

        List<Integer> l1 = salList.stream().filter(p -> p.intValue() == 2000).collect(Collectors.toList());
        List<Integer> l2 = salList.stream().filter(p -> p.equals(Integer.valueOf(5000))).collect(Collectors.toList());

        Integer max = salList.stream().max(Integer::compare).get();
        Integer min = salList.stream().min(Integer::compare).get();
        long count = salList.stream().count();
        long distinctcount = salList.stream().distinct().count();
        List<Integer> distinctList = salList.stream().distinct().collect(Collectors.toList());
        Integer findAny = salList.stream().findAny().get();
        Integer findFirst = salList.stream().findFirst().get();
        // return true if all elements present inside this stream match with given predicate in allMatch method
      System.out.println(" Is allMatch: "+salList.stream().allMatch( e -> e.intValue() == 2000));
      System.out.println(" Is anyMatch: "+salList.stream().anyMatch( e -> e.intValue() == 2000));
      System.out.println("collect : "+salList.stream().collect(Collectors.counting()));
     // System.out.println(" groupingBy : "+salList.stream().collect(Long.class ,5000,2000,3000,4000));
        
// 
        System.out.println(" List1 :" + l1);
        System.out.println(" List2 :" + l2);

        System.out.println(" Max :" + max);
        System.out.println(" Min :" + min);
        System.out.println(" count :" + count);
        System.out.println(" distinctcount :" + distinctcount);
        System.out.println(" distinctList :" + distinctList);
        System.out.println(" findAny :" + findAny);
        System.out.println(" findFirst :" + findFirst);
        System.out.println(" isParaell :" + salList.stream().isParallel());
        System.out.println(" isParaell :" + salList.stream().parallel().isParallel());
        System.out.println(" isParaell :" + salList.parallelStream().isParallel());

        salList.parallelStream().forEach(System.out::println);

        List<Integer> salNum = salList.stream().map((num) -> num * 2).collect(Collectors.toList());
        System.out.println("Multiply * 2 value :" + salNum);
        List<String> empNameList = new ArrayList<>();
        empNameList.add("Tabrej");
        empNameList.add("Ahamad");
        empNameList.add("Shibu");
        empNameList.add("Khan");
        empNameList.add("ABCD");
        empNameList.add("Xyz");
        empNameList.add("KpaGG");

        List<String> empLowerList = empNameList.stream().map(String::toLowerCase).sorted().collect(Collectors.toList());
        System.out.println(empLowerList);
        
        List<String> empLowerList1=empNameList.stream().map((e) -> e.toUpperCase()).sorted().collect(Collectors.toList());
        empNameList.stream().forEach((e) -> e.toLowerCase());
        System.out.println(empLowerList1);
        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
        System.out.println("The Structure before flattening is : " + listOfListofInts);
        // Using flatMap for transformating and flattening.
        List<Integer> listofInts =
            listOfListofInts.stream().flatMap(list -> list.stream().map((c) -> c * 3)).collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " + listofInts);
        Optional<List<String>> empOptional = Optional.of(empNameList);
    }
}
