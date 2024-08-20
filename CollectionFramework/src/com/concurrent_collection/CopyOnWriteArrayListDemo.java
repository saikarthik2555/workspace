package com.concurrent_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	public static void main(String[] args) {
		//first create a list
		List<String> l=Arrays.asList("sunday","monday","tuessday","wednesday","thursday");
		CopyOnWriteArrayList<String> c=new CopyOnWriteArrayList<String>(l);
		System.out.println("Without modification ");
		Iterator<String> itr1=c.iterator();
		c.add("Saturday");	//create a new Array using cloning and add sto that List
		System.out.println("After Modification");
		while(itr1.hasNext()) {
			System.out.println(itr1.next()+" ht");
		}
		Iterator<String> itr2=c.iterator();
		itr2.forEachRemaining(t-> System.out.println(t));	
	}
}