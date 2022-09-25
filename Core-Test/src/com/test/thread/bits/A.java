package com.test.thread.bits;

/*There are two threads T1 and T2. T1 is accessing m1 method. Will T2 be able to access m2 method on the same instance at the same time?*/
class A
{
    synchronized void m1()
    {
        System.out.println("In m1 A");
    }

    synchronized void m2()
    {
        System.out.println("In m2 A");
    }

    /*   No, T2 will not be able to access m2 as it requires lock to access m2 method which is already taken by T1 thread.*/
}
