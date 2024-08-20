package com.task_feb2;

public class Lock {
	public synchronized void print(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println((i*number));
		}
		
	}
	
	public static void main(String[] args) {
		Lock p=new Lock();			//lock
		
		Runnable r=() ->p.print(12);
		Thread t=new Thread(r);
		t.start();
		Runnable r1=()->p.print(12);		//same lock
		Thread t1=new Thread(r1);
		t1.start();
	}

}
