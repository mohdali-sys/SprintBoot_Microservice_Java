package com.test.design.singleton;

import java.lang.reflect.Constructor;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton.getInstance().setName("Tabrej");
		Singleton.getInstance().setAddress("Jaunpur");
		System.out.println("Singleton Instance 1 :" + Singleton.getInstance());

		Singleton.getInstance().setName("shibu");
		Singleton.getInstance().setAddress("Noida");
		System.out.println("Singleton Instance 2 :" + Singleton.getInstance());

		System.out.println("Singleton Instance 2 :");

		breakSingleton();
	}

	private static void breakSingleton() {
		Singleton2 instance1 = Singleton2.getInstance();
		Object instance2 = null;
		try {
			Class<?> clas = Class.forName("com.test.design.singleton.Singleton2");
			Constructor[] constructors = clas.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				//instance2 = (Singleton2) Singleton2.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("instance1.hashCode():- " + instance1.hashCode());
		// System.out.println("instance2.hashCode():- " + instance2.hashCode());
	}

}

class Singleton2 {

	private static Singleton2 instance;

	private Singleton2()
	{
		
	}

	public static Singleton2 getInstance()
	{
		if(instance == null)
		{
			instance =new Singleton2();
		}
		return instance;
	}
}
