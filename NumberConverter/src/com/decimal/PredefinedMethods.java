package com.decimal;

public class PredefinedMethods {
	public static void main(String[] args) {
		//Decimal to Any radix
		Integer num=98765;
		//Long binary=(long)Integer.parseInt(Integer.toBinaryString(num));
		Integer octal=Integer.parseInt(Integer.toOctalString(num));
		String hex=Integer.toHexString(num);
		
	//	System.out.println("Binary : "+binary);
		System.out.println("Octal : "+octal);
		System.out.println("Hexa  as String beacuse it contains Alphabets : "+hex);
	}

}
