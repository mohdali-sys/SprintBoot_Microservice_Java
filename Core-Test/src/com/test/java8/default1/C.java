package com.test.java8.default1;

public interface C
    extends A, B
{
    @Override
    default void m1()
    {
        System.out.println("This is C m1");
    }
}
