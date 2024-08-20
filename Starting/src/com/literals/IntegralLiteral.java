package com.literals;

public class IntegralLiteral {
	public static void main(String[] args) {
//by default every number is int type 
//we can assign integral literal to byte when it is in its range....
		byte b=(int)127;  												 //implicitly by JVM
//we can assign integral literal to short when it is in its range...
		short s=(int)32767;												//implicitly by JVM
//we can assign integral literal to long when it is in its range...
		long l=(int)2147483647;											//implicitly by JVM
//BUT when we are assigning long literal to Long we get error
//Because JVM thinks that is int type
		long a=9223372036854775807L;		//remove L 		 //(long max value) but not accepting
//so we should specify that it is long by explicitly using L or l
		long c=9223372036854775807L;  //No error
	}

}
