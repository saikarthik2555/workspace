package com.synchronized_prgs;

public class WithoutSyn extends Thread{
	private int number;
	public WithoutSyn(int number) {
		this.number=number;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(number*i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
	}
	public static void main(String[] args) {
		WithoutSyn s=new WithoutSyn(5);
		s.start();
		WithoutSyn s1=new WithoutSyn(7);
		s1.start();
	}

}
