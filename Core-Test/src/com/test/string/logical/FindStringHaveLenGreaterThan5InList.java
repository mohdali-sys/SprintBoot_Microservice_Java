package com.test.string.logical;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringHaveLenGreaterThan5InList {
	public static void main(String[] args) {
		// Q #38) Write a Java 8 program to find the number of Strings in a list whose length is greater than 5?
		  List<String> list = new ArrayList<String>();
	        list.add("Saket");
	        list.add("Saurav");
	        list.add("Softwaretestinghelp");
	        list.add("Steve");
	        list.stream().filter( e -> e.length() > 5).collect(Collectors.toList()).forEach(System.out::println);
	      long count=  list.stream().filter( e -> e.length() > 5).count();
	      System.out.println("We have " + count + " strings with length greater than 5");
	}
	

}
