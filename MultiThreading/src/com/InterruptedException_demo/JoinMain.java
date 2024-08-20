package com.InterruptedException_demo;

public class JoinMain extends Thread{
	@Override
	public void run() {
		
	}
	public static void main(String[] args) throws InterruptedException{
		Thread t=Thread.currentThread();
		//System.out.println("main Start");
		t.join();//dead state
		System.out.println("Main Method ");
	}

}
