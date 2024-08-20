package com.linked_list;

import java.util.Iterator;
import java.util.LinkedList;

public class MethodsOfLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> lst=new LinkedList<>();
		lst.add(12);
		lst.add(15);
		lst.add(23);
		lst.add(89);
		lst.add(55);
		lst.add(89);
		System.out.println(lst.element());		
		System.out.println(lst);
		System.out.println(lst.peek());
		System.out.println(lst);
//		
//		
//		//for decresing order
/*		Iterator l=lst.descendingIterator();
		l.forEachRemaining(t-> System.out.print(t+" "));				*/
		
//		Integer i[]=new Integer[5];			//not working
//		i.clone();
//		for(int l=0;l<i.length;l++) {
//			System.out.println(i[l]);
//		}
		
/*		
		lst.removeLastOccurrence(89);
		lst.removeFirstOccurrence(89);
		System.out.println(lst);
		System.out.println(lst.peek());
		System.out.println(lst.peekFirst());
		System.out.println(lst.peekLast());
		System.out.println(lst.poll());	//like remove()without parameter
		System.out.println(lst.peekLast());
		System.out.println(lst.pop());	//like remove()
		System.out.println(lst);				*/
		
		
		
		
		//to add/specify element request position
//		System.out.println(lst.offer(3452));
//		System.out.println(lst.offerFirst(23));
//		lst.add(50);		//added at Last
//		lst.push(12);		//added at first	//same as offerFirst()
//		
//		System.out.println(lst.offerLast(0));
//		System.out.println(lst);
//		lst.descendingIterator();
	
	}

}
