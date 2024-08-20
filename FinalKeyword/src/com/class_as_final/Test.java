package com.class_as_final;

public class Test {
	int c=12;
	int d=13;
	int e=14;
	public void get() {
	c=d=e=12;
	}
	
	
	public static void main(String[] args) {
		int a=19;
		System.out.println(a);  
	//	System.out.println(b);
		Test t=new Test();
		t.get();

		t.g();
	}
	public void g() {
		System.out.println(c+" "+d+" "+e);
	}
}

