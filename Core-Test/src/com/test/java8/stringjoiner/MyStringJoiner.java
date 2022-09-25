package com.test.java8.stringjoiner;

import java.util.StringJoiner;

public class MyStringJoiner {

	public static void main(String[] args) {
		StringJoiner join= new StringJoiner(",");
		join.add("Tabrej");
		join.add("Ahamad");
		join.add("Khan");
		join.add("Shibu");
		System.out.println(join.toString());
		
		 StringJoiner join1 = new StringJoiner(",", "(", ")");
		join1.add("Tabrej");
		join1.add("Ahamad");
		join1.add("Khan");
		join1.add("Shibu");
		System.out.println(join1.toString());
	}
}
