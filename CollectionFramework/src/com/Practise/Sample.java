package com.Practise;
//08-02-24
import java.util.*;

public class Sample {
	public static void main(String[] args) {
		Collection<String> c=new ArrayDeque<String>();
		Collection<String> c1=new LinkedList<String>();
		System.out.println(c.size());
		c.add("A");
		c.add("B");
		c.add("C");
		System.out.println(c);
		//c.addAll(c);//addAll --> to add specified elements to specified collection
	//	System.out.println(c.retainAll(c));
		c1.add("B");
		c1.add("8");
		c1.add("6");
		//c1.add("C");
		System.out.println(c);
		System.out.println(c1);
		c.retainAll(c1);		//common elements are stored into c
		System.out.println(c);
		System.out.println(c1);
	//	c1.clear();
		c1.removeAll(c);
		System.out.println(c1);//toString
		c1.clear();
		System.out.println(c1);

		//	Collections.addAll(c, "1","2","3");		this belongs to Collections class
		//	not collection interface here we can add elements to a collection
	}

}
