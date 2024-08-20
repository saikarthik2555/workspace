package com.programs;

class Test2 implements Runnable
{
	public void run()
	{
		for(int i=0; i<2; i++){
		System.out.println(Thread.currentThread().getName()+" ");
	}
	System.out.println();//
		}
		}
public class IntProgram
{
	public static void main(String[] args) 
	{
//		Test2 t = new Test2();
		Thread t=new Thread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t,"J2EE");
		Thread t3 = new Thread(t,"J2ME");
		t1.start();  //Runnable doesnot contain start()
//		t2.start();
//		t3.start();

	}
}