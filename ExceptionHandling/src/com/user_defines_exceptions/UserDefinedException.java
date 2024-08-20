package com.user_defines_exceptions;

import java.util.Scanner;

public class UserDefinedException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc) {
			System.out.println("Enter your age");
			int age=sc.nextInt();
			if(age<18) {
				throw new InvalidAgeException("Age is Invalid");
			}
			else {
				System.out.println("Allowed to movie");
			}
		}
			catch(InvalidAgeException e) {
			e.printStackTrace();
		
		}
	}

}
class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		
	}
	public InvalidAgeException(String message) {
		super(message);
	}
}
