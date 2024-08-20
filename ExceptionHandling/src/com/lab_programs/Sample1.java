package com.lab_programs;

public class Sample1 {
	public void m2() throws ArithmeticException{
		System.out.println(10/0);	//unchecked so no need to handle
	}
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		s1.m2();
	}

}
