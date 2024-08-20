package com.mcqs;

public class Test8 {
	public static void main(String[] args) {
		An a=new Bn();
		a.foo();
	}

}
class An 
{
static void foo()                      //for static method cant create object
{									//static method has no relation 
System.out.println("A");				//method hiding
}
}

class Bn extends An
{
static void foo()
{
System.out.println("B");
}
}