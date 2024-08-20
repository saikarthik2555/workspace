package com.HashMap;

import java.util.HashMap;
import java.util.TreeSet;

public class SetKeyDemo {
	
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		TreeSet<Integer> s=new TreeSet<Integer>();
		hm.put("key1", 101);
		hm.put("Key2", 305);
		hm.put("key3", 292);
		hm.put("key4", 10);
		hm.put("key5", 19);
		hm.put("key7", 42);
		Integer val=(Integer)hm.get("key7");	
//		System.out.println(hm.remove("key7"));
		//I want values in sorted order
		s.addAll(hm.values());
		System.out.println(s);
		String h="HashTable";
		System.out.println(h.hashCode());
		
		}

}
