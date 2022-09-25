package com.test.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest
{
    public static void main(String[] args)
    {
        // Creating an object of above class
        // in the main() method
        Task task = new Task("GeeksForGeeks");

        ExecutorService es = Executors.newFixedThreadPool(10);
        Future<String> result = es.submit(task);
        try
        {
            System.out.println("Result: " + result.get());
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ExecutionException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
