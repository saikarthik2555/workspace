package com.parse_int;

public class CommandLineProgram {
	public static void main(String[] args) {	//java.lang.NumberFormatException  --> if we pass "seven" || 7-3-->"7-3"
		System.out.println("Square :"+Double.parseDouble(args[0])*Double.parseDouble(args[0]));	
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		char ch[]= {'H','E','L','L','O'};
		System.out.println(ch);
		String s="HELLO";
		System.out.println(s);
		System.out.println(Character.SIZE+" BITS");
		long a=9223372036854775807L;		//default it is int so we have specify explicitly L || l
	}	

}
