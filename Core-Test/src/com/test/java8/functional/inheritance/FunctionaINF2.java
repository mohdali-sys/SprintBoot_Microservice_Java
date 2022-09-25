package com.test.java8.functional.inheritance;

@FunctionalInterface
public interface FunctionaINF2 {
	
	void m1();
	
	default void m2()
	{
	System.out.println("FunctionaINF2 m2");	
	}

}
