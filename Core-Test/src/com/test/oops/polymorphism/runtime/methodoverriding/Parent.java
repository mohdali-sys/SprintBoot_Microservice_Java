package com.test.oops.polymorphism.runtime.methodoverriding;

public class Parent
{
    public String m1(String s1)
    {
        System.out.println(" public String m1(String s1)");
        return s1;
    }

    public Object m1(Object s1)
    {
        System.out.println("    public Object m1(Object s1)");
        return s1;
    }

}
