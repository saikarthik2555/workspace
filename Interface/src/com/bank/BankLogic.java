package com.bank;

public class BankLogic {
	public static void main(String[] args) {
		Bank union=new Customer();
		union.deposit(1200);
		union.withdraw(1200);
		//should not provide getBalance()
	}

}
interface Bank{
	public abstract void deposit(int amount);
	public abstract void withdraw(int amount);
	
}

class Customer implements Bank{
private double balance=15000;
	@Override
	public void deposit(int amount) {
		if(amount<=0) {
			System.out.println("Cannot deposit");
		}else {
			balance+=amount;
			System.out.println("Successfuly deposited");
		}	
	}

	@Override
	public void withdraw(int amount) {
		if(amount<=0) {
			System.out.println("Cannot withdraw");
		}else{
			balance-=amount;
			System.out.println("Successfuly withdraw");
		}
	}
	
	public double getBalance() {
		return balance;
	}
}