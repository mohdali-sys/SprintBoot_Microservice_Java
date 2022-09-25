package com.test.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain
{
    public static void main(String[] args)
    {
        Country indiaCountry = new Country(1, "India");
        Country usaCountry = new Country(4, "USA");
        Country russiaCountry = new Country(3, "Russia");
        Country japanCountry = new Country(2, "Japan");
        Country franceCountry = new Country(5, "France");

        List<Country> listOfCountries = new ArrayList<>();
        listOfCountries.add(indiaCountry);
        listOfCountries.add(usaCountry);
        listOfCountries.add(russiaCountry);
        listOfCountries.add(japanCountry);
        listOfCountries.add(franceCountry);

        System.out.println("Before Sort  : ");
        for (int i = 0; i < listOfCountries.size(); i++)
        {
            Country country = listOfCountries.get(i);
            System.out
                .println("Country Id: " + country.getCountryId() + "||" + "Country name:" + country.getCountryName());
        }
        Collections.sort(listOfCountries);

        System.out.println("After Sort  : ");
        for (int i = 0; i < listOfCountries.size(); i++)
        {
            Country country = listOfCountries.get(i);
            System.out
                .println("Country Id: " + country.getCountryId() + "|| " + "Country name: " + country.getCountryName());
        }
    }
}
