package com.test.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortingTest
{

    public static void main(String[] args)
    {
        // Available 4 contructors
        // new ArrayList<>();
        // new ArrayList<E>(Collection);
        // new ArrayList<>(int initialCapacity);

        List<String> stringList = new ArrayList<>();

        stringList.add("tabrej");
        stringList.add("shibu");
        stringList.add("khan");
        stringList.add("Ahamad");
        Set<String> stringSet = new HashSet<>(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);

        /*     It means that HashSet does not maintains the order of its elements. Hence sorting of HashSet is not possible.
        
        However, the elements of the HashSet can be sorted indirectly by converting into List or TreeSet, but this will keep the elements in the target type instead of HashSet type.
        */
        // Available 4 contructors
        // new HashSet<String>()
        // new HashSet<String>(Collection)
        // new HashSet<E>(int initialCapacity)
        // new HashSet<E>(int initialCapacity, float loadFactor)
        System.out.println("Before  sort set:" + stringSet);
        System.out.println("After sort set:" + new TreeSet<>(stringSet));

    }

    // function to sort hashmap by values
    Map<String, Integer> getSortedMap(Map<String, Integer> map)
    {
        List<Map.Entry<String, Integer>> linkedList = new LinkedList<>(map.entrySet());
        Collections.sort(linkedList, (i1, i2) -> i2.getValue().compareTo(i1.getValue()));

        Map<String, Integer> sortedLinkedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : linkedList)
        {
            sortedLinkedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedLinkedMap;

    }

}
