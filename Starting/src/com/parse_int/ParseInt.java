package com.parse_int;


import java.util.Scanner;

public class ParseInt {
public static void main(String[] a) {
	//System.out.println(a[0]+a[1]);
	//System.out.println(""+12+12);
	System.out.println(Float.parseFloat(""+12)+Float.parseFloat(""+12));
	System.out.println("min"+0x80000000);
	System.out.println("max"+0x7fffffff);
	System.out.println(Integer.parseInt("12")+Integer.parseInt("34"));
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length and breath");		//here user giving as String
	String length=sc.next();
	String breath=sc.next();  //length-->"67.21"   //breath-->"33.45"   so converting to Double
	System.out.println(Double.parseDouble(length)*Double.parseDouble(breath));
	}
}