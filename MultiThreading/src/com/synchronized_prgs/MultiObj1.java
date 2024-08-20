package com.synchronized_prgs;

public class MultiObj1 {
	public static void main(String[] args) {		//static no need object just class Name
		Number n1=new Number();  		//lock-1
		Number n2=new Number();			//lock-2
		
		Thread t1=new Thread() {
			public void run() {
				Number1.print();
			}
		};
		t1.start();
		Thread t2=new Thread() {
			public void run() {
				Number1.print();
			}
		};
		t2.start();
		Thread t3=new Thread() {
			public void run() {
				Number1.print();	//lock-2
			}
		};
		t3.start();
		Thread t4=new Thread() {
			public void run() {
				Number1.print();
			}
		};
		t4.start();
	}

}

class Number1{
	public static synchronized void print() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}