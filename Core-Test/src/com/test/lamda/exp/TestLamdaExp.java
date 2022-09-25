package com.test.lamda.exp;

interface Funtion1
{
    void test();
}

interface Funtion2
{
    boolean test(boolean b);
}
public class TestLamdaExp
{

    public static void main(String[] args)
    {
    //    Funtion1 f1= -> {System.out.println("Hello"); };
     //   f1.test();
        
        Funtion2 f2 =  b ->{System.out.println("Hello"); return true;};
        f2.test(true);
    }
}
