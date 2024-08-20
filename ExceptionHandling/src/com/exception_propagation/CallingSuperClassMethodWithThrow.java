package com.exception_propagation;

public class CallingSuperClassMethodWithThrow {
public static void main(String[] args) {
	
}
}
class Parent{
	public void show() throws Exception{
		System.out.println("super class method");
	}
}
class Child extends Parent{
	public void show() throws Exception{
		super.show();
//		try {
//		super.show();
//		}catch(Exception e) {
//			
//		}
	}
}