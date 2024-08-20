package com.task_feb2;

public class SetPriorityDemo implements Runnable
{
	Thread thread;
	public SetPriorityDemo() {
		thread = new Thread(this,"NareshIT");
		thread.setPriority(6);
		thread.start();
	}
	public void run() {
		System.out.println(thread);  //Thread[NareshIT,6,main]
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		//new SetPriorityDemo();
		Thread t=new Thread();
		t.start();
	}
}