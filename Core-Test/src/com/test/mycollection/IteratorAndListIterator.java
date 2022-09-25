package com.test.mycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIterator
{

    public static void main(String[] args)
    {
        List<String> stringList = new ArrayList<>();

        stringList.add("tabrej");
        stringList.add("shibu");
        stringList.add("khan");
        stringList.add("Ahamad");

        Iterator<String> itr = stringList.iterator();
        stringList.listIterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println();

        /*ListItertor backword travesing*/

        ListIterator<String> listItrFromBack = stringList.listIterator(stringList.size());

        while (listItrFromBack.hasPrevious())
        {
            System.out.println(listItrFromBack.previous());
        }
        /*ListItertor  Forword*/

        System.out.println();
        ListIterator<String> listItrFromForword = stringList.listIterator();

        while (listItrFromForword.hasNext())
        {
            System.out.println(listItrFromForword.next());
        }
    }

}
