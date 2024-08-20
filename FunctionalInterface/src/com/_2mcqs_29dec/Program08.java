package com._2mcqs_29dec;

interface Samplee {
	int x = 20;
	int m1();
}


public class Program08 {
	public static void main(String[] args) {
		Samplee s = new Samplee() {	
			public int m1() {
				System.out.println(x+10);  		//assigning is not possible but we can increment 
				return x;
			}
		};
		System.out.println(s.m1());
	}
}
