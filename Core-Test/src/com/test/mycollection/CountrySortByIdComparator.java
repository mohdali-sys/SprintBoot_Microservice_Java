package com.test.mycollection;

import java.util.Comparator;

//If country1.getCountryId() < country2.getCountryId():then compare method will return -1
//If country1.getCountryId() > country2.getCountryId():then compare method will return 1
//If country1.getCountryId()==country2.getCountryId():then compare method will return 0

public class CountrySortByIdComparator
    implements Comparator<Country1>
{

    @Override
    public int compare(Country1 country1, Country1 country2)
    {

        return (country1.getCountryId() < country2
            .getCountryId()) ? -1 : (country1.getCountryId() > country2.getCountryId()) ? 1 : 0;
    }

}
