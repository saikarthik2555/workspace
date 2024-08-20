package com.programs;

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
public class InterruptedExceptionDemo 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName() + " thread");

		MyTest t1 = new MyTest();
		MyTest t2 = new MyTest();

		t1.setName("Child1");
		t2.setName("Child2");
		System.out.println(0/10);
		
		//t1.start();
		//t1.start();
		try 
		  { 
			  Thread.sleep(1000);
		  }
		  catch(Exception e) 
		  {
		   System.err.println("thread has interrupted"); 
		  }
		 	
		//t2.start();	
	}
}