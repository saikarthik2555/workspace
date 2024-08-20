package com.rules;

import java.io.IOException;

public class CheckingCheckedWithOutThrow {
	public static void main(String[] args)  {
		try {
			
		}catch(Exception  e) {		//ClassNotFoundException//error
			
		}
//		try {
//			
//		}catch(ArithmeticException e) {
//			System.out.println("Working for unchecked exception");
//		}
		try {
		
		}catch(Exception e) {	//Exception & throwable are super classes
			System.out.println("Hello");
			System.out.println(e.getMessage());		//for all types of exceptions(checked and unchecked)
			e.printStackTrace();
		}
	}

}
//Error  -->
//This exception is never thrown from the try statement body