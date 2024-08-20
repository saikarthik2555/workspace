package com.interrupt_method;

class Interruptt extends Thread
{
   public void run()
	{
	   try
	   {
	   Thread.currentThread().interrupt();		//disturbed the thread
		   
	    System.out.println(Thread.currentThread().getName()+Thread.currentThread().getState());
	   for(int i=1; i<=10; i++)
		{
		   System.out.println("i value is :"+i);
		   Thread.sleep(1000);
		}

	   }
		catch (InterruptedException e)
		{
			System.err.println("Thread is Interrupted :"+e);
		}
	   System.out.println(Thread.currentThread().isInterrupted());//false means Interrupted
		System.out.println("Child thread completed...");
	}
}
public class  InterruptDemo1
{
	public static void main(String[] args) 
	{
		System.out.println("Main thread is started");
		Interruptt it = new Interruptt();
		it.start();
		System.out.println("Main thread is ended");
	}
}