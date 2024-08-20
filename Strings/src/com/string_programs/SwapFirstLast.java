package com.string_programs;

import java.util.Arrays;

public class SwapFirstLast {
	public static void main(String[] args) {
		String name="Today is Friday";
		char ch[]=name.toCharArray();
		System.out.println(ch.length);
		//public String replace(char old,char new);
		//System.out.println(name.replace(ch[name.length()-1], ch[0]));
		char t=ch[0];
		ch[0]=ch[name.length()-1];
		ch[name.length()-1]=t;
		System.out.println(Arrays.toString(ch));
		
	}

}
