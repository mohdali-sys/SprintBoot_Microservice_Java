package com.test.java8.prefunctional.inf;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Consumer;

public class TestConsumerFunationalInf
{
    public static void main(String[] args)
    {
        Consumer<String> c = s -> System.out.println(s);

        c.accept("This consumer functional test");
        
        
        TreeMap m;
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");

        stringList.stream().forEach(c1 -> System.out.println(c1));

        stringList.forEach(c2 -> System.out.println(c2));
        // stringList.removeIf(b -> {
        System.out.println();
        // });
        
        Consumer<String> c1 = (e) -> System.out.println("Hello c1 :"+ e);
        Consumer<String> c2 = (e) -> System.out.println("Hello  c2 :"+e);
        c1.andThen(c2).accept("Hi");
        
    }

}
