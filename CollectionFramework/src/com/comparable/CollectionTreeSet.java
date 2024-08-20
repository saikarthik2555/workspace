package com.comparable;

import java.util.TreeSet;

public class CollectionTreeSet {
	public static void main(String[] args) {
		TreeSet<Product2> t=new TreeSet<Product2>();	//based on Id
	//	or												//comparable use compareTo and compareTo
	//	TreeSet<Product2> t=new TreeSet<Product2>((p1,p2)-> p1.getPid()-p2.getPid());
		t.add(new Product2(12450, "Monitor", 5200d));
		t.add(new Product2(78442, "Desk", 2000d));
		t.add(new Product2(21521, "Lamp", 2500d));
		t.forEach(t1-> System.out.println(t1));
	}
}
