package com.prg.practise;

public class Sleep {
	public static void main(String[] args) {
		Check c=new Check();
		c.start();
		System.out.println("main block ended"+Thread.currentThread());
	}
}

class Check extends Thread{
	@Override
	public void run() {
		
		try {
			for(int i=0;i<=10;++i) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch(Exception e) {
			System.out.println("catch block "+e);
		}
	}
}