package com.test.java8.prefunctional.inf;

import java.util.function.Supplier;

public class TestSupplierFunationalInf
{

    public static void main(String[] args)
    {
    	// Lamda exp is an annomus method
        Supplier<String> s = () -> {
            String s1[] = { "Hello", "Hi", "Bye", "Hey" };
            int x = (int) Math.random() * 3 + 1;
            return s1[x];
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        
        Supplier<String> supplier = () -> "Hello";
        
        System.out.println(supplier.get());
    }

}
