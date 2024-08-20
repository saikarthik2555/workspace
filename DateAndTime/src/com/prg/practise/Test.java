package com.prg.practise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		LocalTime lt=LocalTime.now();
		LocalDateTime ldt=LocalDateTime.now();		//without zone
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);
		
		ZonedDateTime zdt=ZonedDateTime.now();			//with Zone
		System.out.println(zdt);
		ZoneId id=zdt.getZone();
		System.out.println(id);
		
		System.out.println("We dont know clients time But we know Client zone");
		System.out.println(id.getAvailableZoneIds()+"\n");
		
		ZoneId clientzone=ZoneId.of("Europe/Istanbul");
		ZonedDateTime cdt=ZonedDateTime.now(clientzone);
		System.out.println(cdt);
		
		LocalDateTime ldt1=LocalDateTime.now();
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("dd-MM-YYYY-a");
		String nldt=ldt1.format(pattern);
		System.out.println("Original DateTime : "+ldt1);
		System.out.println("Formatted DateTime : "+nldt);
	}

}
