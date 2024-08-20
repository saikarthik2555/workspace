package com.tree_set;

import java.util.TreeSet;

public class ManualSorting{
	public static void main(String[] args) {
		TreeSet<Student> t=new TreeSet<>();
		t.add(new Student(42, "Sai Karthik", 22000.0));
		t.add(new Student(57, "Vamshi", 27000.0));
		t.add(new Student(19, "Hema", 25000.0));
		t.add(new Student(202, "Ganguly", 24000.0));		//sorting based on fees
		
	//	Collections.sort(t,(std1,std2)-> std1.g);	//non-comparable error
		
	//here Comparable and Comparator are not applicable because 
		//Collections.sort(List L) list as parameter
		//But how it is calling compareTo() 
		// I think as we know SortedSet provide default natural sorting.When Integer it invokes
		// compareTo() internally ...when String it invokes compareTo() internally
		//Here we are specifying the compareTo() method with fees.
		
		System.out.println(t);
	}
}