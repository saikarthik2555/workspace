package com.programs;

public class IntProgram1 
{
	public static void main(String[] args) 
	{
		Runnable r = new Runnable() {
 public void run() {
 System.out.print("Cat");
 }
 };
 
 Thread t = new Thread(r)
 {
// public void run() { 
// System.out.print("Dog");
// }
 };
 t.start(); //priority goes to current thread
		
	}
}
