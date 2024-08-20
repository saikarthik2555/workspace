package com.exmOnCollection26_02_24;

import java.util.ArrayList;
import java.util.Collections;

public class MobileSorting {
	public static void main(String[] args) {
		ArrayList<Mobile> ar=new ArrayList<Mobile>();
		ar.add(new Mobile(993456789, "Redmi 12", 13000d));
		ar.add(new Mobile(227654321, "Iqoo", 14000d));
		ar.add(new Mobile(881852963,"Realme Narzo",17000d));
		ar.add(new Mobile(741963258,"Motorola",12000d));
		Collections.sort(ar);		//based on mobile number
		ar.forEach(t-> System.out.println(t));
	}

}
