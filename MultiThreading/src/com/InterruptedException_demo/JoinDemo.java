package com.InterruptedException_demo;

class Samplee extends Thread{
	public Samplee(String str) {
		super(str);
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				sleep(1000);
				System.out.println(i+" "+getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException{
		Samplee s1=new Samplee("Child1");
		s1.start();
		s1.join();//to put current execution thread into waiting state
		Samplee s2=new Samplee("Child2");
		s2.start();
		s2.join();
		Samplee s3=new Samplee("Child3");
		s3.start();
		s3.join();
		
		System.out.println("Main Method");
		
		
	}

}
