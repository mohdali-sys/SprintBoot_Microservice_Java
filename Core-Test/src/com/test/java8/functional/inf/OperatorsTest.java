package com.test.java8.functional.inf;

public class OperatorsTest {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(++i); // 11
		System.out.println(i++); // 11
		System.out.println(i);
		int sum = i++;
		System.out.println(sum);
		OperatorsTest t= new OperatorsTest();
		t.m1();
		
		short s = 28;
	//	float f = 2.3;
		double d = 2.3;
		int I = '1';
		
	}

	void m1() {
		int i, j;
		i = j = 3;
		int n = 2 * ++i;
		int m = 2 * j++;
		System.out.println(i + " " + j + " " + n + " " + m);
		
		
	}
	
	void m2()
	{
		char c;
		int i;
		c = 'A';		// 1
		i = c;		//2
	//	c = i + 1;	//3
		c++;	
	}
	
	void m3()
	{
			int i,j,k,l=0;
		k = l++;
		j = ++k;
		i = j++;
		System.out.println(i);
	}

}
