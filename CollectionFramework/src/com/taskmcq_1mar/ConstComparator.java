package com.taskmcq_1mar;

import java.util.Comparator;
import java.util.TreeSet;

public class ConstComparator {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>((e1,e2)-> e2.compareTo(e1));	//Comparable
		t.add(21);
		t.add(45);
		t.add(90);
		t.add(31);
		t.add(2);
		System.out.println(t);
		t.stream().sorted(new Comparator<Integer>() {	
			@Override
			public int compare(Integer i1,Integer i2) {
				return i1+i2;
			}
		}).forEach(a -> System.out.print(a+" "));
		
	    	
	}
}
