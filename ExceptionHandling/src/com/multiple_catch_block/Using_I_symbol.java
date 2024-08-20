package com.multiple_catch_block;

public class Using_I_symbol {
	public static void main(String[] args) {
		try {
			String name=null;
			System.out.println(name.toUpperCase());
			String name1="ravi";
			int i=Integer.parseInt(name1);
		}
		catch(NullPointerException | NumberFormatException e) {
			System.err.println("Wrong input with String");
			e.printStackTrace();
		}
		System.out.println("Main method ended");
	}

}
