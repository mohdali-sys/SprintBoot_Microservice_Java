package com.test.thread;

public class ThreadCounterUpdateIssueTest {
	
	//https://www.geeksforgeeks.org/difference-between-atomic-volatile-and-synchronized-in-java/

	public static void main(String[] args) throws InterruptedException {
		 // creating an thread object
		ThreadCounterUpdateIssue t = new ThreadCounterUpdateIssue();
        Thread t1 = new Thread(t, "t1");
       
        // starting thread t1
        t1.start();
        Thread t2 = new Thread(t, "t2");
       
        // starting thread t2
        t2.start();
       
        // calling join method on thread t1
        t1.join();
       
        // calling join method on thread t1
        t2.join();
       
        // displaying the count
        System.out.println("count=" + t.getCount());
		/*
		 * If we run the above program, we will notice that the count value varies
		 * between 6,7,8.9 The reason is that count++ is not an atomic operation. So by
		 * the time one thread read it’s value and increment it by one, another thread
		 * has read the older value leading to the wrong result. To solve this issue, we
		 * will have to make sure that increment operation on count is atomic.
		 */	
	}

}
