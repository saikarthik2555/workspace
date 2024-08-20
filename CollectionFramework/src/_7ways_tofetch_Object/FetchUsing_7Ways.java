package _7ways_tofetch_Object;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class FetchUsing_7Ways {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Audi");
		v.add("Mercedez");
		v.add("Jaquar");
		v.add("Bmw");
		v.add("Range Rover");
		System.out.println("--------------Fetching Objects--------");
		System.out.println("Using Enumeartion 1");
		Enumeration<String> en=v.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement()+" ");
		}
		System.out.println("\n"+"Using for Loop 2");
		for(int i=0;i<v.size();++i) {
			System.out.print(v.get(i)+" ");		//from List
		}
		System.out.println("\n"+"Using forEach 3");
		for(String i: v) {
			System.out.print(i+" ");
		}
		System.out.println("\n"+"Using Iterator 4");
		Iterator<String> i=v.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\n"+"Using ListIterator 5");
		ListIterator<String> l=v.listIterator();
		while(l.hasNext()) {
			System.out.print(l.next()+" ");
		}
		System.out.println("\n"+"Reverse Using List Ietrator");
		while(l.hasPrevious()) {
			System.out.print(l.previous()+" ");
		}
		System.out.println("\n"+"Using forEach method 6");
		v.forEach(str -> System.out.print(str+" "));
		
		System.out.println("\n"+"Using Method Reference 7");
		System.out.println("Learning");
	}

}
