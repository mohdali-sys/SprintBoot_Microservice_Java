package com.test.array.logical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
	
	public static void main(String[] args) {
		   Integer[] arr1 = new Integer[] { 1, 9, 8, 7, 7, 8, 9 };
	        List<Integer> listdup = Arrays.asList(arr1);
	        // 1.Approach one to remove duplicate form list
	        listdup.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	     // 2.Approach two to remove duplicate form list
	        listdup.stream().collect(Collectors.toSet()).forEach(System.out::println);
	}

}
