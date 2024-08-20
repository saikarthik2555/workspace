package com.weeklyexm_12feb;

public class Bank{
	private int initialBal=10000;
	public Bank() {
	}
	public synchronized void withDraw(int amount) {
		if(amount>initialBal) {
			System.err.println("Insuficient Fund , Deposit the Amount to withdraw");
			try {
				wait();		//waiting for notify()
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			initialBal-=amount;
			System.out.println("Withdraw Successful and available Balance is "+initialBal);
		}
	}
	public synchronized void deposit(int amount) {
		if(amount>=initialBal) {
			System.out.println("Cannot be Deposited");
		}else {
			initialBal+=amount;
			System.out.println("Amount Successfully Deposited "+initialBal);
			notify();		//sending message
		}
	}
	

}
