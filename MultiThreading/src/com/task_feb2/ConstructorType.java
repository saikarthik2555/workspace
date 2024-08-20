package com.task_feb2;

public class ConstructorType implements Runnable
{
	Thread thread;
	public ConstructorType() {			//Constructor
		thread = new Thread(this);
		thread.start();
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(thread);
		
	}	
	public static void main(String[] args) {
		new ConstructorType();
	}
}
  
//public class ConstructorType extends Thread
//{
//	Thread thread;
//	public ConstructorType() {			//Constructor
//		thread = new Thread();		//No parameter so not an runnable target
//		thread.start();
//	}
//	
//	public void start() {
//		System.out.println(Thread.currentThread().getName());   //main
//		System.out.println(thread);			//Thread[Thread-1,5,]  					 DOUBT
//		
//	}	
//	public static void main(String[] args) {
//		new ConstructorType().start();
//	}
//}


