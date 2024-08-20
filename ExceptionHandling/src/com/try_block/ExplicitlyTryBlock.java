package com.try_block;

public class ExplicitlyTryBlock {
	public static void main(String[] args) {
		System.out.println("main Started");
		try {
			throw new ArithmeticException("For user friedly");
			//throw new ArithmeticException();	//without String
			//it support with String and without String
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
