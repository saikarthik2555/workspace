package com.weeklyexm_5feb;

public class Main{
	public static void main(String[] args){
		Bank b=new Bank(2000);
		b.start();//invoes run()
		synchronized(b) {//main having lock
			try {
				b.wait();//releasing lock
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(b.initialBal);
		}
		
	}
}
class Bank extends Thread{
	int initialBal=10000;
	int amount;
	public Bank(int amount) {
		this.amount=amount;
	}
	public void run() {
		synchronized(this) {//waiting for lock  //getting lock after compoleting task going back
		initialBal+=amount;
		System.out.println("Amount "+initialBal);
		}
		
	}
}