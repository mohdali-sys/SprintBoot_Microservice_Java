package com.test.logical.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountOccurenceOfGivenCharacterInString {
	
	public static void main(String[] args) {
		
	
	String str="This is my java programming";
	char findChar='a';
	char charArray[]=str.toCharArray();
	 int count=0;
	for(char c: charArray)
	{
		if(c==findChar)
		{
			count++;
		}
		
	}
	System.out.println("Count :" + count);
	
	List<String> strList= new ArrayList<>();
	System.out.println(Arrays.asList(charArray).stream().filter(c -> c.toString().equals('a')).count());
	
	strList.add("Hello");
	strList.add("Hi");
	strList.add("Hello");
	strList.add("world");
	strList.add("java");
	strList.add("program");
	System.out.println(Collections.frequency(strList, "Hello"));
	System.out.println(Math.sqrt(-4D));
	}
}
