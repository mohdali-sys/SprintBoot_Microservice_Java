package com.test.logical;

import java.util.Scanner;

/*In the Fibonacci series, each number is a sum of two preceding numbers it. Let's consider an example here:

0,1,1,2,3,5,8,13,21,34,55 and so on the sequence continues.*/ 
public class PrintFibonacci {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
          System.out.println("Enter Number: ");
          int n = s.nextInt();

          if(n > 0){
                showfibonacci(n);
          }else{
                System.out.println("Please enter positive number");
          }
          
          s.close();

	}
	
	
	static void showfibonacci(int no){
        int f1, f2=0, f3=1;
        for(int i=1;i <=no;i++){
              System.out.println(f3);
              f1 = f2;
              f2 = f3;
              f3 = f1 + f2;
        }
  } 

}
