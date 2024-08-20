package com.string_methods;

public class CharAtDemo {
	public static void main(String[] args) {
		String str1=new String("Hello World");
		//staring from 0 to n
		char ch1=str1.charAt(6);//W 				charAt(index)
		System.out.println(ch1);
		String str2="Hello Hyderabad";
		char ch2=str2.charAt(9);//e
		System.out.println(ch2);
	}

}
