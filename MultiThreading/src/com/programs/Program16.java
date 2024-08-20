package com.programs;

class Te extends Thread
{
	@Override
	public void run() {
		System.out.println("Run");
		super.run();
	}
	
	@Override
	public synchronized void start() {
		System.out.println("Start");
		super.start();		//runnable is super of start..it goes to runnable 
							//here we are calling start() -->calling run
	}	
}
public class Program16
{
	public static void main(String[] args) {
		nit();
	}
	
	static public void nit() {
		Te test = new Te();
		test.start();
	}
}