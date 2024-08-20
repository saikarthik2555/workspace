package com.thread_group;

public final class ThreadGroupDemo{
	public final static void main(String[] args) {
		ThreadGroup group=new ThreadGroup("NIT1");
		Thread t1=new Thread(group,new MyRunnable(),"Thread1");
		Thread t2=new Thread(group,new MyRunnable(),"Thread2");
		Thread t3=new Thread(group,new MyRunnable(),"Thread3");
		t1.start();
		t2.start();
		t3.start();
		System.out.println(group.getName());
		System.out.println(group.activeCount());//to know how many threads are active
	}
}	
//to execute mutliple Threads at a time -->ThreadGroup
//for n no. of times use for()
class MyRunnable implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());	
			}
		}
		
	}
}