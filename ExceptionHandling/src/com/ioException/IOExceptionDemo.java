package com.ioException;

import java.util.Scanner;

public class IOExceptionDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner("Hello world");
		System.out.println(sc.nextLine());
		System.out.println(sc.ioException());
	}
}
