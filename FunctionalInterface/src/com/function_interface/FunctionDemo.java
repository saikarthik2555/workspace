package com.function_interface;


import java.util.Scanner;

public class FunctionDemo{
	public static void main(String[] args) {
		Function<String,Boolean> fn=Str -> Str.length()>=7;
		System.out.println("Enter you name :");
		String name=new Scanner(System.in).nextLine();
		System.out.println(fn.apply(name));
	}
}
