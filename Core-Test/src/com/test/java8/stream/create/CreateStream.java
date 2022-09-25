package com.test.java8.stream.create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CreateStream {

	public static void main(String[] args) {
		// 1. empty stream
		Stream<String> s = Stream.empty();
		s.forEach(System.out::print);
		// 2. Array to Stream
		String array[] = { "T", "A", "B", "R", "E", "J" };
		Stream<String> arrayStream = Arrays.stream(array);
		arrayStream.forEach(System.out::print);
		// 3. Stream of to Stream
		Stream<String> ofStream = Stream.of("A", "H", "A", "M", "A", "D");
		ofStream.forEach(System.out::print);
		// 4. List to Stream
		List<String> strList = Arrays.asList("K", "H", "A", "N");
		strList.forEach(System.out::print);
		List<String> al2=new ArrayList<>();
		al2.add("R");
		Stream<String> st5=al2.stream();
		st5.forEach(System.out::println);
		// 4. Map to Stream 
		Map<String,Integer> mayKey=new HashMap<>();
		mayKey.put("ENG", 85);
		mayKey.put("MAT", 66);
		mayKey.put("HIN", 36);
		mayKey.keySet().stream().forEach(System.out::println);
		mayKey.values().stream().forEach(System.out::println);
		
		Stream<String> streamBuilder=Stream.<String>builder().add("A").add("B").add("C").add("D").add("E").build();
		streamBuilder.forEach(System.out::println);
		//5.using generator
		Stream.generate(()->"Tabrej").limit(5)
		.forEach(System.out::println);
		// COLLECTORS USING STREAM IN JAVA 8
		//----Stream to List---
		Stream.of("A","B","C","D","A","K").collect(Collectors.toList()).forEach(System.out::print);
		//----Stream to Set---
		Stream.of("A","B","C","D","A","K").collect(Collectors.toSet()).forEach(System.out::print);
		//----Stream to Map---
		Stream.of("A","B","C","D","E","K").collect(Collectors.toMap(Function.identity(), e -> e+" Data")).forEach((k,v)->System.out.println(k+"-"+v));
		// ------ Stream to Collection ----
		Stream.of("A","B","C","D","E","K").collect(Collectors.toCollection(ArrayList::new));
		// -- Stream to Set
		Stream.of("A","B","C","D","E","K").collect(Collectors.toCollection(HashSet::new));
	}

}
