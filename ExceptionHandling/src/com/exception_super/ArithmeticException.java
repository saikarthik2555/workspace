package com.exception_super;

public class ArithmeticException {
	public static void main(String[] args) {
		int x=15;
		int y=0;
		System.out.println("Method execution strats");
		System.out.println(x/y); //error
		System.out.println("Method execution ends");
	}

}
//JVM is having default exception handler which will terminate the program
//at middle
//Exceptions is an run time error  