package com.programs;

public class Program11 implements Runnable
{
	
	Thread thread;
	public Program11() {
		thread = new Thread(this,"NareshIT");  //thread name
		thread.setPriority(9); //Not Thread Id
		System.out.println(Thread.currentThread().getName());//default main thread
		thread.start();
	}
	public void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println(thread);
		
	}
//	static {
//		System.out.println("Hello");
//		new Program11();
//	}
	
	public static void main(String[] args) {
		new Program11();
		System.out.println("Main Entered");
	}
}
