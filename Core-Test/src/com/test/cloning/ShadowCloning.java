package com.test.cloning;

public class ShadowCloning implements Cloneable{

	int x=10;
	int y=20;
	
	Address add;
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		ShadowCloning s= new ShadowCloning();
		ShadowCloning cloned=(ShadowCloning)s.clone();
		System.out.println(s);
		System.out.println(cloned);
        
		System.out.println(s.add==cloned.add);
	}
	/*
	 * @Override public String toString() { return "ShadowCloning [x=" + x + ", y="
	 * + y + "]"; }
	 */
	

}
