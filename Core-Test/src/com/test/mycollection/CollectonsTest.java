package com.test.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectonsTest
{
    public static void main(String[] args)
    {
        List<String> listStr = new ArrayList<>();
        listStr.add("Tabrej");
        listStr.add("Shibu");
        listStr.add("Ahamad");

        Set<String> setStr = new HashSet<>();
        setStr.add("Tabrej");
        setStr.add("Tabrej");
        setStr.add("Shibu");
        setStr.add("Ahamad");
        setStr.add("Ahamad");

        Map<Integer, String> mapStr = new HashMap<>();
        mapStr.put(2, "Tabrej");
        mapStr.put(1, "Shibu");
        mapStr.put(3, "Ahamad");

        Collections.synchronizedList(listStr);
        Collections.synchronizedSet(setStr);
        Collections.synchronizedMap(mapStr);
        Collections.sort(listStr);
        Collections.sort(new ArrayList<>(setStr));
        Collections.sort(new ArrayList<>(mapStr.values()));
        TreeSet ts = new TreeSet<>(setStr);
        System.out.println("Sorted List :" + listStr);
        System.out.println("Sorted Set :" + setStr);
        System.out.println("Sorted Map :"+mapStr);

    }
}
