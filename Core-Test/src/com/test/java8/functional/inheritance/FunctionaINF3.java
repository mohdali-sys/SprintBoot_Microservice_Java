package com.test.java8.functional.inheritance;

public interface FunctionaINF3 extends FunctionaINF1, FunctionaINF2{

	
	void m1();

	@Override
	default void m2() {
		// TODO Auto-generated method stub
		FunctionaINF2.super.m2();
	}
}
