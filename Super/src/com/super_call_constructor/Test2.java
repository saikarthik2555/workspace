package com.super_call_constructor;

public class Test2 {
	public static void main(String[] args) {
		Child c=new Child();
	}
}

class Parent{
	private int x;
	private String y;
	public Parent(int x,String y) {
		this.x=x;
		this.y=y;
		System.out.println("From parent class");
		System.out.println(x+""+y);
	}
}

class Child extends Parent{
public Child() {
	super(23,"sai");
	System.out.println("parametrised constructor");
	}
}