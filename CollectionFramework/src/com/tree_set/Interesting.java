package com.tree_set;

import java.util.TreeSet;

public class Interesting {
	public static void main(String[] args) {
		TreeSet<Mobile> m=new TreeSet<Mobile>();
		m.add(new Mobile("Iqoo",6,"Blue",14000d));
		m.add(new Mobile("Realme Narzo", 8, "Gray",15000d));
		m.add(new Mobile("Redmi 12", 6, "Black",13000d));
		m.add(new Mobile("Lava Agni", 8, "Blue",18000d));
	m.forEach(t-> System.out.println(t));		 
	}
}
