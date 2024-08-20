package com.task_feb2;

public class Bestway extends Thread {
	
	public void display() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("display"+Thread.currentThread().getName());
		}
	}
	
	public void display1() {
		for(int a=0;a<5;a++) 
		{
			System.out.println("display1"+Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Bestway java = new Bestway();
		java.start();
		java.display();
		java.sleep(1000); 
		//java.join();
		java.display1();
		System.out.println("mainended");
    }
}