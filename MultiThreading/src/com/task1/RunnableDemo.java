package com.task1;

public class RunnableDemo {
public static void main(String[] args) {
	//to create runnable thread
	Runnable r=new Runnable() {
		@Override 
		public void run() {
			System.out.println("Runnable thread");
		}
	}; //functional interface
		Thread p=new Thread(r);
		p.start();
	
	}
}
