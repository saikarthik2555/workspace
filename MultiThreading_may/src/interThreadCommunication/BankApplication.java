package interThreadCommunication;

public class BankApplication {
	public static void main(String[] args) {
		Bank b=new Bank();							//has one lock
		Thread son=new Thread() {
			@Override
			public void run() {
				try {
					b.withdraw(15000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread father =new Thread() {
			@Override
			public void run() {
				b.deposit(10000);
			}
		};
		son.start();
		father.start();
		
	}
}
class Bank extends Thread{
	int balance=10000;
	public synchronized void withdraw(int amt) throws InterruptedException{	
		//without synchronized we get IllegalMonitorStateException
		if(balance<amt) {
			System.out.println("Insufficient Balance , waiting for deposit()"+this);
			wait();			//releases lock and goes to waiting state
		}
		System.out.println("Money Deposited Now you can withdraw");
	}
	public synchronized void deposit(int amt) {
		System.out.println("amt deposited");
		balance=balance+amt;
		notify();
	}
}