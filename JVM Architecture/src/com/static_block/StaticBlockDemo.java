package com.static_block;

class Foo
{	
	Foo()
	{
		System.out.println("No Argument constructor..");
	}

	{
		System.out.println("Instance block..");
	}

	static
	{ 

		 int i=12;
		System.out.println("Static block..."+i);
	}
	static int i;
	
}
public class StaticBlockDemo   
{
	public static void main(String [] args)
	{ 		
		System.out.println(Foo.i);
		System.out.println("Main Method Executed ");	
		
	}
}
