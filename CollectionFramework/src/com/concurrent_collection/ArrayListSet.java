package com.concurrent_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListSet {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(45);
		al.add(23);
		al.add(56);
		al.add(78);
		al.add(67);
		System.out.println(al);
		Set s=new HashSet<>(al);
		System.out.println(s);
	}

}
