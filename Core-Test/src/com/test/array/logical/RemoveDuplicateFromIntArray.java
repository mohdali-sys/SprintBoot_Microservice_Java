package com.test.array.logical;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

// 1. How to Remove Duplicates from Array Without Using Java Collection API?

public class RemoveDuplicateFromIntArray {

	public static void main(String args[]) {

		int[][] test = new int[][] { { 1, 1, 2, 2, 3, 4, 5 }, { 1, 1, 1, 1, 1, 1, 1 }, { 1, 2, 3, 4, 5, 6, 7 },
				{ 1, 2, 1, 1, 1, 1, 1 }, };

		for (int[] input : test) {
			System.out.println("Array with Duplicates       : " + Arrays.toString(input));
			System.out.println("After removing duplicates removeDuplicatesWithOutCollectionAPI  : "
					+ Arrays.toString(removeDuplicatesWithOutCollectionAPII(input)));
			
			System.out.println("After removing duplicates removeDuplicatesWithCollectionAPI  : "
					+ Arrays.toString(removeDuplicatesWithCollectionAPIDistinct(input)));
			
			System.out.println(removeDuplicateIntFromArrayUsingSet(input));
		}

		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int length = arr.length;
		length = removeDuplicateElements(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}

	/*
	 * Method to remove duplicates from array in Java, without using Collection
	 * classes e.g. Set or ArrayList. Algorithm for this method is simple, it first
	 * sort the array and then compare adjacent objects, leaving out duplicates,
	 * which is already in the result.
	 */
	public static int[] removeDuplicatesWithOutCollectionAPII(int[] numbersWithDuplicates) {
		// Sorting array to bring duplicates together
		// good approach
		Arrays.sort(numbersWithDuplicates);

		int[] result = new int[numbersWithDuplicates.length];
		int previous = numbersWithDuplicates[0];
		result[0] = previous;

		for (int i = 1; i < numbersWithDuplicates.length; i++) {
			int ch = numbersWithDuplicates[i];

			if (previous != ch) {
				result[i] = ch;
			}
			previous = ch;
		}
		return result;

	}

	public static int[] removeDuplicatesWithCollectionAPIDistinct(int[] array) {
		return Arrays.stream(array).distinct().toArray();
	}

	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static int[] removeDuplicateIntFromArrayUsingSet(int a[])

	{
		Set<Integer> intSet = new LinkedHashSet<>();
		for (int c : a) {
			intSet.add(c);
		}
		int[] i=new int[intSet.size()];

        Integer[] arr = 
          Arrays.copyOf(intSet.toArray(), intSet.size(), Integer[].class);
        System.out.println("Removed duplicate using Set:"+arr.toString());
		return null;
	}
}

//Output :
//Array with Duplicates       : [1, 1, 2, 2, 3, 4, 5]
//After removing duplicates   : [1, 0, 2, 0, 3, 4, 5]
//Array with Duplicates       : [1, 1, 1, 1, 1, 1, 1]
//After removing duplicates   : [1, 0, 0, 0, 0, 0, 0]
//Array with Duplicates       : [1, 2, 3, 4, 5, 6, 7]
//After removing duplicates   : [1, 2, 3, 4, 5, 6, 7]
//Array with Duplicates       : [1, 2, 1, 1, 1, 1, 1]
//After removing duplicates   : [1, 0, 0, 0, 0, 0, 2]

//Read more: https://javarevisited.blogspot.com/2014/01/how-to-remove-duplicates-from-array-java-without-collection-API.html#ixzz7PzY7GLdk
