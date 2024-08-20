package com.drawback_ofmultithreading;
//first cut the ticket then show the seat
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
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class CinemalTicket
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