package com.test.thread.executors;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	private int taskNumber;

	MyCallable(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	@Override
	public Integer call() throws Exception {

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("This es thread : " + Thread.currentThread().getName()+"  Task Number: "+taskNumber);
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return taskNumber;
	}

}
