package com.test.mycollection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Naveen", 100);
        map.put("Tom", 200);
        map.put("king", 300);
        map.put("Lisa", 400);
        map.put("Peter", 400);
        map.put("Robby", 400);
        map.put("Robby1", 400);
        map.put("Robby2", 400);
        map.put("Robby3", 400);
        System.out.println(map);
        
        System.out.println("Sort Map data  based on there value");
//map.entrySet().stream().sorted(comparingByValue())
    }

}
