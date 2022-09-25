package com.test.mycollection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

//https://www.geeksforgeeks.org/difference-between-identityhashmap-weakhashmap-and-enummap-in-java/
public class MyWeakHashMapTest {
	/*
	 * 2. WeakHashMap: WeakHashMap is the implementation of the Map interface that
	 * stores only weak keys. In WeakHashMap, we can store only weak references of
	 * its key that allows a key-value pairs to be garbage collected when its key is
	 * no longer in ordinary use. WeakHashMap is the HashTable based implementation,
	 * but it is not synchronized. It allows you to store both null key and null
	 * values.
	 */	public static void main(String[] args) {
Map<Number, String> whmap = new WeakHashMap<Number, String>();
        
        whmap.put(1, "geeks");
        whmap.put(2, "4");
        whmap.put(3, "geeks");
        whmap.put(4, "welcomes");
        whmap.put(5, "you");
  
        // Displaying weak hash map
        System.out.println("WeakHashMap is : " + whmap);
  
        // Checking if "welcomes" exist
        if (whmap.containsValue("welcomes"))
            System.out.println("Yes welcomes exist");
  
        // Checking if 3 exist as a key in map
        if (whmap.containsKey(3))
            System.out.println("Yes 3 exist");
        
        // Creating set for key
        Set<Number> keyset = whmap.keySet();
        
        // Displaying key set
        System.out.println("key Set : " + keyset);
        
        Collection<String> values = whmap.values();
        
        // Displaying values of map
        System.out.println("Values : " + values);
  
        // Removing all data
        whmap.clear();
  
        // Checking whether map is empty or not
        if (whmap.isEmpty())
            System.out.println("Empty WeakHashMap: " + whmap);

	}

}
