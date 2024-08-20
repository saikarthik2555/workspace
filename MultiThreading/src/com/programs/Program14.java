package com.programs;

class Test1 implements Runnable
{
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		thread.stop();
		System.out.println(thread.getState());
	}
}
public class Program14
{
	public static void main(String[] args) {
		Test1 nit = new Test1();
		nit.run();//direct calling
	}
}