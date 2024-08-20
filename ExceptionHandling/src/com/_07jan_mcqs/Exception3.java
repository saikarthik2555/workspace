package com._07jan_mcqs;

public class Exception3 {
	public static void main(String[] args) {
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot "+e.getMessage());
		}
		catch(NumberFormatException e) {
			System.out.println("Only intergers are allowed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter up to array size");
		}
		finally {
			System.out.println("End of the program");
		}
	}

}
