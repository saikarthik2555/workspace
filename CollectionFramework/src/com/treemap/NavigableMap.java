package com.treemap;

import java.util.TreeMap;

public class NavigableMap {
	public static void main(String[] args) {
		TreeMap<Integer,String> nm=new TreeMap<Integer,String>();
		nm.put(745, "Friday");
		nm.put(987, "Saturday");
		nm.put(21, "Sunday");
		nm.put(45, "Monday");
		nm.put(145, "Tuesday");
		nm.put(435, "Wednesday");
		nm.put(245, "Thursday");
		nm.put(299, "Holiday");
		nm.forEach((k,v)->System.out.print(k+" "+v+", "));
		System.out.println(nm.firstEntry());
		System.out.println(nm.lastEntry());
		System.out.println(nm.higherEntry(200));
		System.out.println(nm.lowerEntry(200));
		System.out.println(nm.floorEntry(300));
		System.out.println(nm.ceilingEntry(746));
		System.out.println("===========================");
		System.out.println(nm.firstKey());
		System.out.println(nm.lastKey());
		System.out.println(nm.higherKey(1000));
		System.out.println(nm.lowerKey(100000));
		System.out.println(nm.floorKey(100));
		System.out.println(nm.ceilingKey(250));
		System.out.println("===========================");
		System.out.println(nm.subMap(100, 500));		//to get subEntry
		System.out.println(nm.headMap(300));
		System.out.println(nm.tailMap(500));
	}

}
