package com.local_date;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PlaceZoneGetTime {
	public static void main(String[] args) {
		ZoneId id=ZoneId.of("Asia/Calcutta");
		ZonedDateTime dt=ZonedDateTime.now(id);
		System.out.println(dt);
		
		System.out.println("---------------------");
		
		ZonedDateTime d=ZonedDateTime.now();
		System.out.println(d);
		LocalDateTime l=LocalDateTime.now();
		
	}

}
