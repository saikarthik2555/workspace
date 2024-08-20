package com.practise;

abstract class Test
{
	public static void main(String[] args) {
		Audi c=new Audi();
		System.out.println(c.speed);
		c.run();
		c.getDetails();
	}
}