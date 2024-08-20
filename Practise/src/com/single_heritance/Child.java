package com.single_heritance;

public class Child extends Parent{
	public Child() {
		super();
	}
	
	public void say() {
		Child c=new Child();
		System.out.println(super.getClass());
		System.out.println("Im from sub class");
	}
}
