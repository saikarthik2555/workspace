package com.lab_programs;

public class Handling {
	public static void nit(int a) {
		try {
			System.out.println("Naresh ");
			nit1(a);
			System.out.println("I");
		}catch(Exception e) {
			System.out.println("");
		}
	}
	public static void nit1(int a) {
		try {
			int result=25/a;
			System.out.println("Completed ");
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero ");
		System.out.println(e);
		}
	}

}
