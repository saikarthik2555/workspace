package com.anonymous_apch;

public class LambdaThread {
	public static void main(String[] args) {
		Thread t=new Thread() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		};
		t.start();//can create Anonymous block for Thread
//		Thread t=()-> System.out.println("Hello");
//		t.start();	//cannot create lambda for Thread
	}

}
