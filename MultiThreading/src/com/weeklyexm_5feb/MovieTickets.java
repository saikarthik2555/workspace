package com.weeklyexm_5feb;
//Question down
class MovieTickets implements Runnable{
	int ticketAvailable=100;
	int customer;
	String customerName;
	public MovieTickets(int customer) {
		this.customer=customer;
	}	
	@Override
	public void run() {
		customerName=Thread.currentThread().getName();
		if(ticketAvailable>=0)
		{
			System.out.println(customer+" tickets are allotted to "+customerName);
			}
		else {
			System.out.println(customer+" tickets are not available");
		}
		}
}
class Customer {
	public static void main(String[] args) {
		
	}
	
}
/*
Program-1
---------

We have Three classes named as MovieTickets, Customer and Test

For MovieTickets class which is implemented by Runnable interface

Instance Variables:

ticketAvailable :int: default : Initialize to desire/ any number

customer: int: default

Methods:

movieTickets(int) : Constructor with one parameter

run(): override from Runnable interface

Local Variable:

customerName :String: Initialize the variable form getName() of thread

if the tickets are available it prints 'movie tickets are allotted to customerName' or else it prints 'movie tickets are not available'



For example 3 movie tickets are available for 3 members so, these three are allocated to particular persons using threads. If 3 tickets are available for 4 members so movie tickets are not allocated to anyone.

For Customer class



Create an object for MovieTickets class with pass the argument

Instance Variables:

thread1 : Thread

thread2 : Thread

thread3 : Thread

Methods:

movieExecute() : void

create an object for each Instance variable with new keyword and store the MovieTickets Object by using Thread(Runnable). 

we need to setNname() for each Thread variable

Then start all the Threads from this variable



For Test class

Test class having main method and create a method for Customer class

Use this class to test your solution's classes and methods.


*/