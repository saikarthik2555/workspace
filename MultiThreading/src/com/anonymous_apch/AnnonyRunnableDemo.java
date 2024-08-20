package com.anonymous_apch;

public class AnnonyRunnableDemo implements Runnable {
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		t.setName("Childoo");
		System.out.println(t.getName());
	}
	public static void main(String[] args) { //Anonymous Approach
//		Runnable r=new Runnable() {
//			@Override
//			public void run() {
//				Thread t=Thread.currentThread();
//				System.out.println(t.getName());
//			}
//		};
//		Thread t=new Thread(r,"Child");
//		//public class Thread implements Runnable{
//		//puibic Thread(Runnable target,String name);
//		t.start();
		AnnonyRunnableDemo a=new AnnonyRunnableDemo();
		Thread t=new Thread(a);
		t.start();
		
	}

}
