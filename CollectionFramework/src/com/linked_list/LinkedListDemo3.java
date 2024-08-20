package com.linked_list;

import java.util.*;
public class LinkedListDemo3 
{
	public static void main(String[] args) 
	{
		LinkedList<String> city = new LinkedList<> ();
         city.add("Kolkata");
		 city.add("Bangalore");
		 city.add("Hyderabad");
		 city.add("Pune");
		 System.out.println(city);   

		ListIterator<String> lt = city.listIterator();
//methods of ListIterator
		//public interface ListIterator extends Iterator();
       while(lt.hasNext())
		  {
			String cityName =  lt.next();

			if(cityName.equals("Kolkata"))
			{
                 lt.remove();
			}
			else if(cityName.equals("Hyderabad"))
			{
                 lt.add("Ameerpet");
			}
			else if(cityName.equals("Pune"))
			{
                 lt.set("Mumbai");
			}
		}
		city.forEach(System.out::println);
	}
}
