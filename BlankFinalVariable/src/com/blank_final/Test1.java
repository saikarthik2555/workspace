package com.blank_final;

public class Test1 {
	final int a;
	public Test1() {
		a=12;		
	}
	public Test1(int a) {
		this.a=a;
	}
	public static void main(String[] args) {
		new Test1();
		new Test1(15);
		new Test1();
		
	}

}
