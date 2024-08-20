package com.programs;

public class Program12 extends Thread{
	@Override
	public void run() {
		long n =Thread.currentThread().getId();
		System.out.println(n);
	}
public static void main(String[] args) {
	Thread t=new Thread();
	t.start();
	Thread t1=Thread.currentThread();
	System.out.println(t1+" main");
}
}
