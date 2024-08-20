package com.programs;

public class Test76 
{
public static void main(String[] args) 
{
	
		Runnable r = ()-> 
		System.out.println("helo");
		

		
	
	
 new Test76();
 Thread t=new Thread(r);
 t.start();
 
 }
 
 public void run() 
 {
 System.out.println("foo");
 }
}

