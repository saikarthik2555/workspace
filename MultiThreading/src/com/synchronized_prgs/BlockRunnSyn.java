package com.synchronized_prgs;

class ThreadName{
	public void show() {
		System.out.println("hi"+Thread.currentThread().getName());
		//multiple threads allowed to method
		synchronized(this) { // checks that current object having lock or not			
			//current execution object with lock--> 
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName());
				System.out.println("hello");
			}
		}
	}
}

public class BlockRunnSyn {
	public static void main(String[] args) {
	ThreadName name=new ThreadName();
	Runnable r1=()->{ 
		name.show();		//name --> lock
	};
	Runnable r2=()->{ 
		name.show();
	};
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
	}

}
