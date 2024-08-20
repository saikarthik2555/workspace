package com.task_feb2;
class Tet extends Thread{
//	@Override
//	public void run() {
//		System.out.println("Run");
//	}

	public void start() {
		System.out.println("Start");
		super.start();//Thread super class is Runnable
		//Runnable().start()--->
		//start()--> run();
		//Here we are Overriding  and  priority goes to current class
		//if method present call it other wise call super class
	}
	
}
public class ThreadDemo {
	public static void main(String[] args) {
		Tet t=new Tet();
		t.start();
		t.run();
	}
	
}