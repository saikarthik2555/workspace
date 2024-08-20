package com.try_block;

//import java.util.InputMismatchException;

public class ThrowableClass_Methods {
	public static void main(String[] args) {
		try {
			String name="sai karthik";
			int y=Integer.parseInt(name);
			System.out.println(y);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
