package com.test.java8.prefunctional.inf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List<String> empList= new ArrayList<>();
		empList.add("tabrej");
		empList.add("Naveen");
		empList.add("Tom");
		empList.add("king");
		empList.add("Lisa");
		empList.add("Peter");
		empList.add("Robby");
		empList.add("Robby1");
		empList.add("Robby2");
		empList.add("Ahamad");
		
Comparator<String> comp=(e1,e2) -> e2.toString().compareTo(e1.toString());	
System.out.println("Befor sorting :"+empList);
Collections.sort(empList);
System.out.println("After default sorting :"+empList);
Collections.sort(empList,comp);
System.out.println("After custom sorting :"+empList);

	}

}
