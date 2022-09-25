package com.test.string.logical;

import java.util.LinkedHashSet;
import java.util.Set;

//2) How to remove all duplicates from a given string? 
public class RemoveDuplicateCharsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abnfabdfgabdmdka";

		Set<Character> charSet = new LinkedHashSet<>();
		StringBuilder builder = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (charSet.add(c)) {
				builder.append(c);
			}
		}
		System.out.println(builder.toString());
	}
}
