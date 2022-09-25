package com.test.java8.functional.inheritance;

@FunctionalInterface
public interface FunctionaINF1 {
	
	void m1();
	
	default void m2()
	{
	System.out.println("FunctionaINF1 m2");	
	}

}
