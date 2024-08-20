package com.wait;

public class MyProject {
	public static void main(String[] args) {
	Bank sbi=new Bank();
	Thread son=new Thread() {
		public void run() {
			sbi.withDraw(10001);  //calling withDraw()
		}
	};
	son.start();//invokes run
	Thread father=new Thread() {
		public void run() {
			sbi.deposit(0);
		}
	};
	father.start();
	}
}
class Bank{
	int initialBal=10000;
	public synchronized void withDraw(int amount)  {
		while(amount>initialBal) {
			try {
				System.out.println("Insufficient Fund ");
			wait();
			}catch(Exception e) {}
		}
		if(initialBal>=amount) {
			initialBal-=amount;
			System.out.println("Withdraw successful and available balance is "+initialBal);
		}
	}
	public synchronized void deposit(int amount) {
		initialBal+=amount;
		System.out.println("Deposit Successful ; Available balance is "+initialBal);
		notify();
	}
}