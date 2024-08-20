package com.programs;

public class TestBoth {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		MyRunnable r=new MyRunnable();
		Thread t1=new Thread(r);
		t.start(); //thread
		t1.start();  //runnable
	
	}
}
class MyThread extends Thread{
	public void start() {
		System.out.println("start from thread");
	}
	public void run() {
		System.out.println("run from thread");
	}
}
class MyRunnable implements Runnable{
	public void start() {
		System.out.println("start from runnable");
	}
	public void run() {  //runnable has only run
		System.out.println("run from runnable");
	}
}
