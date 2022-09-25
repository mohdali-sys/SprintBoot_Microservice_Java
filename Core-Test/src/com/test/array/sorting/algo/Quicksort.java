package com.test.array.sorting.algo;
//https://www.programiz.com/dsa/quick-sort
//Quicksort is a sorting algorithm based on the divide and conquer approach where

import java.util.Arrays;

//An array is divided into subarrays by selecting a pivot element (element selected from the array).

//While dividing the array, the pivot element should be positioned in such a way that elements less than pivot are kept on the left side and elements greater than pivot are on the right side of the pivot.
//The left and right subarrays are also divided using the same approach. This process continues until each subarray contains a single element.
//At this point, elements are already sorted. Finally, elements are combined to form a sorted array.
public class Quicksort {

	public static void main(String[] args) {
		 int[] data = { 8, 7, 2, 1, 0, 9, 6 };
		    System.out.println("Unsorted Array");
		    System.out.println(Arrays.toString(data));

		    int size = data.length;

		    // call quicksort() on array data
		    Quicksort.quickSort(data, 0, size - 1);

		    System.out.println("Sorted Array in Ascending Order: ");
		    System.out.println(Arrays.toString(data));
	}
	
	// method to find the partition position
	  static int partition(int array[], int low, int high) {
	    
	    // choose the rightmost element as pivot
	    int pivot = array[high];
	    
	    // pointer for greater element
	    int i = (low - 1);

	    // traverse through all elements
	    // compare each element with pivot
	    for (int j = low; j < high; j++) {
	      if (array[j] <= pivot) {

	        // if element smaller than pivot is found
	        // swap it with the greatr element pointed by i
	        i++;

	        // swapping element at i with element at j
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	      }

	    }
	    // swapt the pivot element with the greater element specified by i
	    int temp = array[i + 1];
	    array[i + 1] = array[high];
	    array[high] = temp;

	    // return the position from where partition is done
	    return (i + 1);
	  }
	  
	  static void quickSort(int array[], int low, int high) {
		    if (low < high) {

		      // find pivot element such that
		      // elements smaller than pivot are on the left
		      // elements greater than pivot are on the right
		      int pi = partition(array, low, high);
		      
		      // recursive call on the left of pivot
		      quickSort(array, low, pi - 1);

		      // recursive call on the right of pivot
		      quickSort(array, pi + 1, high);
		    }
		  }
}
