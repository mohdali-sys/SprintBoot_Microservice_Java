package com.test.design.builder;

public class Computer
{

    // required parameters
    private String HDD;

    private String RAM;

    // optional parameters
    private boolean isGraphicsCardEnabled;

    private boolean isBluetoothEnabled;

    public String getHDD()
    {
        return HDD;
    }

    public String getRAM()
    {
        return RAM;
    }

    public boolean isGraphicsCardEnabled()
    {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled()
    {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder)
    {
        HDD = builder.HDD;
        RAM = builder.RAM;
        isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Builder Class
  public  static class ComputerBuilder
    {

        // required parameters
        private String HDD;

        private String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;

        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram)
        {
            HDD = hdd;
            RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled)
        {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled)
        {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build()
        {
            return new Computer(this);
        }

    }

    @Override
    public String toString()
    {
        return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
            + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
    }

}