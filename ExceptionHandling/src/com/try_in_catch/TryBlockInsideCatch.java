package com.try_in_catch;

import java.util.InputMismatchException;
import java.util.Scanner;
//THE ERROR MUST BE IN RED-->System.err.println();
//TRY WITH system.out.println();
//Always write error in red
public class TryBlockInsideCatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			try(sc)
			{			
				System.out.print("Enter your Roll number :");
				int roll = sc.nextInt();
				System.out.println("Your Roll is :"+roll);			
			}	
			catch(InputMismatchException e)
			{
				System.err.println("Provide Valid input!!");
				try
				{
//					System.out.println("Enter a number");
//					int a=sc.nextInt();
					System.out.println(10/0);
				}
				catch(ArithmeticException e1)
				{
				  System.err.println("Divide by zero problem");					  
				  try {
					  String name="abc";
					  int result=Integer.parseInt(name);
					  System.out.println(result);
					  
				  }catch(NumberFormatException e2) {
					  System.err.println("Enter in Strings");
					  try
						{
							System.out.println(10/0);
						}
						catch(ArithmeticException e3)
						{
							System.err.println("Cannot divide");
						try {
							int arr[]=new int[3];
							System.out.println(arr[3]);
						}catch(ArrayIndexOutOfBoundsException e4) {
							System.err.println("check Index number");
						}
						}
						}
				  }
				}
				
	}

}
	

