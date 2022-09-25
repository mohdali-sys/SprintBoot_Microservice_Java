package com.test.java8.time.logic;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAgeExample {

	public static void main(String[] args) {
		//obtains an instance of LocalDate from a year, month and date  
		LocalDate dob = LocalDate.of(1991, 02, 19);  
		//obtains the current date from the system clock  
		LocalDate curDate = LocalDate.now();  
		//calculates the difference betwween two dates  
		Period period = Period.between(dob, curDate);  
		//prints the differnce in years, months, and days  
		System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());  


	}

}
