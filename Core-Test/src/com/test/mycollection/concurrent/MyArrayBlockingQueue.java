package com.test.mycollection.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyArrayBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BlockingQueue<String> msg = new ArrayBlockingQueue<String>(10);
		msg.put("Hello");
		msg.put("Hello1");
		msg.put("Hello2");
		msg.put("Hello3");

		/**
		 * Retrieves and removes the head of this queue, waiting if necessary until an
		 * element becomes available.
		 *
		 * @return the head of this queue
		 * @throws InterruptedException if interrupted while waiting
		 */
		System.out.println(msg.take() + " " + msg.size());
		System.out.println(msg.take() + " " + msg.size());

		/**
		 * Retrieves, but does not remove, the head of this queue, or returns
		 * {@code null} if this queue is empty.
		 *
		 * @return the head of this queue, or {@code null} if this queue is empty
		 */
		System.out.println(msg.peek() + " " + msg.size());
		/*
		 * Retrieves and removes the head of this queue, or returns {@code null} if this
		 * queue is empty.
		 */

		System.out.println(msg.poll() + " " + msg.size());
		System.out.println(msg.poll() + " " + msg.size());
		// System.out.println(msg.poll() + " " +msg.size());

		/*
		 * * Retrieves and removes the head of this queue. This method differs from
		 * {@link #poll poll} only in that it throws an exception if this queue is
		 * 
		 * empty.
		 */
		// System.out.println(msg.remove() + " " +msg.size());

		Runnable runProducer = () -> {
			int count = 0;
			while (count < 10) {
				msg.add("Tab"+count);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Element produce in queue: Tab"+count);
				count++;
			}
		};

		Runnable runConsumer = () -> {
			int count = 0;
			while (count < 10) {
				try {
					//Thread.sleep(10000);
					System.out.println("Element Consumened from queue: " + msg.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				;
				count++;
			}
		};
		
		new Thread(runProducer).start();
		new Thread(runConsumer).start();
	}

}
