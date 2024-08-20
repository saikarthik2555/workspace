package com.interface_demo;

public class Test {
	public void getData() {
		System.out.println(" Im from instance method");
	}
	
	
public static void main(String[] args) {
	Test t=new Test();
	t.getData();
	
}
}
