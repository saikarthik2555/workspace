package com.programs;
public class IntProgram2 extends Thread
{

	public static void main(String[] args) 
	{
		try
		{
			Thread t= new Thread(new IntProgram2());
			//internally passing thread to thread Thread-0-->thread1
			Thread t1= new Thread(new IntProgram2());
			//internally passing thread to thread Thread-2-->thread3
//			IntProgram2 t=new IntProgram2();
//			IntProgram2 t1=new IntProgram2();
			t.start(); t1.start();
		}
		catch (Exception e)
		{
			System.out.println("e");
		}
	}
	public void run()
	{
		for(int i=0; i<2; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e)
			{
				System.out.println("e2");
			}
			System.out.println(Thread.currentThread().getName()+" ");

		}
	}
}