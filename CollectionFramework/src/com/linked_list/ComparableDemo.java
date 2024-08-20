package com.linked_list;

import java.util.Comparator;

public class ComparableDemo implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.id()-o2.id();
	}

}
