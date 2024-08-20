package com.task_feb2;

public class HierarchicalThread {
public static void main(String[] args) {
	//NIT r=new NIT();		//
	Runnable r=new NIT();		//
	Runnable r1=new NIT1();
	Thread t=new Thread(r);
	Thread t1=new Thread(r1);
	t1.start();
	t.start();
	
	
}
}
class NIT implements Runnable{

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
	}
}
}
class NIT1 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("Hi");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
		}
	}
}