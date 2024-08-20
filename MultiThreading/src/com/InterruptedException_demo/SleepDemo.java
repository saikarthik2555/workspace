package com.InterruptedException_demo;
class Sample extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
			Thread.sleep(1000);//should handle only try and catch
			System.out.println(i+" "+getName());
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class SleepDemo {
	public static void main(String[] args) {
		Sample s=new Sample();
		s.start();
	}

}
