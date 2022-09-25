package com.test.mycollection;

public class Country1
{
    int countryId;

    String countryName;

    public Country1(int countryId, String countryName)
    {
        super();
        this.countryId = countryId;
        this.countryName = countryName;
    }

    public int getCountryId()
    {
        return countryId;
    }

    public void setCountryId(int countryId)
    {
        this.countryId = countryId;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }
}