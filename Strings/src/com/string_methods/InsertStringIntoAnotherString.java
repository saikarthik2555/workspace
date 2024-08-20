package com.string_methods;

public class InsertStringIntoAnotherString {
	public static void main(String[] args) {
		String str1="BajaKarthik";
		String str2="Sai";
		String completestr=str1.substring(0, 4)+str2+str1.substring(4);
		System.out.println(completestr);
		withoutPredefinedMethods(str1,str2,3);
	}
	public static void withoutPredefinedMethods(String str1,String str2,int index) {
		String str3=new String();
		for(int i=0;i<str1.length();++i) {
			str3+=str1.charAt(i);
			if(i==index) {
				str3+=str2;
			}
		}
		System.out.println(str3);
	}
}
