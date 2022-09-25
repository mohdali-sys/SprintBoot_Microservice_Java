package com.test.logical.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MakeFirstLetterToUpper {

	public static void main(String[] args) {
		String str = "this is the my first java program";
		// output - This Is The My First Java Program

		Arrays.stream(str.split(" ")).map(e ->

		{
			String firstChar = e.substring(0, 1).toUpperCase();
			String remainChar = e.substring(1, e.length());
			return firstChar + remainChar + " ";
		})

				.collect(Collectors.toList()).forEach(System.out::print);

	}

}
