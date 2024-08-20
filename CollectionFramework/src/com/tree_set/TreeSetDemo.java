package com.tree_set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		NavigableSet<Integer> ts=new TreeSet<Integer>();
		ts.add(12);
		ts.add(1);
		ts.add(45);
		ts.add(11);
		System.out.println(ts);
		Iterator<Integer> i=ts.descendingIterator();
		i.forEachRemaining(str-> System.out.print(str+"  "));
		
		
//		ts.addAll(ts.subSet(12, 45));	//adding duplicates
//		System.out.println(ts);
		//System.out.println(ts);
		//HashSet ->  Unorder,Unsorted,No Duplicates  one null allowed
		//LinkedHashSet -> Order,Unsorted,No Duplicates   one null allowed
		//TreeSet -> Order,Sorted,No Duplicates   no null
		//Here it internally invokes compareTo() method  
	
	}
}
