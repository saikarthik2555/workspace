package com.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntegerSort {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>();
		lst.add(56);
		lst.add(78);
		lst.add(25);
		lst.add(0);
		lst.add(96);
		lst.add(23);
		lst.add(12);
		Comparator<Integer> cp=new Comparator<>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				return i1.compareTo(i2);
			}
		};
		lst.sort(cp);
		System.out.println(lst);
	}
}
