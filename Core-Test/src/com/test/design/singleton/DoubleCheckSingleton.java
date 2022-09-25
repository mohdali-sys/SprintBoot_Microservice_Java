package com.test.design.singleton;

import java.io.Serializable;

public class DoubleCheckSingleton extends SuperClass implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton()
    {

    }
 // To resolve clone issue override clone method and thought   throw new CloneNotSupportedException();  
    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
      throw new CloneNotSupportedException();
    }

    // This example of singleton object creation with double check, This is Thread safe object
    public static DoubleCheckSingleton getInstance()
    {
        if (instance == null) // First level check
        {

            synchronized (DoubleCheckSingleton.class) // Second level check in case of multiple thread
            {
                if (instance == null)
                {
                    instance = new DoubleCheckSingleton();
                }
            }

        }
        return instance;
    }
}
