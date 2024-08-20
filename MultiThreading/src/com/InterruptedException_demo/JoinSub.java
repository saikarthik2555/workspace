package com.InterruptedException_demo;

public class JoinSub {
	public static void main(String[] args) throws InterruptedException {
		Child c=new Child();
		c.setName("Child");
		c.start();
		c.join();
		System.out.println("Main ended Last");
		
	}

}
class Child extends Thread{
	@Override
	public void run() {
		Parent p=new Parent();
		p.setName("Parent");
		p.start();
		try {
			p.join();
		for(int i=0;i<5;i++) {
			System.out.println(i+" "+getName());
		}
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
class Parent extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+" "+getName());
		}
	}	
	
}