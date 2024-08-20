package com.programs;

public class Program1 extends Thread {
	@Override
	public void run() {
		System.out.println("Child Thread Running...");
	}
	public static void main(String[] args) {
		//to create thread the class must extend Thread class
		String t=Thread.currentThread().getName();
		System.out.println("name of this thread :"+t);
		System.out.println("Main Started ");
		Program1 p=new Program1();
		p.start();			//processor will switch
		new Program1().start();
		new Program1().start();
		System.out.println(p.isAlive());
		System.out.println("Main Ended ");
		//p.start(); IllegalThreadStateException
	}

}
