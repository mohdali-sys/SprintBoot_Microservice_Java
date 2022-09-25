package com.test.mycollection.concurrent;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeTest
{

    public static void main(String[] args)
    {
        LinkedBlockingDeque<String> premiumPhone = new LinkedBlockingDeque<>();
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

    }

}
