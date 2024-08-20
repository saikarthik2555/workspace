package com.string_methods;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String name="English is mandetory";
		StringTokenizer s=new StringTokenizer(name,"i");
		System.out.println(s.countTokens());
		System.out.println(Byte.MAX_VALUE);
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}

}
