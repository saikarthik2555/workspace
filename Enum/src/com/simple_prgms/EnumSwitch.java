package com.simple_prgms;


public class EnumSwitch {
	 enum Day {									
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}
	public static void main(String[] args) {
		
		Day d[]=Day.values();
		switch(d[0]) {
		case MONDAY: System.out.println("Today is monday"); break;
		case TUESDAY : System.out.println("Thday is tuesday"); break;
		case WEDNESDAY: System.out.println("Today is wednesday"); break;
		default : System.out.println("No Leave No Rest");
		}
	}

}
