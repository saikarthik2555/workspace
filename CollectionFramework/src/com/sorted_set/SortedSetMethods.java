package com.sorted_set;

import java.util.TreeSet;

public class SortedSetMethods {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(12);
		ts.add(45);
		ts.add(11);
		ts.add(89);
		ts.add(1);
		ts.add(56);
		System.out.println(ts);//Internally sorting 
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(12));		//1,11
		System.out.println(ts.tailSet(45));	 	//45,56,89
		System.out.println(ts.subSet(11, 45));	//11,12  as 45 is exclusive
		System.out.println(ts);
		ts.descendingIterator();
	}

}
