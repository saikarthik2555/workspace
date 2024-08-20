package com.programs;

public class Program13 extends Thread
{	
	public static void main(String[] args) {
		Program13 m1 = new Program13();
		Program13 m2 = new Program13();
		Program13 m3 = new Program13();
		m1.start();
		m2.start();
		m3.start();
	}
	
public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
