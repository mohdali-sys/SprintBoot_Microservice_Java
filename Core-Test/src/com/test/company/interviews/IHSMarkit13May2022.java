package com.test.company.interviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IHSMarkit13May2022 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add(5);
		list.add("one");
		list.add("five");
		list.add(5);
		list.add(2);
		list.add("three");
		list.add("five");
		list.add(2);
		list.add(1);
		list.add(1);
		list.add("four");
		// Ans - 1,1,2,2,5,5,five,five,four,one,three
		Comparator<Object> c = new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return o1.toString().compareTo(o2.toString());
			}
		};

		Collections.sort(list, c);
		System.out.println(list);

		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "1");
		map.put("B", "1");
		map.put("C", "1");
		map.put("D", "2");
		// --resultMap = reverse the Map (value as ArrayList)
		// resultMap : 1=[A,B,C], 2=[D]
		Map<String, List<String>> resultMap = new HashMap<String, List<String>>();

		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (resultMap.containsKey(entry.getValue())) {
				List<String> list1 = resultMap.get(entry.getValue());
				list1.add(entry.getKey());
				resultMap.put(entry.getValue(), list1);
			} else {
				List<String> list1 = new ArrayList<String>();
				list1.add(entry.getKey());
				resultMap.put(entry.getValue(), list1);
			}
		}

		System.out.println(resultMap);

		System.out.println(SingleTon.getInstance());
		System.out.println(SingleTon.getInstance());

		ExecutorService es = Executors.newFixedThreadPool(2);
		es.submit(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " : " + SingleTon.getInstance());

			}
		});

		es.submit(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " : " + SingleTon.getInstance());

			}
		});

	}

}

class SingleTon {
	private static volatile SingleTon instance;

	private SingleTon() {

	}

	public static SingleTon getInstance() {
		if (instance == null) {
			synchronized (SingleTon.class) {

				instance = new SingleTon();
			}
		}
		return instance;
	}

}
