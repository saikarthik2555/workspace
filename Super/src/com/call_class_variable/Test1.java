package com.call_class_variable;

public class Test1 {
	static int x;
	int y;
	String s;
	char c;
	boolean b;
	
	public Test1(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+""+y);
		
	}
	public static void main(String[] args) {
		Test1 t=new Test1(2, 3);
		//super();
		System.out.println(t.x+""+t.y+""+t.s+""+t.c+""+t.b);
	
	}

}
