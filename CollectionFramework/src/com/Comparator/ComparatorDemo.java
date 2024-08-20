package com.Comparator;

import java.util.Collections;

import java.util.Comparator;
import java.util.LinkedList;

public class ComparatorDemo {
	public static void main(String[] args) {
	LinkedList<Product> ar=new LinkedList<Product>();
	ar.add(new Product(1245, "Monitor", 5200d));
	ar.add(new Product(7842, "Desk", 2000d));
	ar.add(new Product(2121, "Lamp", 2500d));
	Comparator<Product> cmid=new Comparator<Product>() {
		public int compare(Product p1,Product p2) {
			return p1.getPid()-p2.getPid();
		}
	};//based On Id
	Collections.sort(ar,cmid);
	ar.iterator().forEachRemaining(t->System.out.println(t));
	System.out.println("----------------------------------------------------");
	Comparator<Product> cmrname=new Comparator<Product>() {
		public int compare(Product p1, Product p2) {
			return p1.getPname().compareTo(p2.getPname());
		}
	};//based on name descending order
	Collections.sort(ar,cmrname);
	ar.descendingIterator().forEachRemaining(t->System.out.println(t));
	
	//Unique descending
	
	System.out.println("------------------------------------------------------");
	Comparator<Product> cmpr=new Comparator<Product>() {
		public int compare(Product p1,Product p2) {
			return (int)(p1.getPrice()-p2.getPrice());
		}
	};//based on price
	Collections.sort(ar,cmpr);
	ar.forEach(t-> System.out.println(t));
	}
}