package com.exam_mcqs;

import java.util.Scanner;

public class Vowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().toLowerCase().charAt(0);
		try
		{
			if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
			{
			throw new InvalidCharacterExceptionDemo("InvalidCharacerException. not a vowel.");
			}
			else
			{
				System.out.println("Your input character is Vowel: "+ch);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		System.err.println(e.getMessage());
		}	
	}
}
