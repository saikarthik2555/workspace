package com.task_feb2;
class Test implements Runnable
{
	@Override
	public void run() {
		System.out.println("Run");
		
	}

	
	public  void start() {
		System.out.println("Start");
		run();  //super class of start()--> Runnable
					//Runnable doesn't have start() method
		//super.run();		because Runnable super class Object and object doesnt conatian run()
	}	
}
public class RunnableDemo
{
	public static void main(String[] args) {
		Thread test = new Thread(new Test());
		test.start();  //invokes run()  how?
	}
}