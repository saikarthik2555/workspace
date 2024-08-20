package com.operators;

public class BooleanOperators {
	public static void main(String[] args) {
		int z = 5;
		if(++z > 6 & ++z> 6)
		{
			z++;			
		}
		System.out.println(z);
		int y=5;
		if(++y > 6 | ++y> 6)
		{
			y++;			
		}
		System.out.println(y);
		
	}

}
