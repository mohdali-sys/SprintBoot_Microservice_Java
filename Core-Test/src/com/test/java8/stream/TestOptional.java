package com.test.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class TestOptional {

	public static void main(String[] args) {
		TestOptional java8Tester = new TestOptional();
		Integer value1 = null;
		Integer value2 = new Integer(10);

		// Optional.ofNullable - allows passed parameter to be null.
		Optional<Integer> a = Optional.ofNullable(null);

		// Optional.of - throws NullPointerException if passed parameter is null
		Optional<Integer> b = Optional.of(value2);
		System.out.println(java8Tester.sum(a, b));
		Optional<List<String>> opt=Optional.ofNullable(getEmpleeNameList());
	//	opt.filter((x) -> x.stream().filter((x) -> x.equals("Tabrej")).collect(Collectors.toList())); 
		System.out.println(opt.isPresent());
	}

	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		// Optional.isPresent - checks the value is present or not

		System.out.println("First parameter is present: " + a.isPresent());
		System.out.println("Second parameter is present: " + b.isPresent());

		// Optional.orElse - returns the value if present otherwise returns
		// the default value passed.
		Integer value1 = a.orElse(new Integer(0));

		// Optional.get - gets the value, value should be present
		Integer value2 = b.get();
		return value1 + value2;
	}

	private static List<String> getEmpleeNameList() {
		
		try
		{
			System.out.println(" hello");
			List<String> s= new ArrayList<>();
		       Integer[] myArray = new Integer[1000 * 1000 * 1000];
			int i=0;
			for(;true;)
			{
				s.add(i+1+" =Hello");
				System.out.println(i+1+" =Hello");
			}
		}
		catch(OutOfMemoryError error)
		{
			System.out.println(" catch(OutOfMemoryError error)"+error);
			 System.err.println("Max JVM memory: " + Runtime.getRuntime().maxMemory()/1024/1024);
			
			Runtime.getRuntime().gc();
		}

		return Arrays.asList("Tabrej", "Shibu", "Khan", "Ahamad",null);
	}

}
