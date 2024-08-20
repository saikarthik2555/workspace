package com.exmOnCollection26_02_24;

import java.util.ArrayList;
import java.util.Collections;

public class CarSorting {
	public static void main(String[] args) {
		ArrayList<Car> ar=new ArrayList<Car>();
		ar.add(new Car(7000, "Maruthi XL6", 1200000d));
		ar.add(new Car(2000, "Kia Sonet", 1000000d));
		ar.add(new Car(2005, "Mini Cooper", 3000000d));
		Collections.sort(ar);	//based on names
		ar.forEach(t-> System.out.println(t));
	}

}
