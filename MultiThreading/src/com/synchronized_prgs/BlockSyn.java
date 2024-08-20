package com.synchronized_prgs;

public class BlockSyn {
	public void print() {
		System.out.println("   "+Thread.currentThread().getName());
		System.out.println("hello");
		synchronized(this) {
			for(int i=1;i<10;i++) {
				System.out.println(Thread.currentThread().getName());
			}
		}
	}
	public static void main(String[] args) {
		BlockSyn s=new BlockSyn();  		//lock
		Runnable r=()->{
			s.print();
		};
		Thread t=new Thread(r);
		t.start();
		Thread t1=new Thread(r);
		t1.start();
		
	}

}
