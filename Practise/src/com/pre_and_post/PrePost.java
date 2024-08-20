package com.pre_and_post;

public class PrePost {
	public static void main(String[] args) {
		int a=3,b;
		b=a++ * a++ * a++;
		System.out.println(a+" "+b);
		a=3;
		b=++a * ++a * ++a;
		System.out.println(a+" "+b);
		System.out.println(a);
	}

}
