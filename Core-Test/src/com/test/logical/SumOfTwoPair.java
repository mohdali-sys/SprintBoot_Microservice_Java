package com.test.logical;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoPair {

	public static void main(String[] args) {

int arr[]= {5,6,8,9,43,7,9,23,67,1,5};

Set<Integer> pairNumber=new HashSet<>();

for(int i=0;i<arr.length-1;i=i+2)
{
	pairNumber.add(arr[i]+arr[i+1]);
	
}
System.out.println(pairNumber);

	}

}
