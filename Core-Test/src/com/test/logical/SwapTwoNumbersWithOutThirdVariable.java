package com.test.logical;

public class SwapTwoNumbersWithOutThirdVariable
{
    public static void main(String args[])
    {
        int x, y;
        x = 10;
        y = 20;

        System.out.println("Before Swapping\nx = " + x + "\ny = " + y);

        x = x + y; // 10+30 = 30
        y = x - y; // 30 -20 = 10;
        x = x - y; // 30-10= 20

        System.out.println("After Swapping without third variable\nx = " + x + "\ny = " + y);
    }
}
