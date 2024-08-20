package com.constructors;

public class BytesStringDemo {
	public static void main(String[] args) {
		byte []b= {122,3,4};
		//char c[]=new char[size]; 			//char array creation  
//		for(char ch:c) {
//			System.out.println(ch);
//		}
//		System.out.println(c.length);
		String s=new String(b);
		System.out.println(s.charAt(0));
		String empty="    561234";
		if(empty.trim().length()<7){
			System.out.println("Password must have characters and length should be greater than 7");
		}
		String s1=new String("asdf");
		System.out.println(s1.toString());
		System.out.println(empty.length()==0);
		System.out.println(empty.isBlank());
		System.out.println(empty.trim().isEmpty());
	}
}
