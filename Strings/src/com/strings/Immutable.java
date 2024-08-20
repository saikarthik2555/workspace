package com.strings;

public class Immutable {
	public static void main(String[] args) {
		String str1="india";
		String str2="india";
		String str3="india";
		System.out.println(str1.hashCode()+" "+str2.hashCode()+" "+str3.hashCode());
		str3=str3.toUpperCase();
		System.out.println(str1+" "+str2+" "+str3);
		System.out.println(str1.hashCode()+" "+str2.hashCode()+" "+str3.hashCode());
	}

}
