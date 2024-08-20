package com.mcqs;

public class Test9 {
	public static void main(String[] args) {
		Ai obja;
		Bi objb=new Bi();
		System.out.println(objb.x);  
		objb.foo();
		obja=objb;//upcasting
		obja.foo();
	}

}
class Ai{
	int x=12;
	 void foo() {
		System.out.println("A");
	}
}
class Bi extends Ai{
	int x=100;
	 void foo() {
	System.out.println("B");
	}
}