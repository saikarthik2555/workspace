package com.synchronized_prgs;
class Table implements Runnable{
//Not passing lock to each Thread	
	private int number;
	public Table(int number) {
		this.number=number;
	}
	@Override
	public  void run() {
		show(number);
	}
	public synchronized void show(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println(number+" X "+i+" = "+(i*number));	
				}
	}
}
public class SynchronizedDemo {
	public static void main(String[] args) {
		Table a1=new Table(5);
		Thread t=new Thread(a1);
		t.start();
		Table a2=new Table(6);
		Thread t1=new Thread(a2);
		t1.start();
	}
}
