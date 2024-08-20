package com.programs;

public class Program10 extends Thread
{
	Thread thread;
	public Program10() {
		thread = new Thread(this);//current class object
								//Instead tried new Program10()--> stack over flow
		thread.start();
	}
	public void run() {
		System.out.println(thread);
		
	}	
	public static void main(String[] args) {
		new Program10();
		
	}
}
