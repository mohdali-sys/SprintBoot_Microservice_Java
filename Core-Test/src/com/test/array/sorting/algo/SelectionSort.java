package com.test.array.sorting.algo;

import java.util.Arrays;

public class SelectionSort {
//	https://www.programiz.com/dsa/selection-sort
//1.Set the first element as minimum
//2. Compare minimum with the second element. If the second element is smaller than minimum, assign the second element as minimum.

//Compare minimum with the third element. Again, if the third element is smaller, then assign minimum to the third element otherwise do nothing. The process goes on until the last element.	

	public static void main(String[] args) {
		int[] data = { 20, 12, 10, 15, 2 };
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(data);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(data));
	}

	void selectionSort(int array[]) {
		int size = array.length;

		for (int step = 0; step < size - 1; step++) {
			int min_idx = step;

			for (int i = step + 1; i < size; i++) {

				// To sort in descending order, change > to < in this line.
				// Select the minimum element in each loop.
				if (array[i] < array[min_idx]) {
					min_idx = i;
				}
			}

			// put min at the correct position
			int temp = array[step];
			array[step] = array[min_idx];
			array[min_idx] = temp;
		}
	}
}
