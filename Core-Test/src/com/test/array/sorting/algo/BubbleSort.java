package com.test.array.sorting.algo;

import java.util.Arrays;
//https://www.programiz.com/dsa/bubble-sort
//Working of Bubble Sort
//Suppose we are trying to sort the elements in ascending order.

//1. First Iteration (Compare and Swap)

//Starting from the first index, compare the first and the second elements.
//If the first element is greater than the second element, they are swapped.
//Now, compare the second and the third elements. Swap them if they are not in order.
//The above process goes on until the last element.

public class BubbleSort {
	//https://www.programiz.com/dsa/sorting-algorithm

	public static void main(String[] args) {
		int[] data = { -2, 45, 0, 11, -9 };
	    
	    // call method using class name
	    bubbleSort(data);
	    
	    System.out.println("Sorted Array in Ascending Order:");
	    System.out.println(Arrays.toString(data));
	}

	// perform the bubble sort
	static void bubbleSort(int array[]) {
	    int size = array.length;
	    
	    // loop to access each array element
	    for (int i = 0; i < size - 1; i++)
	    
	      // loop to compare array elements
	      for (int j = 0; j < size - i - 1; j++)

	        // compare two adjacent elements
	        // change > to < to sort in descending order
	        if (array[j] > array[j + 1]) {

	          // swapping occurs if elements
	          // are not in the intended order
	          int temp = array[j];
	          array[j] = array[j + 1];
	          array[j + 1] = temp;
	        }
	}
}
