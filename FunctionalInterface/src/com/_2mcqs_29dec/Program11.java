package com._2mcqs_29dec;

interface Sampleee {
	int x = 20;
	void add(int x, int y);
}

class Examplee {
	Sampleee s;

	public Examplee(Sampleee s) {
		super();
		this.s = s;
	}
	
}

public class Program11 {
	public static void main(String[] args) {
		Sampleee s = (x,y)->System.out.println(x+y);
		Examplee e = new Examplee(s);
		//e.s = null;  		//by this we are getting null pointer exception
		System.out.println(s.x);
		e.s.add(10,20);
	}
}
