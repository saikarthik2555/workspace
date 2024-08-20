package com.comparable;

import java.util.TreeSet;

public class ComparableDemo12 {
	public static void main(String[] args) {
		TreeSet<Product1> al=new TreeSet<Product1>();		//based on name
															//comparable use compareTo and compareTo
		al.add(new Product1(12450, "Monitor", 5200d));
		al.add(new Product1(78442, "Desk", 2000d));
		al.add(new Product1(21521, "Lamp", 2500d));
		//System.out.println(al);
		al.forEach(t->System.out.println(t)); 
	}
}
