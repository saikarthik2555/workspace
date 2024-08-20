package com._interface_multiple_inheritance;

public class C implements A,B{
	public C() {
		super();
	}
	
	@Override
	public void m1() {
		System.out.println(" method from Sub class");
	}

}
