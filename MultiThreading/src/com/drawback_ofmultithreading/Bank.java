package com.drawback_ofmultithreading;

public class Bank {
	private int balance=5000;
	private int withdraw;
	public Bank(int withdraw) {
		this.withdraw=withdraw;
	}	
	public static void main(String[] args) throws InterruptedException{
		Bank b=new Bank(5000);
		Runnable r1=()->{
			if(b.balance>=b.withdraw) {
				System.out.println(b.withdraw+"Successfully withdraw");
				b.balance-=b.withdraw;
			}
			else {
				System.err.println("Insuffient amount");
			}
			
		};
		Thread t1=new Thread(r1);
		t1.start();
		//t1.join();   //check here
		Thread t2=new Thread(r1);
		t2.start();
		
		
		
		
	}

}
