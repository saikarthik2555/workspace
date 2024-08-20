package com._2mcqs_29dec;

interface Sample {
	int x = 20;
	void m1();
}

class Example {
	Sample s;

	public Example(Sample s) {
		super();
		this.s = s;
	}
	
}

public class Program07 {
	public static void main(String[] args) {
		Sample s = () -> System.out.println(Sample.x);
		Example e = new Example(s);
		e.s = null;  			//variables are assigned with null	
		System.out.println(e.s.x);	//calling final variable
		s.m1();		//as we know methods cannot make null
	}
}