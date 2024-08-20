package com.lab_programs;

public class StringIndexOutOfBoundsDemo {
	public static void main(String[] args) {
		try {
			String name="StringIndexOutOfBounds";
			System.out.println(name.length());
			System.out.println(name.charAt(22));		//Error
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e+"Cannot print the index element");
		}
	}

}
