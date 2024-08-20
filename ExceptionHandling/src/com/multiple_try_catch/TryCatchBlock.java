package com.multiple_try_catch;

import java.util.InputMismatchException;

public class TryCatchBlock {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Can divide by 0");
		}
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("Define String value");
		}
		try {
			int arr[]= new int[2];
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Insert index of present elements");
		}
		try {
			throw new InputMismatchException();
		}
		catch(InputMismatchException e) {
			System.out.println("Enter elements correspoinding to data type");
		}
	}

}
