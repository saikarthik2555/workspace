package com.drawback_ofmultithreading;
//drawback of multithreading
//In multithreading if the optaion is read and to perform on unmodifiable data
//then multithreading is good
class Customer implements Runnable
{
	private int availableSeat = 50;	
	private int wantedSeat;	
	
	public Customer(int wantedSeat) 
	{
		super();
		this.wantedSeat = wantedSeat;
	}

@Override
public void run() 
{
  String name = null;
		
	if(availableSeat >= wantedSeat)
	{
	  name = Thread.currentThread().getName();
	  System.out.println(wantedSeat +" seat is reserved for :"+name);
	  availableSeat = availableSeat - wantedSeat;	
	}
	else
	{
		name = Thread.currentThread().getName();
		System.err.println("Sorry !"+name+" ticket is not available");
	}
				
	}
	
}

public class RailwayReservation 
{
	public static void main(String[] args) 
	{
		Customer c = new Customer(35);
		Customer c1=new Customer(23);
		
		Thread t1 = new Thread(c,"Scott");
		Thread t2 = new Thread(c1,"John");
		
		t1.start();
		t2.start();
	}

}