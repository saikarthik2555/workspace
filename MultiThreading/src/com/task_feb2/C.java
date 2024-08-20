package com.task_feb2;

class NITT extends Thread
{
	@Override
	public void run() {
		System.out.println(currentThread().getId());
	}
}

public class C {
	
	public static void main(String[] args) throws InterruptedException {
		for(int a = 0; a<10;a++) 
		{
		  Thread newThread = new Thread(new NITT());//we can pass Thgread as Runnable target
		  newThread.start();
		}
    }
}

