package com.test.logical;

import java.util.Arrays;

public class FindMinDiffFromArray {

	public static void main(String[] args) {
		FindMinDiffFromArray find = new FindMinDiffFromArray();

		int array[] = new int[] { 7, 15, 9, 19, 12, 45, 67, 89, 100 };
		System.out.println("Min diff between two value in Array " + find.findMinDiffFromArray(array, array.length));
		System.out.println("Max diff between two value in Array " + find.findMaxDiffFromArray(array, array.length));
	}

	int findMinDiffFromArray(int[] array, int n) {
		Arrays.sort(array);
		int diff = Integer.MAX_VALUE;

		for (int i = 0; i < n - 1; i++) {
			if (array[i + 1] - array[i] < diff)
				diff = array[i + 1] - array[i];
		}
		return diff;
	}

	int findMaxDiffFromArray(int[] array, int n) {
		Arrays.sort(array);
		int diff = 0;

		for (int i = 0; i < n - 1; i++) {
			if (array[i + 1] - array[i] > diff)
				diff = array[i + 1] - array[i];
		}
		return diff;
	}
}
