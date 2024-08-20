package com.sample;

public class MustOverride {
public static void main(String[] args) {
	Child1 c=new Child2();
	c.first();
	c.second();
	}
}

abstract class Parent{
	public abstract void  first();
	public abstract void second();
}

abstract class Child1 extends Parent{

	@Override
	public void first() {
		System.out.println("From Child1 ");
		System.out.println("Only one method so this class also becomes abstract");
	}

}

class Child2 extends Child1{
	
	@Override
	public void second() {
	System.out.println("From  Parent ");
	}
	
}