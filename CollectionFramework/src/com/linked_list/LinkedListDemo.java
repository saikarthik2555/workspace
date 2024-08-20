package com.linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
		l.add("Zero");
		l.add(1,"First");
		Iterator<String> i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("==============================");
		Iterator<String> dl=l.descendingIterator();
		dl.forEachRemaining(str-> System.out.println(str));		//for reverse
		
		System.out.println("==============================");
		i.forEachRemaining(t ->System.out.println(t));	
		
		//will not repeat if upper one executes the same
		
		System.out.println("==================================");
		l.forEach(t -> System.out.println(t));	//LinkedList
		}

}
