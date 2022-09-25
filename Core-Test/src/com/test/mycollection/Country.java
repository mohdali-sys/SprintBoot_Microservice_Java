package com.test.mycollection;

//If this.countryId < country.countryId:then compare method will return -1
//If this.countryId > country.countryId:then compare method will return 1
//If this.countryId==country.countryId:then compare method will return 0

public class Country
    implements Comparable<Country>
{
    int countryId;

    String countryName;

    public Country(int countryId, String countryName)
    {
        super();
        this.countryId = countryId;
        this.countryName = countryName;
    }

    @Override
    public int compareTo(Country country)
    {
        // return (countryId < country.countryId) ? -1 : (countryId > country.countryId) ? 1 : 0; // sort based on
        // countryId
        // return Integer.valueOf(countryId).compareTo(Integer.valueOf(country.getCountryId()));
        return countryName.compareTo(country.getCountryName()); // sort based on countryName, String already
        // implemented
        // comparable interface so have defaul nature sorting
        // logic.
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
