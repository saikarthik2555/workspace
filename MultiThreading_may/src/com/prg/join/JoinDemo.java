package com.prg.join;

public class JoinDemo {
	public static void main(String[] args) {
		Test t1=new Test();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Test t2=new Test();
		Test t3=new Test();
		t2.start(); t3.start();
		System.out.println("main ended");
	}

}
class Test extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;++i) {
			System.out.println(i);	
		}
	}
}