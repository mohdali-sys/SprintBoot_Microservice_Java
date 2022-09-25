package com.test.design.singleton;

public class SingleTonBreakUsingClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
		DoubleCheckSingleton instance2 = (DoubleCheckSingleton) instance1.clone();
		    System.out.println("instance1 hashCode:- "
		                           + instance1.hashCode());
		    System.out.println("instance2 hashCode:- " 
		                           + instance2.hashCode()); 

	}

}
