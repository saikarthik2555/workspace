package com.array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(10);
		ar.add(11);
		ar.add(12);
		ar.add(13);
		ar.add(14);
		ar.add(15);
		System.out.println(ar.removeAll(ar.subList(1, 4)));
		System.out.println(ar);
		ArrayList<String> a=new ArrayList<>();		//for forward and backward in Array List
		a.add("sai");
		a.add("karthik");
		a.add("Baja");
		ListIterator<String> lst=a.listIterator();
		while(lst.hasNext()) {
			System.out.println(lst.next());
		}
		List<String> ar1=new ArrayList<>();
		ar1.add("Blue");
		ar1.add(1,"Red");
		ar1.add(2,"Green");
//	
//		Consumer<String> c=new Consumer<>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s+"Hello");
//			}
//		};
//		c.accept("Blue ");
//		
//		System.out.println(ar1);
		ar1.forEach(w -> System.out.println(w));
//		//ar1.forEach(System.out::println);
//		//System.out.println(ar1);
////		ArrayList<Integer> a1=new ArrayList<>();
////		a1.add(1);
////		a1.add(3);
////		//a1.add(0,5);	
////		System.out.println(a1.indexOf(1));
		ArrayList<String> ar2=new ArrayList<>();
		ar2.add("Sunday");
		ar2.add("Monday");
		ar2.add("Tuesday");
		ar2.add("Wednesday");
		ar2.add("Thursday");
//		for retrieving forward and backward we use 
//		list Iterator
		ListIterator<String> l=ar2.listIterator();
		l.forEachRemaining(t -> System.out.println(t));
	}

}
