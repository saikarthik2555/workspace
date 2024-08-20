package com.practise;

class Customer extends Object{
	public Customer() {
		System.out.println("check");
	return ;
	}
	private double balance=1000;
	
	public Customer getObject() {
		return new Customer();
	}
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Deposited");
	}
	public void withDraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient Fund");
		}else {
			balance-=amount;
		}
		System.out.println("Withdrawed : Current Balance is : "+balance);
	}

}


public class Bank{
	public static void main(String[] args){
		Customer c=new Customer();
		Customer c1=c.getObject();		
		c.withDraw(5000);
	}
}