package com._2mcqs_29dec;

interface Sam {
	int x = 20;
	void m1();
}

class Exa implements Sam {
	public void m1() {
		System.out.println("Overriden method");
	}

	void m2() {
		System.out.println("m2 executed");
	}
}

public class Program10 {
	public static void main(String[] args) {
		Exa e = new Exa() {
			void m2() {
				m1();
			}
		};
		e.m2();
	}
}