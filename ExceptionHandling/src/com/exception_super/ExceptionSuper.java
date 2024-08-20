package com.exception_super;

public class ExceptionSuper {
	public static void main(String[] args) {
		Exception e=new ArrayIndexOutOfBoundsException("Divided by zero");
		System.out.println(e);
		//Exception e1=new NumberMismatchException();
		//System.out.println(e1);
		Exception e2=new NullPointerException("Not refered with any method");
		System.out.println(e2);
		Exception e3=new ArrayStoreException();
		System.out.println(e3);
		Exception e4=new NumberFormatException();
		System.out.println(e4);
		//Exception e5=new ArithmeticException("sjhd");
		//System.out.println(e5);
	}

}
