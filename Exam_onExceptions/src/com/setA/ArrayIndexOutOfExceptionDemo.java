package com.setA;

public class ArrayIndexOutOfExceptionDemo {
	public static void main(String[] args) {
		try {
		int arr[]=new int[5];
		arr[6]=12;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
