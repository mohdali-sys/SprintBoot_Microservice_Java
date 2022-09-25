package com.test.mycollection.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest
{

    public static void main(String[] args)
    {

        CopyOnWriteArrayList<String> premiumPhone = new CopyOnWriteArrayList<>();
        premiumPhone.add("Apple");
        premiumPhone.add("HTC");
        premiumPhone.add("Samsung");

        Iterator iterator = premiumPhone.iterator();
        System.out.println("in CopyOnWriteArrayList");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
            premiumPhone.add("Sony");
        }

        arrayListTest();

    }

    private static void arrayListTest()
    {

        ArrayList<String> premiumPhone = new ArrayList<>();
        premiumPhone.add("Apple");
        premiumPhone.add("HTC");
        premiumPhone.add("Samsung");

        Iterator iterator = premiumPhone.iterator();
        System.out.println("in CopyOnWriteArrayList");
        try
        {
            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
                premiumPhone.add("Sony");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
