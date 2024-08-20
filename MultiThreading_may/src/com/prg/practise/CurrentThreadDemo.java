package com.prg.practise;

public class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		Class c=CurrentThreadDemo.class;
		System.out.println(c.getName());
		System.out.println(t);
	}

}
