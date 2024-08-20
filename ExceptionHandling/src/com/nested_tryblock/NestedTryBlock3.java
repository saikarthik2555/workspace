package com.nested_tryblock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryBlock3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			try {
				System.out.println(10/0);
				
			}catch(ArithmeticException e) {
				System.out.println("Number cant be divide by zero ");
			}
			try {
				int insert =sc.nextInt();
			}catch(NumberFormatException e) {
				System.out.println(e);
			}
			try {
				String num="45df";
				int result=Integer.parseInt(num);
				System.out.println(result);
			}catch(InputMismatchException e) {
				System.out.println("Provide only numbers");
			}
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
	}

}
