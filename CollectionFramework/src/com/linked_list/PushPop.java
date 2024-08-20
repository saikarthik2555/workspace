package com.linked_list;

import java.util.LinkedList;

public class PushPop {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>();
		l.add(12);
		l.add(23);
		l.add(45);
		l.add(42);
		System.out.println(l);
		System.out.println(l.remove());
		System.out.println(l.removeFirst());
		l.push(101);		//pushed on top on push element
		l.push(901);
		l.push(301);
		l.add(56);			//added bottom of Push
		l.add(67);
		l.push(401);
		l.push(501);
		l.add(12);
		l.add(90);
		l.push(701);
		l.push(201);
		l.forEach(i->System.out.print(i+" "));
		System.out.println();
		System.out.println(l.pop());		// for Queue the element want to go out first.so index 0
		System.out.println(l.peek());
		System.out.println(l.remove(0));    
		System.out.println(l.get(6));		
	}

}
