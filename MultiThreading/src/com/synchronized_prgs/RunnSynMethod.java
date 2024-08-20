package com.synchronized_prgs;
class Test{
	public synchronized void show() {
		for(int i=1;i<=10;i++) {
		System.out.println(Thread.currentThread().getName());
		}	
	}
}
public class RunnSynMethod {
	public static void main(String[] args) {
		Test t=new Test();
		Runnable r1=() ->{
			//System.out.println(Thread.currentThread().getName());
			t.show();
		};
		Thread a1=new Thread(r1);
		a1.start();
		Runnable r2=()->{
			//System.out.println(Thread.currentThread().getName());
			t.show();
		};
		Thread a2=new Thread(r2);
		a2.start();	
	}
}