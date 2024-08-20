package com.concurrent_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationDemo {
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Sunday");
		a.add("Monday");
		a.add("Tuesday");
		a.add("Wednesday");
		a.add("Thursday");
		a.add("Friday");
		a.add("Saturday");
		ConcurrentModification cm=new ConcurrentModification(a);
		cm.start();//invokes run()
		
		Iterator<String> itr = a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			Thread.sleep(1500);
		}
		
	}

}
class ConcurrentModification extends Thread{
	ArrayList<String> al=null;
	public ConcurrentModification(ArrayList<String> al) {
		this.al=al;
	}

	@Override
	public void run() {	
	try {
		System.out.println("hi");
		Thread.sleep(1000);
	} catch (Exception e) {
		e.printStackTrace();
	}
	al.add("Holiday");
	
	}
	
}