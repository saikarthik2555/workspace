package com.prg.synchronizedd;

public class SynchronizedBlock {
	public static void main(String[] args) {
		ThreadName t=new ThreadName();
		Runnable r=()-> t.printThreadName();
		new Thread(r,"child-0").start();
		new Thread(r,"child-1").start();
		new Thread(r,"child-2").start();
	}
}
class ThreadName{
	public void printThreadName() {
		String name=Thread.currentThread().getName();
		System.out.println("Thread inside method are :"+name);
		synchronized(this) {
			try {
			Thread.sleep(3000);
			System.out.println(name+"  "+this.toString());
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	  }
	}
}