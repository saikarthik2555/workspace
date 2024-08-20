package com.programs;

class NI extends Thread
{
	@Override
	public void run() {
		
		System.out.println("1st Thread");
	}
}

class NI1 extends Thread
{
	@Override
	public void run() {
		
		System.out.println("2nd Thread");
	}
}

public class Sampe {
	public static void main(String[] args) {
		
		NI thread = new NI();
		NI1 thread1 = new NI1();
		
		thread.start();
		System.out.println(thread.getPriority());//5
		
		System.out.println(thread.isAlive());//t
		System.out.println(thread1.isAlive());//false
		thread1.start();//
		System.out.println(thread1.getPriority());//5
		
    }
}