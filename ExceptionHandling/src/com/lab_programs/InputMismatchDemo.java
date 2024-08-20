package com.lab_programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a numbeer :");
			int num=sc.nextInt();
			
		}
		catch(InputMismatchException e) {
			System.out.println(e+"Insert only integrs");
			
		}
	}

}
