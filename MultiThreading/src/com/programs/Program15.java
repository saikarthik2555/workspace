package com.programs;

class Tes implements Runnable
{
	public void run() {
		Thread thread = Thread.currentThread();
		Thread nit = thread.currentThread();  //allowed --> thread.currentThread();
		System.out.println(nit.getName());		
	}
}
public class Program15
{
	public static void main(String[] args) {
		Tes nit = new Tes();
		Thread thread = new Thread(nit);
		thread.start();
	}
}