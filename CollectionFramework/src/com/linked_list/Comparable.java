package com.linked_list;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Comparable {
	public static void main(String[] args) {
		List<Employee> l=new Vector<>();
		l.add(new Employee(12, "Smith"));
		l.add(new Employee(7,"Ford"));
		l.add(new Employee(18, "John"));
		l.add(new Employee(2, "Clerk"));
		Collections.sort(l,new ComparableDemo());
		l.forEach(emp-> System.out.println(emp.id()+"   "+emp.name()));
	}


}
