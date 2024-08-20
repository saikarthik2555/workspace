package com.prg.join;

public class JoinDemo1 {
	public static void main(String[] args) {
		Alpha a=new Alpha();
		a.setName("alpha_thread");
		a.start();
		System.out.println("main ended");
	}
}

class Alpha extends Thread{
	Beta b=new Beta(); 
	@Override
	public void run() {
		b.setName("beta_thread");
		b.start();
		try {
		b.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		for(int i=0;i<20;++i) {
			System.out.println(i+"   "+Thread.currentThread().getName());
		}	
	}
}

class Beta extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;++i) {			
			System.out.println(i+"   "+Thread.currentThread().getName());
		}
	}
}