package com.prg.practise;

class MyTest extends Thread 
{	
	@Override
	public void run() 
	{
		for (int i = 1; i <= 5; i++) 
		{	
		      //Child 1  and Chiild2	
			  try 
			  { 
				  Thread.sleep(1000); 
			  }
			  catch(Exception e) 
			  {
			   System.err.println("thread has interrupted"); 
			  }
			 	
			System.out.println(i + " by " + Thread.currentThread().getName());
		}
	}
}
public class SleepDemo1 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName() + " thread");

		MyTest t1 = new MyTest();
		MyTest t2 = new MyTest();

		t1.setName("Child1");
		t2.setName("Child2");
		
		t1.start();
		t2.start();	
	}
}
