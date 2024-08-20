package com.anonymous_apch;

public class LambdaDemo {
	public static void main(String[] args) {
//		Runnable a=new Runnable() {
//			@Override
//			public void run() {
//				Thread t=Thread.currentThread();
//				for(int i=0;i<5;i++) {
//					System.out.println(t.getName());
//					
//				}
//			}
//		};
//		Thread t=new Thread(a);
//		t.start();
		Runnable a=()->{
			Thread t=Thread.currentThread();
			System.out.println(t.getName());

		};
		Thread t=new Thread(a);
		t.start();
		
	}

}
