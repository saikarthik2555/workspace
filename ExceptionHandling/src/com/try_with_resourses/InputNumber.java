package com.try_with_resourses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc){
			System.out.print("Enter a Number :");
			int a=sc.nextInt();
			System.out.println(a);
		}	
		catch(InputMismatchException e) {
			System.out.println("Cannot enter other than Integer");
		}
		System.out.println("Destination Reached");
	}

}
