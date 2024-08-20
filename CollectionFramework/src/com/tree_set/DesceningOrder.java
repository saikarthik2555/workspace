package com.tree_set;

import java.util.Iterator;
import java.util.TreeSet;

public class DesceningOrder {
	public static void main(String[] args) {
		TreeSet<String> n=new TreeSet<>();
		n.add("Wednesday");
		n.add("Sunday");
		n.add("Saturday");
		n.add("Friday");
		System.out.println(n); 	//Natural Sorting Order
		Iterator<String> t=n.descendingIterator();//for decresing order one way is Iterator
		t.forEachRemaining(x-> System.out.println(x));	//from Iterator forEachRemaining
		
	}

}
