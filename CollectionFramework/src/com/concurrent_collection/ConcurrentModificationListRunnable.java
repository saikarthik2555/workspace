package com.concurrent_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationListRunnable {
	public static void main(String[] args) throws InterruptedException {
		List<String> at=new ArrayList<String>();
		at.add("Sunday");
		at.add("Monday");
		at.add("Tuesday");
		at.add("Wednesday");
		at.add("Thursday");
		at.add("Friday");
		at.add("Saturday");
		List<String> syncList=Collections.synchronizedList(at);//converted to synchronized
		List<String> splList=new ArrayList<String>();
		Runnable r=new Runnable() {
			@Override
			public void run() {
					synchronized(syncList) {
				syncList.forEach(str-> splList.add(str.toUpperCase()));
			}
			}
		};
		
		Thread t=new Thread(r);
		t.start();	//first starting run()
		
		Iterator<String> it=splList.iterator();
		while(it.hasNext()) {
			Thread t1=new Thread();			
			System.out.println(it.next());
		}
	}
}
