package com.test;

public class Sample {
	public static void main(String[] args) {
		Parent p=new Child();
	}
}
class Parent{
	private void method1() {
		System.out.println("rom Parent");
	}
}
class Child extends Parent{
	public void method1() {
		System.out.println("rom Child");
		
	}
}