package com.synchronized_prgs;

class Tab{
	public synchronized void print(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num*i);
		}
		
	}
}
public class WithSyn {	
	public static void main(String[] args) {
		Tab a=new Tab();
		Thread t=new Thread() {
			public void run() {
				a.print(4);
			}
		};
		Thread t1=new Thread() {
			public void run() {
				a.print(40);
			}
		};
		t.start();
		t1.start();
		
	}

}