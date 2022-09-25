package com.test.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerExample
{

    public static void main(String[] args)
    {
        // starvation?
        // Livelock?
        // BlockingQueue?
        // shutdown hook?
        // busy spinning?
        // semaphore?
        // Common buffer created using LinkedBlockingQueue
        // BlockingQueue<String> queue=new ArrayBlockingQueue<>(5);
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

        // Producer thread creation
        Thread producer = new Thread(new Producer(blockingQueue));

        // Consumer thread creation
        Thread consumer = new Thread(new Consumer(blockingQueue));

        // Start Producer and Consumer thread
        producer.start();
        consumer.start();

    }

}