package com.taskmcq_1mar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(127);
		al.add(654);
		al.add(212);
		al.add(879);
		al.add(990);
		al.add(21);		
		List<Integer> l=al.stream().sorted((x,y)-> x.compareTo(y)).collect(Collectors.toList());
		//sorted(Comparator)	x.compareTo(y)--> ascending order  y.compareTo(x)--> descending order
		System.out.println(l);
	}

}
