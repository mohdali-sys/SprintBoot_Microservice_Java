package com.test.array.logical;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// Q #37) Write a Java 8 program to sort an array and then convert the sorted array into Stream?
		int arr[] = { 99, 55, 203, 99, 4, 91 };
		Arrays.stream(arr).sorted().forEach(System.out::println); // This return sorted array, Note; Its not sort orginal array
		Arrays.stream(arr).forEach(System.out::println);
		Arrays.parallelSort(arr); // Its sort original array and that's why its have void return type
		Arrays.stream(arr).forEach(System.out::println);
		int[] arr1 = { 0, 1, 1, 0, 0, 1, 2 };

		System.out.println("Array elements after sorting:");
		// sorting logic
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				int tmp = 0;
				if (arr1[i] > arr1[j]) {
					tmp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = tmp;
				}
			}
			// prints the sorted element of the array
			System.out.println(arr1[i]);
		}

	}

}
