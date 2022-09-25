package com.test.java8.time.logic;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MilliSecondToDateFormat {

	public static void main(String[] args) {
		Timestamp stamp = new Timestamp(System.currentTimeMillis());
		Date date = new Date(stamp.getTime());
		DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat f1 = new SimpleDateFormat("yyyy/MM/dd");
		String d = f.format(date);
		String d1 = f1.format(date);
		System.out.println(d);
		System.out.println(d1);

	}

}
