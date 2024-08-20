package com.exmOnCollection26_02_24;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TourSevices {
	int nextTourCode;
	TourSevices(){
		nextTourCode++;
	}
	public static void main(String[] args) {
		
	List<String> destination1=new ArrayList<String>();
	destination1.add("Shimla");
	destination1.add("Manali");
	destination1.add("Darjeeling");
	List<String> destination2=new ArrayList<String>();
	destination2.add("Goa");
	destination2.add("Kerala");
	destination2.add("Andaman");
	List<Tour> t=new Vector<Tour>();
	
	t.add(new Tour("Hill Station", destination1, "John", "987654321", "North"));
	t.add(new Tour("Beach Resort", destination2, "Alice", "123456789", "South"));
	t.forEach(s-> System.out.println(s));
	
	}
}



