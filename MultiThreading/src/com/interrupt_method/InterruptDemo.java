package com.interrupt_method;

public class InterruptDemo {
	public static void main(String[] args) {
		Interrupt t=new Interrupt();
		t.start();
		t.interrupt();
	}
}
class Interrupt extends Thread{
	public void run() {
		Thread t=new Thread();
		for(int i=0;i<10;i++) {
			System.out.println(t.isInterrupted());//false means Interrupted
			System.out.println(i);//0
			try {
				Thread.sleep(1000);  //InterruptedException
			}catch(InterruptedException e) {
				e.printStackTrace();
			
			}
			System.out.println(Thread.currentThread().isInterrupted());
		}
	}
	
}