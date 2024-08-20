package com.programs;
class NIT extends Thread
{
	@Override
	public void run() {
		
		System.out.println("1st Thread");
	}
}

class NIT1 extends Thread
{
	@Override
	public void run() {
		
		System.out.println("2nd Thread");
	}
}

public class Java8 {
	public static void main(String[] args) {
		NIT thread = new NIT();
		NIT1 thread1 = new NIT1();
		
		thread.start();
		System.out.println(thread.getPriority());//5
		System.out.println(thread.isAlive());//t
		System.out.println(thread1.isAlive());//false
		thread1.start();//
		System.out.println(thread1.getPriority());//5
		
    }
}