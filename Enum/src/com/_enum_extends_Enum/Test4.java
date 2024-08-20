package com._enum_extends_Enum;

import java.lang.Enum;
enum Color			//every enum  extends Enum class
{
	RED, BLUE, PINK;
}
class Test4
{
	public static void main(String[] args) 
	{
	Enum c[]=Color.values();
	for(Enum i:c) {
		System.out.println(i);
		//System.out.println(i.ordinal());
	}
	}
}
