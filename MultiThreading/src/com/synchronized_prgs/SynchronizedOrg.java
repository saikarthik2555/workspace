package com.synchronized_prgs;

class Tablee {
	
	public synchronized void show(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println(number+" X "+i+" = "+(number*i));
		}
	}	
}
public class SynchronizedOrg {
	public static void main(String[] args) {
		Tablee obj=new Tablee();   //lock created
		Thread t1=new Thread() {  //thread-0
			@Override
			public void run() {
				obj.show(5);
			}
		};
		Thread t2=new Thread() {     //thread-1
			@Override
			public void run() {
				obj.show(7);
			}
		};
		t1.start();
		t2.start();
	}

}
