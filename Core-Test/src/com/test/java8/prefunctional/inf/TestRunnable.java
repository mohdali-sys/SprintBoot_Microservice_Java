package com.test.java8.prefunctional.inf;

public class TestRunnable {

	public static void main(String[] args) {
	
	Runnable run =() -> { System.out.print("This thread created using lamda exp");};
		
		
		new Thread(() -> 
		
		{
			for(int i=0;i <100; i++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("This thread created using lamda exp");	
			}
		}
		).start();
		
		for(int i=0; i < 100; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("This is main thread");
		}

	}

}
