package com.programs;

public class Program8 extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
	}
	
	public void start() {
		System.out.print(Thread.currentThread().getName()+" ");
	}

	public static void main(String[] args) {
		Program8 nit = new Program8();
		for(int i=0;i<10;i++)
		{
			nit.run();//direct calling
		}
	}
}