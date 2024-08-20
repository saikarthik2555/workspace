package com.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInteger {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(123);			//11
		hs.add(123);			//d
		hs.add(24);				//8
		hs.add(56);				//8
		hs.add(123);			//d
		hs.add(16);				//1
		hs.add(11);				//11
		hs.add(67);				//3
		//bottom to top
		//right to left
		System.out.println(hs);
		Iterator<Integer> i=hs.iterator();
		i.forEachRemaining(t-> System.out.println(t));
		}
}
