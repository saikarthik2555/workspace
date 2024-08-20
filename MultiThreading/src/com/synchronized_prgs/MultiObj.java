package com.synchronized_prgs;

public class MultiObj {
	public static void main(String[] args) {
		Number n1=new Number();  		//lock-1
		Number n2=new Number();			//lock-2
		
		Thread t1=new Thread() {
			public void run() {
				n1.print();
			}
		};
		t1.start();
		Thread t2=new Thread() {
			public void run() {
				n1.print();
			}
		};
		t2.start();
		Thread t3=new Thread() {
			public void run() {
				n2.print();	//lock-2
			}
		};
		t3.start();
		Thread t4=new Thread() {
			public void run() {
				n2.print();
			}
		};
		t4.start();


	}

}

class Number{
	public synchronized void print() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}