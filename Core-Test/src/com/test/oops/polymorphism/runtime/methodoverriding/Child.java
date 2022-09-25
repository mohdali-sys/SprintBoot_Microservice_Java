package com.test.oops.polymorphism.runtime.methodoverriding;

public class Child
    extends Parent
{

    public void m2(Integer i)
    {
        System.out.println("m2(Integer i)");
    }

    public void m2(Long i)
    {
        System.out.println("m2(Long i)");
    }

    public void m2(Double i)
    {
        System.out.println("m2(Double i)");
    }

    public void m2(String s)
    {
        System.out.println("m2(String i)");
    }

    public void m2(Object o, String s[])
    {
        System.out.println("m2(String i[])");
    }

    public void m2(Object o, String s)
    {
        System.out.println("m2(String s");
    }

    public static void main(String[] args)
    {
        Parent p = new Child();

        p.m1("");
        p.m1(null);
        Child c = new Child();
        String s = null;
        c.m2(s);
        // c.m2(null); Compiler will confuse which primitive param method call, boz all primitive accept null

        // c.m2("", null); CE
    }

}
