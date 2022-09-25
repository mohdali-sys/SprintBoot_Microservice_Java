package com.test.design.immutable;

import java.util.HashMap;
import java.util.Map;

/* 1. The class must be declared as final (So that child classes can’t be created)
   2. Data members in the class must be declared as private (So that direct access is not allowed)
   3. Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
   4. A parameterized constructor should initialize all the fields performing a deep copy (So that data members can’t be modified with object reference)
   5. Deep Copy of objects should be performed in the getter methods (To return a copy rather than returning the actual object reference)
   6. No setters (To not have the option to change the value of the instance variable)*/

public final class Student
{
    private final String name;

    private final int regNo;

    private final Map<String, String> metadata;

    public Student(String name, int regNo, Map<String, String> metadata)
    {
        this.name = name;
        this.regNo = regNo;
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : metadata.entrySet())
        {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metadata = tempMap;
    }

    public String getName()
    {
        return name;
    }

    public int getRegNo()
    {
        return regNo;
    }

    public Map<String, String> getMetadata()
    {
        Map<String, String> tempMap = new HashMap<>(metadata);

        /* for (Map.Entry<String, String> entry : metadata.entrySet())
        {
            tempMap.put(entry.getKey(), entry.getValue());
        }*/
        return tempMap;
    }
}
