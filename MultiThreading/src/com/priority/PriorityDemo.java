package com.priority;

public class PriorityDemo extends Thread{
	public void run() {
		int count=0;
		for(int i=1;i<=1000000;i++) {
			count++;
		}
		System.out.println(Thread.currentThread().getName()+count);
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		PriorityDemo p1=new PriorityDemo();
		PriorityDemo p2=new PriorityDemo();
		Thread t=new Thread();
		System.out.println(t.getPriority());	//5
		p1.setPriority(Thread.MIN_PRIORITY);	//1
		p2.setPriority(Thread.MAX_PRIORITY);	//10
		p1.setName("First");
		p2.setName("Second");
		p1.start(); p2.start();
		
		}

}
