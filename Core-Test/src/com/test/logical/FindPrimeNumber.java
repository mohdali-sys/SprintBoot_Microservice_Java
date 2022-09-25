package com.test.logical;

import java.util.Scanner;

public class FindPrimeNumber {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        System.out.println("Enter a number : ");
	        int num = s.nextInt();
	        int i=2;
	        for(; i<10; i++){
	            if(num%i==0 && num!=i){
	                System.out.println(num+" is not a prime number.");
	                break;
	            }
	        }
	            if(i==10){
	                    System.out.println(num+" is a prime number.");
	            }

	}

}
