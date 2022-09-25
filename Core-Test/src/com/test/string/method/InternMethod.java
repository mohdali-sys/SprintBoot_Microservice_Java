package com.test.string.method;

import java.util.ArrayList;
import java.util.List;

public class InternMethod {

	
	/*
	 * In order to put the strings in the string pool, one needs to call the
	 * intern() method. Before creating an object in the string pool, the JVM checks
	 * whether the string is already present in the pool or not. If the string is
	 * present, its reference is returned.
	 */

	public static void main(String[] args) {
		String str = new String("Tabrej");   
		String str1 = new String("Tabrej");  
		System.out.println(str1 == str); // prints false  
		
		String str2 = new String("hello").intern();   
		String str3 = new String("hello").intern();  
		System.out.println(str2 == str3); // prints true.  
		
		  List list = new ArrayList();
	        list.add("hello");
	        list.add(2);
	        System.out.print(list.get(0) instanceof Object);
	        System.out.print(list.get(1) instanceof Integer);

	}

}
