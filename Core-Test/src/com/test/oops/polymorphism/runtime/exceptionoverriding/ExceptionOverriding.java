package com.test.oops.polymorphism.runtime.exceptionoverriding;

import java.io.IOException;

class A2
{
    void m1()
        throws IOException
    {
        System.out.println("In m1 A");
    }
}

class B2
    extends A2
{
    /*   @Override
    void m1()
        throws Exception
    {
        System.out.println("In m1 B");
    }
    As IOException and Exception are checked exception, so you can not broaden the scope of Exception while method overriding.
    */
}

public class ExceptionOverriding
{

    public static void main(String[] args)
    {
        A2 a = new B2();
        try
        {
            a.m1();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
