package com.test.design.singleton;

import java.lang.reflect.Constructor;

public class SingleTonBreakUsingReflectionAPI {

	public static void main(String[] args) {

		DoubleCheckSingleton instance1 = DoubleCheckSingleton.getInstance();
		DoubleCheckSingleton instance2 = null;
		try {
			Constructor[] constructors = DoubleCheckSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instance2 = (DoubleCheckSingleton) constructor.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("instance1.hashCode():- " + instance1.hashCode());
		System.out.println("instance2.hashCode():- " + instance2.hashCode());
		System.out.println("EnumSingleTon1.hashCode():- " + EnumSingleTon.INSTANCE.hashCode());
		System.out.println("EnumSingleTon2.hashCode():- " + EnumSingleTon.INSTANCE.hashCode());
	}
}
