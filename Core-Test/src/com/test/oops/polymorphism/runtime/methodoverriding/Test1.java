package com.test.oops.polymorphism.runtime.methodoverriding;

class A
{
    void m1()
    {
        System.out.println("In m1 A");
    }
}

class B
    extends A
{
    @Override
    void m1()
    {
        System.out.println("In m1 B");
    }

    void m2()
    {
        System.out.println("In m2 B");
    }
}

public class Test1
{

    public static void main(String[] args)
    {
        A a = new B();
        a.m1();
        // a.m2(); // There will be compile-time error. Even though we are assigning B’s object to A’s reference we can
        // call only methods which are in A from A’s reference.
    }
}
