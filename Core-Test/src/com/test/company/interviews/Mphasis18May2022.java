package com.test.company.interviews;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mphasis18May2022 {

	public static void main(String[] args) {
	//	input=4,5,6,7,8

		//		4*4=16

				List<Integer> numList=Arrays.asList(4,5,6,7,8);

				numList.stream().map(num -> num*num).collect(Collectors.toList()).forEach(System.out::println);

				System.out.println(Math.sqrt(4));
	}

}
