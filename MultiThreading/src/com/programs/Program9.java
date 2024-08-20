package com.programs;

public class Program9 extends Thread
{
//	public void run() {
//		Thread t=Thread.currentThread();
//		t.setPriority(10);
//		System.out.print("fsdf");
//	}
	
	public void start() {
		System.out.print(Thread.currentThread().getName()+" ");
	}
	
	public static void main(String[] args) {
		Program9 nit = new Program9();
		for(int i=0;i<10;i++)
		{
			nit.start(); //start invoke run only one time
		}
	}
}
