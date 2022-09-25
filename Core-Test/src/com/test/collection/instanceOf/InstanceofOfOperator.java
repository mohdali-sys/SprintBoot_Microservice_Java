package com.test.collection.instanceOf;

import java.util.ArrayList;
import java.util.List;

public class InstanceofOfOperator {

	public static void main(String[] args) {
		  List list = new ArrayList();
	        list.add("hello");
	        list.add(2);
	        System.out.println(list.get(0) instanceof Object); // true
	        System.out.println(list.get(1) instanceof Integer);  // true
	        
	        String s=null;
	        
	        System.out.println(s instanceof String);  // false   
	}

}
