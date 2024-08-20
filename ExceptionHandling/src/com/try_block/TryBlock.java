package com.try_block;

public class TryBlock {
	public static void main(String[] args) {
		Exception e1=new ArithmeticException();		
		//internally happening in catch block
		System.out.println(e1);
		try {
			int arr[]=new int[-2];
//			int x=12;
//			int y=0;
//			System.out.println(x/y);
			//throw new ArithmeticException("x/y");
		}
		catch(Exception e) {
			System.out.println("Method entered");
			System.out.println("toString of Exception "+e);
			System.out.println("Method ended");
		}
	}

}
