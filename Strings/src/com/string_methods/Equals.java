package com.string_methods;

public class Equals {
	public static void main(String[] args) {
		String str1=new String("Hyderabadi Biryani");
		String str2=new String("Hyderabadi Biryani");
		System.out.println(str1.equals(str2));       //content comparsion 
		String str3="Telangana";
		String str4=new String("Telangana");
		System.out.println(str3==str4);				//method reference
		System.out.println(str3.equals(str4));
	}

}
