package com.literals;

public class SmallerToBiggerType {
	public static void main(String[] args) {
		byte b=127;
		short s=b;
//No error
		short a=126;
		// byte c=a; //error
		byte c=(byte)a;
		final int x = 127;  //<---------  DEVUDA  <----------  DEVUDA   <---------
		byte bb = x;
		System.out.println(bb);
		final int d=32767;					//final for variables is similar to type casting Only if 
		short q=d;							//it is its range
	}

}
