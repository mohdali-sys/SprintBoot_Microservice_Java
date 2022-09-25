package com.test.generic;

import java.util.ArrayList;
import java.util.List;

public class MySimpleGeneric<T> {

	public static void main(String[] args) {
		MySimpleGeneric<String> my = new MySimpleGeneric<>();
		my.show("Hello");
		// my.show(new Object()); CE
		// my.show(1); CE
	}

	public void show(T t) {
		System.out.print(t.getClass());
	

	Object o = ""; // Upcasting Possible here
	// List<Object> o1= new ArrayList<String>(); Upcasting not Possible in generic

	// Case 1: We can create generic class object without passing parameter type.
	MySimpleGeneric m = new MySimpleGeneric();
	List a = new ArrayList();
	
	// List<Shape> shapeList= new ArrayList<Rectangle>(); in generice upcasting not possible
	List<?> shapeList= new ArrayList<Rectangle>(); //in generice upcasting  possible
	//shapeList.add(new Rectangle());  Can't be add new element but can be call get
	shapeList.get(0);
	
	
	List<? extends Shape> shapeList1= new ArrayList<Rectangle>(); //in generice upcasting not possible
	//shapeList1.add(new Rectangle());    //Can't be add new element but can be call get
	List<String> strL=new ArrayList<>();
   strL.add("aa");
   
	}
}
