package com.test.logical;

public class SwapTwoNumbersWithThirdVariable
{
    /*  Q #3) Write a Java Program to swap two numbers using the third variable.*/
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int x, y, temp;
        x = 10;
        y = 20;
        System.out.println("Before Swapping x=" + x + " y=" + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping x=" + x + " y=" + y);

    }

}
