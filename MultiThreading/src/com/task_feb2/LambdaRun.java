package com.task_feb2;

public class LambdaRun {
	public static void main(String[] args) {
		Thread t=new Thread(()->		System.out.println("From Runnable"));
		t.start();
	}

}
