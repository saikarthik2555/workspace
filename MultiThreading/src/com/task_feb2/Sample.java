package com.task_feb2;

import java.lang.Thread.State;

public class Sample implements Runnable
{
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Sample());
		thread.start();
		//super.start();  Runnable
		thread.run();		//Runnable	
		State s=thread.getState();
		//System.out.println(s);//Runnable
		System.out.print("nit ");
		thread.join();
		System.out.println("google ");
	}

	public void run() {
		System.out.println("NareshIT");
	}
}
