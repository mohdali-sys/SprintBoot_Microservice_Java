package com.test.oops.polymorphism.runtime.exceptionoverriding;

import java.io.IOException;

public class HandleCheckedException {

	public static void main(String[] args) throws IOException{
	// 1. If checked exception not through by called method then should not need to handle(But for Exception class we can handle its exceptional class)
//   2. we can catch and throw checked exception in same method		
		A3 a3 = new A3();
		try {

			a3.m1();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		try
		{
			a3.m2();
		}
	
		catch (Exception e) {
			// TODO: handle exception
		}
		catch (Throwable e) {
			// TODO: handle exception
		}
	}

}

class A3 {
	public void m1() throws IOException {
//	public void m1() {

	}
	
	public void m2()  {

		}
}