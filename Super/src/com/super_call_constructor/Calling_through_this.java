package com.super_call_constructor;

public class Calling_through_this {
	public static void main(String[] args) {
		new Childd();
	}

}


class Parentt{
	public Parentt() {
		super();
		System.out.println(" No arguement ");
	}
	public Parentt(int x,String y) {
		this();
		System.out.println(" parametrised Constructor");
	}
	
}
class Childd extends Parentt{
	public Childd() {
		super(23,"sai");
	}
}