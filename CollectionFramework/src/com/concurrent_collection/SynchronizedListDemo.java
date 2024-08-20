package com.concurrent_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedListDemo {
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> alst=new ArrayList<String>();
		alst.add("Sunday");
		alst.add("Monday");
		alst.add("Tuesday");
		alst.add("Wednesday");
		alst.add("Thursday");
		alst.add("Friday");
		alst.add("Saturday");
		List<String> syncList=Collections.synchronizedList(alst);
		
		ConcurrentModificationListDemo c=new ConcurrentModificationListDemo(alst);
		c.start();
		Iterator<String> it=syncList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			Thread.sleep(1500);
		}	
	}
}
class  ConcurrentModificationListDemo extends Thread{
	ArrayList<String> ar=null;
	public ConcurrentModificationListDemo(ArrayList<String> ar) {
		this.ar=ar;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ar.add("Holiday");		
	}
}
