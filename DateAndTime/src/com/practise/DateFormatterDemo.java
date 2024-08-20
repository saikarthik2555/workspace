package com.practise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterDemo {
	public static void main(String[] args) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-YYYY");
		LocalDate n=LocalDate.now();		//pass pattern to Localdate
		System.out.println(n.format(df));
	}

}
