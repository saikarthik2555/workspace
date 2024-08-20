package com.overriding;

class Superr
{
	public  void m1()
	{
		System.out.println("Super class m1 method...");		
	}
}
class Subb extends Superr
{	
	
	public final void m1()			//can declare sub class method as FINAl
	{
		System.out.println("Sub class m1 method...");		
		
	}
}

public class FinalMethod
{
	public static void main(String[] args) 
	{
		Superr s1 = new Subb();
		s1.m1();

	}

}