package com.super_call_constructor;

class Base
{
	public Base()
	{
		super();
		System.out.println("Base class No Argument constructor");
	}
}
class Derived extends Base
{
	public Derived()
	{
		super();
		System.out.println("Derived class No Argument constructor");
	}
}

public class CallingSuperClassNoArgument 
{
	public static void main(String[] args) 
	{
		Derived d1 = new Derived();
		
	}
}