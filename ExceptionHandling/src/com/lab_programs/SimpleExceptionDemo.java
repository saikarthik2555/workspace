package com.lab_programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter A and B values :");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Enter numbers are "+a+" "+b);
		}
//use only for If condition //throw new InputMismatchException("Enter only integers :");
		
		//5System.out.println("Enter numbers are "+a+" "+b);
		
		catch(InputMismatchException e) {
			System.err.println("Enter only integers  "+e.getMessage());
				e.printStackTrace();
		}
		
	}

}
