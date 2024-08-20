package com.weeklyexm_12feb;

public class Test extends Thread{
	public static void main(String[] args) throws InterruptedException {
		Bank sbi=new Bank();
		Test t=new Test() {
			public void run() {
				sbi.withDraw(15000);
			}
		};
		t.start();
		//t.join();
	
		Test t1=new Test() {
			public void run() {
				sbi.deposit(5000);
			}
		};
		t1.start();
	}

}
