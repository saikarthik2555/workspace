package com.user_defines_exceptions;

import java.io.*;


import java.util.Scanner;

public class UncheckedException {
public static void main(String[] args)  {
	Scanner sc=new Scanner(System.in);
	try(sc){
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		if(marks>100) {
			throw new GreaterMarksException("Invalid Marks");
		}
		
	}catch(GreaterMarksException e) {
		e.printStackTrace();
	}
}
}
class GreaterMarksException extends Exception{
	public GreaterMarksException() {
		
	}
	public GreaterMarksException(String message) {
		super(message);
	}
}