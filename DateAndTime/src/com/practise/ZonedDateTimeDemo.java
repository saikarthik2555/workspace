package com.practise;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
	public static void main(String[] args) {
		ZonedDateTime z=ZonedDateTime.now();
		System.out.println(z); 					//with Zone
		
		//when you want to know the zone
		ZoneId id=z.getZone();
		System.out.println(id.getAvailableZoneIds());
		
		//when you want to know time of that Zone
		
		ZoneId id1=ZoneId.of("Africa/Nairobi");		//get id
		ZonedDateTime a=ZonedDateTime.now(id1);		//pass id
		System.out.println(a);
	}

}
