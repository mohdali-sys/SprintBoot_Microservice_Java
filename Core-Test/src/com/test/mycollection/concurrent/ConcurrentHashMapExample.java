package com.test.mycollection.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample
{
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    static final int DEFAULT_CONCURRENCY_LEVEL = 16;

    public static void main(String[] args)
    {

        ConcurrentHashMap<String, String> premiumPhone = new ConcurrentHashMap<>();
        premiumPhone.put("Apple", "iPhone6");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung", "S6");

        Iterator iterator = premiumPhone.keySet().iterator();
        System.out.println("in ConcurrentHashMap");
        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            premiumPhone.put("Sony", "Xperia Z");
        }

        hashMapTest();

    }

    private static void hashMapTest()
    {
        try
        {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("Apple", "iPhone6");
            hashMap.put("HTC", "HTC one");
            hashMap.put("Samsung", "S6");

            Iterator iterator = hashMap.keySet().iterator();
            System.out.println("in HashMap");
            while (iterator.hasNext())
            {
                System.out.println(hashMap.get(iterator.next()));
                hashMap.put("Sony", "Xperia Z");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
