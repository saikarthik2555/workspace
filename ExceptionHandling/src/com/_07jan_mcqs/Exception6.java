package com._07jan_mcqs;

public class Exception6 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0.0);		//Infinity
			System.out.println(10/0);		//Halt
		}catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}finally {
			System.out.println("ended");
		}
	}

}
