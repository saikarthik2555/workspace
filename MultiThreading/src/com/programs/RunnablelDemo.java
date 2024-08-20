package com.programs;
class A implements Runnable{
	@Override
	public void run() {
		System.out.println("hi"+Thread.currentThread().getName());
	}
}
class B implements Runnable{

	@Override
	public void run() {
	new A().run();
	new Thread(new A(),"Parent").start();//new Thread
	new Thread(new A(),"Baap").start();//new Thread
	System.out.println("Hello"+Thread.currentThread().getName());
	}
	
}
public class RunnablelDemo {
	public static void main(String[] args) {
		//main thread
		new Thread(new B(),"Child").start();// creates thread as Child
		new Thread(new B(),"Child").run();//does not create new thread
	}
}
