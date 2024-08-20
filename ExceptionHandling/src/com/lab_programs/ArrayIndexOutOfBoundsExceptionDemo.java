package com.lab_programs;

public class ArrayIndexOutOfBoundsExceptionDemo {
	public static void main(String[] args) {
		try {
		int arr[]=new int[2];
		System.out.println(arr[3]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
		System.out.println("Cannot print the index your asking ");
	}
	}
}
