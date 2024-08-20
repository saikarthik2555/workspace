package com.programs;
class MyThrea implements Runnable
{
	String str;
	MyThrea(String str)
	{
		this.str=str;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			Thread t=Thread.currentThread();
			System.out.println(str+ " : "+i+" "+t.getName());
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Program6
{
	public static void main(String [] args) throws InterruptedException
	{
	MyThrea obj1 = new MyThrea("Cut the Ticket");
	MyThrea obj2 = new MyThrea(" Show the Seat");

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

	}
}