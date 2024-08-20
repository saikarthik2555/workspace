package com.local_var;

public class LocalVar {
	public static void main(String[] args) {
		int x;
		try {
			x=12;
			System.out.println(x);
		}catch(ArithmeticException e) {
			x=12;
			System.out.println("Initilaize local "+x);
		}
	}

}
