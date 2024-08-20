package com.wait;

public class BankWaitDemo {
	public static void main(String[] args) throws InterruptedException {
		Customer c=new Customer();
		//Thread t=new Thread();
		
		Thread son=new Thread() {
			public void run() {
				c.withdraw(12000); //having lock
			}
		};
		
		son.start();
		//son.join();
		Thread father=new Thread() {
			public void run() {
				c.deposit(15000);	
			}	
		};
		father.start();
		father.join();		
		System.out.println(c.balance);		//balance
	}

}
class Customer {
	int balance=10000;
	Thread t=new Thread();
	public synchronized void withdraw(int withdraw) {  //non-static
		System.out.println(t.getPriority());//how???//5  through object we can get that obj method
		while(balance<withdraw) {
			System.out.println("Less balance ; waiting for deposit");
			try {
				System.out.println(Thread.currentThread().getName());//thread-0
//				c.wait();
				wait();		
//how without obj creation 
//because non-static can call non-static
				System.out.println("Am i printing");//No
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		balance-=withdraw;
		System.out.println("Withdraw Successfull");
	}
	public synchronized void deposit(int deposit) {
		System.out.println("Depositing amount"+Thread.currentThread().getName());
		balance+=deposit;
		System.out.println("Successfully Deposited Amount "+balance);
//		c.notify();
		notify();	
////how without obj creation 
//because non-static can call non-static
	}
}