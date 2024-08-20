package com.prg.reference;

public class ReferenceType {
	public static void main(String[] args) {
		Parent p=(Parent)new Child();
		Child c=(Child) new Parent();
		
		Parent p1=new Child();
		Child c1=(Child)p1;		
	}

}
class Parent{
	
}
class Child extends Parent{
	
}