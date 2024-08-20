package com.local_date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Set;

public class ZonedDateTimeDemo {
	public static void main(String[] args) {
		ZonedDateTime z=ZonedDateTime.now();
		
		System.out.println(z);	//with zone
		
		ZoneId id=z.getZone();
		System.out.println("India id    "+id);				//our
		
		Set<String> availableZoneIds = id.getAvailableZoneIds();	//All zones around the g;obe
		System.out.print(availableZoneIds);
		
//		Iterator<String> i=availableZoneIds.iterator();
//		i.forEachRemaining(t-> System.out.println(t));
	}

}
