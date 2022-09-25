package com.test.java8.functional.inf;

public interface AddNumber
{
    int addnumber(int a, int b);

    default int add(int x, int y)
    {
        return x + y;
    }

    default int add1(int x, int y)
    {
        return x + y;
    }

    static int sub(int x, int y)
    {
        return x - y;
    }

    static int sub1(int x, int y)
    {
        return x - y;
    }

    /* {
        System.out.println("");
    }*/
    // int sub(); //The target type of this expression must be a functional interface

    // 1. If interface method implemetion given using lamda expression then that interface call as Functional interface.
    // 2. Functional interface should conatins only single abstract method
    // 3. Functional interface can contains n number of default and static method
    // 4. Function interface or interface can't contains static or non-static block
    // 5. Function interface or interface can't conatins instance variable
}
