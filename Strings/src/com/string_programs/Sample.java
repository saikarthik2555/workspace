package com.string_programs;

public class Sample {
	public static void main(String[] args) throws IndexOutOfBoundsException{
		String str="Naresh I technologies";
		new Sample().check(str);
	}
	public void check(String str) throws IndexOutOfBoundsException {
		String str1[]=new String[] {str};
		System.out.println(str.length()+" "+str1[1].length());
	}
}
