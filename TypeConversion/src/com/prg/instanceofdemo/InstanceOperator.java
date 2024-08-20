package com.prg.instanceofdemo;

public class InstanceOperator {
	public static void main(String[] args) {
		A a=new B();
		System.out.println(a instanceof B);
		System.out.println(a instanceof Object);
		System.out.println("--------------------------");
		System.out.println(a instanceof C);
		A e=new C();
		System.out.println(e instanceof C );//If the object comming from ref variable is 
		//same or sub class it returns true
		
		
	}
}
class A extends Object{
	
}
class B extends A{
	
}
class C extends B{
	
}
class D{
	
}
