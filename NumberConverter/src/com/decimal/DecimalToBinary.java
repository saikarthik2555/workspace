package com.decimal;

public class DecimalToBinary {
	public static void main(String[] args) {
		int num=98765;
		String concat="";
		while(num%2!=0) {
			concat=concat+""+num%2;
			num/=2;	
		}
		System.out.println(concat);
	}

}
