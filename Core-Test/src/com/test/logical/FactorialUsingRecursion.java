package com.test.logical;

/*The factorial of a number is the function that multiplies the number by every natural number below it. Symbolically,
 *  factorial can be represented as "!". So, n factorial is the product of the first n natural numbers and is 
 *  represented as n!
 *  For example, 4 factorial, that is, 4! can be written as: 4! = 4󫢪�1= 24.
*/


public class FactorialUsingRecursion {
	 public static void main(String[] args) {
	        int num = 6;
	        long factorial = multiplyNumbers(num);
	        System.out.println("Factorial of " + num + " = " + factorial);
	    }
	    public static long multiplyNumbers(int num)
	    {
	        if (num >= 1)
	            return num * multiplyNumbers(num - 1);
	        else
	            return 1;
	    }

}

//6*5*4*3*2*1=  720
