package com.NavigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableMethods {
	public static void main(String[] args) {
		NavigableSet<Integer> ts=new TreeSet<Integer>();
	Integer a=128;
	Integer b=128;
	System.out.println(128==128);
	System.out.println(a.equals(b));
		System.out.println(a.compareTo(b));
	System.out.println(a.hashCode()==b.hashCode());
	String c="A";
	String d=new String("A");
	System.out.println(c.hashCode()==d.hashCode());
	
		ts.add(12);
		ts.add(45);
		ts.add(11);
		ts.add(89);
		ts.add(1);
		ts.add(56);
		System.out.println(ts);
		System.out.println(ts.lower(11));//1
		System.out.println(ts.lower(1));	//null
		System.out.println(ts.higher(89));//null
		System.out.println(ts.ceiling(89));	//89
		System.out.println(ts.floor(1));	//1
		
		System.out.println("================================");
		
		NavigableSet<Integer> ns = new TreeSet<>(); 
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

		System.out.println("lower(3): " + ns.lower(3));//Just below than the specified element or null

        System.out.println("floor(3): " + ns.floor(3)); //Equal  less or null
      
        System.out.println("higher(3): " + ns.higher(3));//Just greater than specified element or null

       System.out.println("ceiling(3): " + ns.ceiling(3));//Equal or greater or null 
	   

		
	}

}
