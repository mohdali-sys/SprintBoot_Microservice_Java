package com.test.mycollection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;


// https://www.geeksforgeeks.org/difference-between-identityhashmap-weakhashmap-and-enummap-in-java/
public class MyIdentifyHashMapTest
{

    public static void main(String[] args)
    {
		/*
		 * 1. IdentityHashMap: The IdentityHashMap implements the Map interface. It
		 * follows reference-equality in place of object-equality when comparing keys
		 * (and values). This class is used when the user requires the objects to be
		 * compared via reference. It is not synchronized and must be synchronized
		 * externally. The iterators in this class are fail-fast, throw
		 * ConcurrentModificationException in an attempt to modify while iterating.
		 */      
    	Map<Integer, String> identifyHashMap = new IdentityHashMap<>();
        identifyHashMap.put(1, "Tabrej");
        identifyHashMap.put(3, "Shibu");
        identifyHashMap.put(1, "Khan");
        identifyHashMap.put(2, "Ahamad");

        System.out.println(identifyHashMap);
        
        
        // Created HashMap and IdentityHashMap objects

        Map<String,String> hashmapObject = new HashMap<>();
        Map<String,String> identityObject = new IdentityHashMap<>();
        
       
       // Putting  keys and values in HashMap and IdentityHashMap Object

        hashmapObject.put(new String("key") ,"Google"); 
        hashmapObject.put(new String("key") ,"Facebook"); 
       

        identityObject.put(new String("identityKey") ,"Google"); 
        identityObject.put(new String("identityKey") ,"Facebook"); 

        // Print HashMap and IdentityHashMap Size : After adding  keys
       
        System.out.println("HashMap after adding key :"+ hashmapObject);
        System.out.println("IdentityHashMap after adding key :"+ identityObject);

    }

}
