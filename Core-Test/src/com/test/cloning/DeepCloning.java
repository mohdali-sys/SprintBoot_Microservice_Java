package com.test.cloning;

public class DeepCloning implements Cloneable {

	int x = 10;
	int y = 20;

	Address add = new Address();

	public DeepCloning clone() throws CloneNotSupportedException {
		DeepCloning d = (DeepCloning) super.clone();
		d.add = this.add.clone();
		return d;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		DeepCloning d = new DeepCloning();
		DeepCloning clone = d.clone();
		System.out.println(d);
		System.out.println(clone);
		System.out.println(d.add == clone.add);
	}

}
