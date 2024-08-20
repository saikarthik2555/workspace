package com.string_programs;

public class Sample01 {
	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
	byte b[]=str.getBytes();
	System.out.println(str.length());
	for(byte be:b) {
		System.out.println(be);
	}
	}

}
