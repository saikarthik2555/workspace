package com.drawback_ofmultithreading;

//[1]
//Withdraw Successful , Availabe balance is 5000
//Withdraw Successful , Availabe balance is 0
//[2]
//Withdraw Successful , Availabe balance is 0
//Withdraw Successful , Availabe balance is 0
public class Banking {
	private int balance=10000;
	private int withdraw;
	public Banking(int withdraw) {
		this.withdraw=withdraw;
	}
	public static void main(String[] args) {
		Banking b=new Banking(5000);
	Runnable r=()-> {
			if(b.withdraw>b.balance) {
				System.err.println("Sorry Insuffient Fund");
			}
			else {
				b.balance=b.balance-b.withdraw;
				System.out.println("Withdraw Successful"+" , Availabe balance is "+b.balance);
			}
	};
	Thread t=new Thread(r);
	t.start();
	Thread t1=new Thread(r);
	t1.start();
	
	}
}
