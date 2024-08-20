package com.Linked_hashset;

import java.util.LinkedHashSet;
// To iterate/ maintain element in order
public class LinkedHashsetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		hs.add(123);			//11
		hs.add(123);			//d
		hs.add(11);				//11
		hs.add(24);				//8
		hs.add(56);				//8
		hs.add(67);				//3
		hs.add(123);			//d
		hs.add(16);				//1
		hs.add(null);
		hs.add(null); 
		//bottom to top
		//right to left
		System.out.println(hs);
//		LinkedHashSet<String> s=new LinkedHashSet<>();
//		s.add("Good Morning");
//		s.add("Today is Monday");
//		s.add("Today is Monday");	//no duplicates
//		s.add("19/02/24");
//		s.add(null);
//		System.out.println(s);
//		System.out.println(s.contains(null));
//		s.forEach(t -> System.out.println(t));
		
	}
}
