package com.test.logical.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharacters {
	public static void main(String args[]) {
		printDuplicateCharacters("Programming");
		//printDuplicateCharacters("Combination");
		//printDuplicateCharacters("Java");
		
		String str="Programming";
		
		}

	public static void printDuplicateCharacters(String word) 
	{ 
		char[] characters = word.toCharArray(); 
		Map<Character,Integer> resultMap= new HashMap<>();
		
		for(Character ch: characters)
		{
			if(resultMap.containsKey(ch))
			{
				resultMap.put(ch, resultMap.get(ch)+1);
			}
			else
			{
				resultMap.put(ch, 1);
			}
			
		}
		for(Character c:resultMap.keySet()) {
			if(resultMap.get(c) >1)
			{
				System.out.println("Duplicate char: "+c+ " ocurrence: "+resultMap.get(c));
			}
		}
	}
	

}
