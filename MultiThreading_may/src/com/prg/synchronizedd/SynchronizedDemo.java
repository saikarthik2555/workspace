package com.prg.synchronizedd;

public class SynchronizedDemo {
	static public void main(String[] args) {
		Table t=new Table();
		Thread t1=new Thread() {
			@Override
			public void run() {
				t.printTable(5);
			}
		};
		Thread t2=new Thread() {
			@Override
			public void run() {
			t.printTable(10);
			}
		};
		t1.start();
		t2.start();
	}
}
class Table{
	public synchronized void printTable(int num) {
		for(int i=1;i<=10;++i) {
			System.out.println(i+" * "+num+" = "+(i*num));
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}