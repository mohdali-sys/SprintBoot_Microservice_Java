package com.test.design.builder;

public class StringBuilderDesignTest {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder().append("abc").reverse().replace(0, 1, "ax");
		System.out.println(sb);
	}

}
