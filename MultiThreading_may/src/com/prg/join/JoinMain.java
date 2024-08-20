package com.prg.join;

public class JoinMain {
	public static void main(String[] args) {
		Thread t1=Thread.currentThread();
		for(int i=0;i<5;++i) {
			System.out.println(i);
			try {
			t1.join();
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
