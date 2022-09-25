package com.test.array.search.algo;

public class LinearSearch {
	
//	The time complexity of the above algorithm is O(n). 

//	Linear search is rarely used practically because other search algorithms such as the binary search algorithm and hash tables allow significantly faster-searching comparison to Linear search.

//	Improve Linear Search Worst-Case Complexity

//	if element Found at last  O(n) to O(1)
//	It is the same as previous method because here we are performing 2 ‘if’ operations in one iteration of the loop and in previous method we performed only 1 ‘if’ operation. This makes both the time complexities same.

//	https://www.geeksforgeeks.org/linear-search/
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;

		// Function call
		int result = search(arr, x);
		if (result == -1)
			System.out.print("Element is not present in array");
		else
			System.out.print("Element is present at index " + result);

	}

	public static int search(int arr[], int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

}
