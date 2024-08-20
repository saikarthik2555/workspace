package com.super_call_constructor;

public class Calling_this_parameter {
	public static void main(String[] args) {
		Sub s=new Sub();
	}

}

class Super{
	public Super() {
		this("SFS");  //this(" calling parametrised constructor of its own class");
		System.out.println(" My school");
	}
	
	public Super(String str) {
	System.out.println(str);
	
}
}



class Sub extends Super {
	public Sub() {
		super();
	}
}