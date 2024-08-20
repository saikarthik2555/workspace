package com.mcqs;

public class Test6 {
	public static void main(String[] args) {
		Test10 s=new B();
		s.doSomething();
	}

}
abstract class Test10{
		void doSomething() {       //instance method   
		System.out.println("A");   //access modifier must be equal or greater for sub class
	}
}
class B extends Test10{
	 protected  void doSomething() {       //method overriding
		System.out.println("B");
	}
}