package com.setA;

import java.util.Scanner;

public class NullPointerExceptionDemo {
	int a;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			NullPointerExceptionDemo t=new NullPointerExceptionDemo();
			t=null;
			System.out.println(t.a);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
