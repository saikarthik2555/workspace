package com.interrupt_method;

//generating Exception

public class OtpCheckInter {
	public static void main(String[] args) {
		Thread t=new Thread(new Interrupted());	//best way to create for Runnable
		t.start();
		try {		//Advantage of Sleep()			
		//otp checking within 1 minutes...if time over then throw message
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			System.out.println();
		}
		t.interrupt();
	}
}
class Interrupted implements Runnable{
	@Override
	public void run() {
		try {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("Thread is running ");
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Thread Interrupted Successfully");
			System.out.println(e.getMessage());	
		}
		finally{
			System.out.println("Resource closed");
		}	
	}
}