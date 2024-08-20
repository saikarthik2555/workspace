package com.programs;

public class Program2 extends Thread{
	static String name="Karthik";
	public static void main(String[] args) {
		Program2 p=new Program2();
		p.test(name);
		System.out.println("Sai "+name);
	}
	public void test(String name) {
		String t=Thread.currentThread().getName();
		start();	//Calling
		System.out.println("Method"+t);
	}
	public void run() {
		System.out.println("run");
	}
}
