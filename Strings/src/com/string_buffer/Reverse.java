package com.string_buffer;

public class Reverse {
	public static void main(String[] args) {
		//public AbstractStringBuffer reverse();
		StringBuilder sb=new StringBuilder("Hello Today is 26th january");
		System.out.println(sb.reverse());
		
		StringBuffer sb1=new StringBuffer("Hello");
		sb1.reverse();
		System.out.println(sb1);  

		StringBuilder sb2=new StringBuilder("Java");
		sb2.reverse();
		System.out.println(sb2);  

	}

}
