package com.local_date;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
public static void main(String[] args) {
	System.out.println("Without Zone : "+LocalDateTime.now());
	ZonedDateTime d=ZonedDateTime.now();
	System.out.println("With Zone : "+d);
	
	DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd/MM/YYYY");
	String s=d.format(formater);
	System.out.println(s);
	}
}
