package com.test.design.builder;

public class TestBuilderPattern
{
    /*   Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a
     *  method that will actually return the final Object.
    */

    public static void main(String[] args)
    {
        // Using builder to get the object in a single line of code and
        // without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
            .setGraphicsCardEnabled(true).build();
        System.out.println(comp);
        System.out.println(comp.isBluetoothEnabled());
    }
}
