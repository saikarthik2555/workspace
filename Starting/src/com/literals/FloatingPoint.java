package com.literals;

public class FloatingPoint {
	public static void main(String[] args) {
		float f=12.5f;
		double a=0x123;
		float b=0b1101;					//pointing cannot perform on binary
		System.out.println(a+" "+b);
		float c=0345;
		System.out.println(c);			//see the difference
		double d=0345.67;
		System.out.println(d);			//if it has point it doesn't perform that number representation
		double e=123.;   			//  <-----
		System.out.println(e);
		double g=0x109;
		//double h=0x109.23;				//pointing cannot perform on hex
		double h=0x109;	
		System.out.println(g+" "+h);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
	}
}
