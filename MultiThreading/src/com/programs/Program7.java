package com.programs;
class Check extends Thread{
	static int a;
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class Program7 {
	public static void main(String[] args) throws InterruptedException{
		Check c=new Check();//only one time
		for(int i=1;i<=10;i++) {
			c.start();	//Exception	
			//a thread can created only one time for one thread
		}

	}

}
