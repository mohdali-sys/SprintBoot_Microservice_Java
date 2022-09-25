package com.test.company.interviews;

import java.util.Arrays;

public class MindTree {

	public static void main(String[] args) {
		// 1. Reverse the string without using buildin function.

		String str = "Hello world";
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		System.out.println(result);

//2. Sort array 0,1,1,0,0,1,2

		int[] arr = { 0, 1, 1, 0, 0, 1, 2 };

		System.out.println("Array elements after sorting:");
		// sorting logic
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}
			// prints the sorted element of the array
			System.out.println(arr[i]);
		}
		int[] arr1 = { 0, 1, 1, 0, 0, 1, 2 };
		Arrays.sort(arr1);
		Arrays.stream(arr1).forEach(System.out::print);
	}
}
