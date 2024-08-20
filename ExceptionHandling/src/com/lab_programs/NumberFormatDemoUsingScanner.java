package com.lab_programs;

import java.util.Scanner;

public class NumberFormatDemoUsingScanner {
	public static void main(String[] args) {
//		System.out.println(args[0]);//
//		int result=Integer.parseInt(args[0]);
////		System.out.println(result);
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the number :");
		String num=sc.next();
		int result=Integer.parseInt(num);
		System.out.println(result);
	}
	catch(NumberFormatException e) {
		System.out.println("Enter only integers");
	}
	}

}
