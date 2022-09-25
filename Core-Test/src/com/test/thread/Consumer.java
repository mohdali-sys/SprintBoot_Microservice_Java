package com.test.thread;

import java.util.concurrent.BlockingQueue;

class Consumer
    implements Runnable
{

    private final BlockingQueue<Integer> blockingQueue;

    public Consumer(BlockingQueue<Integer> blockingQueue)
    {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                System.out.println("Data consumed : " + blockingQueue.take());
            }
            catch (InterruptedException ex)
            {
                System.out.println("Consumer thread interrupted.");
            }
        }
    }
}