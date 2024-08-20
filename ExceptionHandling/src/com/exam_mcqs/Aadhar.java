package com.exam_mcqs;

import java.util.Scanner;

public class Aadhar {
//Checked Exceptions  --> Either try block or throws
	//We are using Throws for Checked Exception
	public static void main(String[] args) throws InvalidAadharException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Aadhar Number");
//		try(sc) {
//		long aadharNo = sc.nextLong();
//		String digit = ""+aadharNo;
//		try
//		{
//			if(digit.length()!=12) 
//			{
//				throw new InvalidAadharException("Invalid Aadhar Number...");
//			}
//			else 
//			{
//				System.out.println("Your Aadhar Number is "+aadharNo);
//			}
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		}catch(Exception e) {
//			System.out.println(e+"Enter only Integers..");
//		}
		long aadharNo = 1212457892L;
	String digit = ""+aadharNo;

		if(digit.length()!=12) 
		{
			throw new InvalidAadharException("Invalid Aadhar Number...");
		}
		else 
		{
			System.out.println("Your Aadhar Number is "+aadharNo);
		}

	}

}
