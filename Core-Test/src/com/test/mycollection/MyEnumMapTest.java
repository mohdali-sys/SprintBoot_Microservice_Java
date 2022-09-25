package com.test.mycollection;

import java.util.EnumMap;
import java.util.Map;

//https://www.geeksforgeeks.org/difference-between-identityhashmap-weakhashmap-and-enummap-in-java/
public class MyEnumMapTest {
	
	/*
	 * 3. EnumMap: EnumMap is a specialized implementation of the Map interface for
	 * enumeration types. It extends AbstractMap and implements the Map interface in
	 * Java. Few important features of EnumMap are as follows:
	 * 
	 * EnumMap class is a member of the Java Collections Framework and it is not
	 * synchronized. EnumMap is an ordered collection, and they are maintained in
	 * the natural order of their keys(the natural order of keys means the order on
	 * which enum constant are declared inside enum type) EnumMap is much faster
	 * than HashMap. All keys of each EnumMap instance must be keys of a same enum
	 * type. EnumMap doesn’t allow to insert null key if we try to insert the null
	 * key, it will throw NullPointerException. EnumMap is internally represented as
	 * arrays therefore it gives the better performance.
	 */
	public static void main(String[] args) {
		 // Creating an EnumMap of the Days enum
        EnumMap<Months, Integer> enumMap = new EnumMap<>(Months.class);
  
        // Insert using put() method
        enumMap.put(Months.January, 31);
        enumMap.put(Months.February, 28);
        enumMap.put(Months.March, 31);
        enumMap.put(Months.April, 30);
  
        // Printing size of EnumMap 
        System.out.println("Size of EnumMap: "
                           + enumMap.size());
        // Printing the EnumMap
        for (Map.Entry<Months, Integer> m : enumMap.entrySet())
        {
            System.out.println(m.getKey() + " "
                               + m.getValue());
        }

	}
	
	 public enum Months {
	        January,
	        February,
	        March,
	        April;
	    }

}
