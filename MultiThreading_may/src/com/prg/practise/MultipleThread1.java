package com.prg.practise;

public class MultipleThread1 {
	public static void main(String[] args) {
		Test1 t1=new Test1();
		Test1 t2=new Test1();
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName());
	//	t2.start();
	}
}
class Test1 extends Thread{
	@Override
	public void run() {
		String name= Thread.currentThread().getName();
		System.out.println(name);
	}
}