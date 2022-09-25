package com.test.oops.polymorphism.runtime.exceptionoverriding;

class A1
{
    void m1()
        throws ArrayIndexOutOfBoundsException
    {
        System.out.println("In m1 A");
    }
}

class B1
    extends A1
{
    @Override
    void m1()
        throws IndexOutOfBoundsException
    {
        System.out.println("In m1 B");
    }
}

public class ArrayIndexOverriding
{
    /* This will work fine as ArrayIndexOutOfBoundsException and IndexOutOfBoundsException are Runtime exceptions and there is no rule for runtime exceptions while method overriding
    */
    public static void main(String[] args)
    {
        A1 a = new B1();
        a.m1();
    }
}
