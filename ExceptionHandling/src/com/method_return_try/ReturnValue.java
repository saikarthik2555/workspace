package com.method_return_try;

public class ReturnValue {
	public static void main(String[] args) {
		//System.out.println(10/0);
		System.out.println(methodReturnValue());
	}
public static int methodReturnValue() {
	try {
		System.out.println("Try Block");
		return 10/0;
		
	}catch(ArithmeticException e) {
		System.out.println("cannot enter Zero");
		return 5;
	}
//	finally {
//		System.out.println("From finally");
//		return 10;
//	//	System.out.println("After Finally");	//unreachable
//	}


}
}
