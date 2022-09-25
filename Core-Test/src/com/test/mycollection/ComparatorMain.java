package com.test.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain
{

    public static void main(String[] args)
    {
        Country1 indiaCountry = new Country1(1, "India");
        Country1 usaCountry = new Country1(3, "USA");
        Country1 russiaCountry = new Country1(4, "Russia");
        Country1 japanCountry = new Country1(2, "Japan");

        List<Country1> listOfCountries = new ArrayList<>();
        listOfCountries.add(indiaCountry);
        listOfCountries.add(usaCountry);
        listOfCountries.add(russiaCountry);
        listOfCountries.add(japanCountry);

        System.out.println("Before Sort by id : ");
        for (int i = 0; i < listOfCountries.size(); i++)
        {
            Country1 country = listOfCountries.get(i);
            System.out
                .println("Country Id: " + country.getCountryId() + "||" + "Country name: " + country.getCountryName());
        }
        Collections.sort(listOfCountries, new CountrySortByIdComparator());

        System.out.println("After Sort by id: ");
        for (int i = 0; i < listOfCountries.size(); i++)
        {
            Country1 country = listOfCountries.get(i);
            System.out
                .println("Country Id: " + country.getCountryId() + "|| " + "Country name: " + country.getCountryName());
        }

        // Sort by countryName
        Collections.sort(listOfCountries, new Comparator<Country1>()
        {

            @Override
            public int compare(Country1 o1, Country1 o2)
            {
                return o1.getCountryName().compareTo(o2.getCountryName());
            }
        });

        System.out.println("After Sort by name: ");
        for (int i = 0; i < listOfCountries.size(); i++)
        {
            Country1 country = listOfCountries.get(i);
            System.out
                .println("Country Id: " + country.getCountryId() + "|| " + "Country name: " + country.getCountryName());
        }
    }

}
