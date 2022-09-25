package com.test.thread;

import java.util.concurrent.Callable;

public class Task
    implements Callable<String>
{

    // Member variable of this class
    private String message;

    // Constructor of this class
    public Task(String message)
    {
        // This keyword refers to current instance itself
        this.message = message;
    }

    @Override
    public String call()
        throws Exception

    {
        return "Hiiii " + message + "!";
    }

}
