package com.test.thread.executors;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfCallablTask = 4;
		ExecutorService es = Executors.newCachedThreadPool();
		MyCallable mycallTask[] = new MyCallable[noOfCallablTask];
		Future<?> futures[] = new Future[noOfCallablTask];
		
		for (int i = 0; i < noOfCallablTask; i++) {
			mycallTask[i] = new MyCallable(i);
			futures[i]=es.submit(mycallTask[i]);
		}
		
		
		for (int i = 0; i < noOfCallablTask; i++) {
          try
          {
        	System.out.println(" Ending Task: "+futures[i].get());  
          }
          catch (Exception e) {
			// TODO: handle exception
		}
          es.shutdown();
   List<Runnable> waitingTaskList=       es.shutdownNow();  // return task list waiting in queue
		}

	}

}
