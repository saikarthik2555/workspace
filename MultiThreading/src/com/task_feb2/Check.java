package com.task_feb2;

class West implements Runnable
{
	public void run()
	{
		{
		for(int i=0; i<2; i++)
		System.out.println(Thread.currentThread().getName()+" ");
	}
	}
	}
public class Check
{
	public static void main(String[] args) 
	{
		West t = new West();
		Thread t1 = new Thread(); t1.start(); //blank
		Thread t2 = new Thread(t,"J2EE");
		Thread t3 = new Thread(t,"J2ME");
		t2.start();t3.start();

	}
}