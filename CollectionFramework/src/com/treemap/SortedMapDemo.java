package com.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap<Integer,String> t1=new TreeMap<Integer,String>();
		t1.put(21, "Sunday");
		t1.put(45, "Monday");
		t1.put(145, "Tuesday");
		t1.put(435, "Wednesday");
		t1.put(245, "Thursday");
		t1.put(299, "Holiday");
		t1.put(745, "Friday");
		t1.put(987, "Saturday");
		System.out.println(t1.firstKey());
		System.out.println(t1.lastKey());
		System.out.println(t1.subMap(100, 300));
		System.out.println(t1.headMap(250));
		System.out.println(t1.tailMap(600));
		
	}

}
