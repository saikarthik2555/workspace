package com.tree_set;

import java.util.TreeSet;

public class TreeSetSorting {
public static void main(String[] args) {
	TreeSet<Employee> t1=new TreeSet<Employee>((e1,e2)-> e1.id()-e2.id());
	t1.add(new Employee(303 ,"Smith"));
	t1.add(new Employee(12 ,"Smith"));
	t1.add(new Employee(1 ,"Smith"));
	t1.add(new Employee(205 ,"Smith"));
	System.out.println(t1);
}
}
