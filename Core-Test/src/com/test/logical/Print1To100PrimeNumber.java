package com.test.logical;

public class Print1To100PrimeNumber {

	public static void main(String[] args) {

for(int i=1;i<=100;i++)
{
	int counter=0;
	for(int j=1;j<=i;j++)
	{
		if(i%j ==0)
		{
			counter=counter+1;
		}
	}
	if(counter==2)
	{
		System.out.println("This prime number: "+i);
	}
}

	}

}
