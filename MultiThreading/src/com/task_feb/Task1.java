package com.task_feb;

public class Task1 extends Thread {
	int start;
	int number;
	public Task1(int start,int number) {
		this.number=number;
		this.start=start;
	}
	public void run() {
		for(int i=start;i<=number;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException{
		Task1 t=new Task1(1,10);
		t.start();
		t.join();
		Task1 t1=new Task1(10,20);
		t1.start();
		t1.join();
		Task1 t2=new Task1(20,30);
		t2.start();
	}
}
