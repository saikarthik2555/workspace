package com.task_feb2;

class N implements Runnable 
{
	@Override
	public void run() {
		for(int a=0;a<10;a++)
		{
			System.out.println("2000 sec"+"NareshIT1");
			try {
				 Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("NIT Thread failed");
			}
		}
	}
}

class N1 implements Runnable
{
	@Override
	public void run() {
		for(int a =0;a<10;a++) 
		{
			System.out.println("NareshIT2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("NIT1 Thread failed");
			}
		}
		
	}
}

public class HierarchicalThread1 {
	public static void main(String[] args) {
		Runnable nit = new N();
		Runnable nit1 = new N1();
		
		Thread thread = new Thread(nit);
		Thread thread1 = new Thread(nit1);
		
		thread.start();
		thread1.start();
    }
}

