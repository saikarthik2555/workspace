package com.practise;

public class StaticBlockDemo
{	
	StaticBlockDemo()
	{
		System.out.println("No Argument constructor..");
	}

	{
		System.out.println("Instance block..");
	}

	static
	{
		System.out.println("Static block...");
	}

	public static void main(String [] args)
	{ 		
		System.out.println("Main Method Executed ");	
		
	}
}