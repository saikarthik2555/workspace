package com.rules;

import java.io.IOException;

public class Overring {
	public static void main(String[] args) {
		Sub s=new Sub();
		s.show();
		
	}
//for checked exception not allowed
//for unchecked exception are allowed
}
class Super{
	public void show() {
		System.out.println("Method from Super class");
	}
}
class Sub extends Super {
//	@Override
//	public void show() 		//ERROR --> throws Exception{
//		System.out.println("Method from sub class");
//	}				|
//					|	
//					|
	@Override
	public void show()  throws ArithmeticException{ //unchecked are allowed
		System.out.println("Method from sub class");
	}
}