package com.task_feb2;

public class WaitDemo {
	public static void main(String[] args) throws InterruptedException  {
		Chec c=new Chec();
			c.start();
		//	c.start();//IllegalThreadStateException
			c.display();
			System.out.println(Thread.currentThread().getState());
			 c.wait(); //IllegalMonitorStateException
			c.display1();
	}

}
class Chec extends Thread{
	public void display() {
		System.out.println("Printing");
	}
	public void display1() {
		System.out.println("Writing");
	}
}