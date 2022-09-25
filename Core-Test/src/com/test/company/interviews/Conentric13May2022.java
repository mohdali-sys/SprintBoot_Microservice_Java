package com.test.company.interviews;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Conentric13May2022 {

	public static void main(String[] args) {
		// sort map object based on key
		Map<String, String> map = new HashMap<String, String>();
		map.put("G", "1");
		map.put("C", "5");
		map.put("B", "3");
		map.put("D", "2");
		map.put("E", "6");
		map.put("F", "4");
		map.put("A", "8");
		// Convert a Map into a Stream
		// map.entrySet().stream()
//		Sort it
		// map.entrySet().stream().sorted(Map.Entry.comparingByKey())
//		Collect and return a new LinkedHashMap (keep the order)
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));
		
		Map result = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors
				.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println(map);
		System.out.println(result);
		// Map m= LinkedHashMap::new;
		
		   Map<String, Integer> unsortMap = new HashMap<>();
	        unsortMap.put("z", 10);
	        unsortMap.put("b", 5);
	        unsortMap.put("a", 6);
	        unsortMap.put("c", 20);
	        unsortMap.put("d", 1);
	        unsortMap.put("e", 7);
	        unsortMap.put("y", 8);
	        unsortMap.put("n", 99);
	        unsortMap.put("g", 50);
	        unsortMap.put("m", 2);
	        unsortMap.put("f", 9);

	        System.out.println("Original...");
	        System.out.println(unsortMap);

	        //sort by values, and reserve it, 10,9,8,7,6...
	        Map<String, Integer> result1 = unsortMap.entrySet().stream()
	                .sorted(Map.Entry.comparingByValue())
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
	        
	        System.out.println(result1);

	}

}
