package com.string_methods;

public class ReverseAString {
	public static void main(String[] args) {
		String str="SAIKARTHIK";
		reverseByEachCharacter(str);
	}
	public static void reverseByLoop(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;--i) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);	
	}
	public static void reverseByEachCharacter(String str) {
		String rev="";char ch;
		for(int i=0;i<str.length();++i) {
			ch=str.charAt(i);
			rev=ch+rev;					//logic
		}
		System.out.println(rev);
	}

}
