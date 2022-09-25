package com.test.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadCounterUpdateIssue  extends Thread {
	// declaring a count variable
	//private int count;
	
	/*
	 * Below program will always output count value as 8 because AtomicInteger
	 * method incrementAndGet() atomically increments the current value by one.
	 */
	private AtomicInteger count = new AtomicInteger();
	public void run() {
		// calculating the count
		for (int i = 1; i <= 5; i++) {

			try {
				Thread.sleep(i * 100);
			//	count++;
				
				// calling incrementAndGet() method
                // on count variable
                count.incrementAndGet();
			} catch (InterruptedException e) { // throwing an exception
				System.out.println(e);
			}
		}
	}

	// returning the count value
	/*
	 * public int getCount() { return this.count; }
	 */
	
	 public AtomicInteger getCount() { return count; }
}
