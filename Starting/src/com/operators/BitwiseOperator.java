package com.operators;

public class BitwiseOperator {
	public static void main(String[] args) {
		//works with bits
		int a=5;
		int b=7;
		System.out.println(a&b);		//a=5==0101
										//b=7==0111
										//==== 0101-->5
		int c=5;
		int d=7;
		System.out.println(c|d);		//0101
										//0111
										//0111
		int e=5;
		int f=7;
		System.out.println(e^f);		//0101
										//0111
										//0010
		System.out.println(~b);  //doubt
			}
}
