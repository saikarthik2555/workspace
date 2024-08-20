package com.concurrent_collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteRunnable {
	public static void main(String[] args) throws InterruptedException {
		CopyOnWriteArrayList<String> cpy=new CopyOnWriteArrayList<>();
		cpy.add("Sunday");
		cpy.add("Monday");
		cpy.add("Tuesday");
		cpy.add("Wednesday");
		cpy.add("Thursday");
		cpy.add("Friday");
		cpy.add("Saturday");
		ConcurrentModificationAdd cadd=new ConcurrentModificationAdd(cpy);
		cadd.start();
		Iterator<String> itr1=cpy.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			Thread.sleep(1500);
		}
		System.out.println("...........................................");
		Iterator<String>itr2=cpy.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}	
	}
}
class ConcurrentModificationAdd extends Thread{
	CopyOnWriteArrayList<String> al=null;
	public ConcurrentModificationAdd(CopyOnWriteArrayList<String> al) {
		this.al=al;
	}
	public void run() {
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		al.add("Holiday");
	}
}
