package com.strings;

public class StringGC {
	public static void main(String[] args) {
		String str1="hyderabad";
		String str2="hyderabad";
		System.out.println(str1==str2); //internally by intern process
		
////		String str1=new String("garbage collector");
////		String str2=new String("garbage collector");
////		System.out.println(str1.hashCode()+" : "+str2.hashCode());
////		System.out.println(str1==str2);
////		str2=str2.intern();
////		System.out.println(str1==str2);
//		
//		String str="india";
//		System.out.println(str +" : "+str.hashCode());
//		
//		System.out.println(str);
//		System.gc();
////garbage collector  work is to find the object that doesnt having any referenes in HEAP AREA
////in String gc cannot remove the String having no references in SCP.
//		String str1="india";
//		str=null;
//		System.out.println(str1+" : "+str1.hashCode());
//		System.out.println(str);
//		System.out.println(str +" : "+str.hashCode());//NullPointerexception
	}
}
