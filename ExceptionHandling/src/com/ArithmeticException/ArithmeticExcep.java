package com.ArithmeticException;

public class ArithmeticExcep {
//for Floating point literal java software people provided 
//Final and static variables to deal with Infinite and Undefines
	public static void main(String[] args) {
		System.out.println(10/0.0);	//Infinite
		System.out.println(-10/0.0);	//-Infinite
		System.out.println(0/0.0);	//NaN
		System.out.println(0.4/0); 	//halt the execution
		System.out.println(10.0/0.0);
		//System.out.println(0/0);
		System.out.println("Main ended");
		System.out.println(10/0.0);
	}

}
