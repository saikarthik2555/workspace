package com.stream_demo;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class MapStream {
	public static void main(String[] args) {
		Map<Integer,String> m=new TreeMap<Integer,String>();
		ArrayList a=new ArrayList<>();
		
		m.put(123, "Smith");
		m.put(345, "Miller");
		m.put(890, "Ford");
		m.put(567, "Jack");
		m.forEach((k,v)-> System.out.println(k+" "+v));
		
	}

}
