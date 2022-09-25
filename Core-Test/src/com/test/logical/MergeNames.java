package com.test.logical;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MergeNames {

	public static String[] uniqueNames(String[] names1, String[] names2) {

		Set<String> nameSet = new TreeSet<>();
		nameSet.addAll(Arrays.asList(names1));
		nameSet.addAll(Arrays.asList(names2));
		return nameSet.toArray(new String[0]);
	}

	public static void main(String[] args) {
		String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma" };
		System.out.println(String.join("\n", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma,
																						// Olivia, Sophia
	}
}
