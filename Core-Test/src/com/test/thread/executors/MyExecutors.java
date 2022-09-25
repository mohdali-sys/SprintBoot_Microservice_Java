package com.test.thread.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutors {

	// Q1 Fixed Thread Pool Vs Cached Thread Pool

	// ==============Fixed Thread Pool=====================
	// Creates a thread pool that reuses a fixed number of threads operating off a
	// shared unbounded queue. At any point, at most nThreads threads will be active
	// processing tasks. If additional tasks are submitted when all threads are
	// active, they will wait in the queue until a thread is available. If any
	// thread terminates due to a failure during execution prior to shutdown, a new
	// one will take its place if needed to execute subsequent tasks. The threads in
	// the pool will exist until it is explicitly shutdown.
// ============================== Cached Thread Pool =================================
//	Creates a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available. 
//	These pools will typically improve the performance of programs that execute many short-lived asynchronous tasks. Calls to execute will reuse previously constructed 
//	threads if available. If no existing thread is available, a new thread will be created and added to the pool.
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(100);
		ExecutorService es1 = Executors.newCachedThreadPool();
		// execute method have no return type
		es.execute(() ->

		{
			for (int i = 0; i < 10; i++) {
				try
				{
				System.out.println("This es thread : "+Thread.currentThread().getName());
				Thread.sleep(1000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		es.submit(() ->

		{
			for (int i = 0; i < 10; i++) {
				try
				{
				System.out.println("This es thread : "+Thread.currentThread().getName());
				Thread.sleep(1000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
	}
}
