package com.test.java8.prefunctional.inf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicateFunctionalInf
{
    String s = "a";

    public static void main(String[] args)
    {
        // String s = "hello"; // Lambda expression's parameter s cannot redeclare another local variable defined in an
        // enclosing scope.

        Predicate<String> p = s -> {
            System.out.println(s);
            return true;
        };
        p.test("Hello");
        
        
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
		
		empList.removeIf((e) -> e.equals("Robby1"));
		System.out.println(empList);
		
		empList.removeIf((e) -> true);
		System.out.println(empList);
		
		
		
    }

}
