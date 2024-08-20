package com.method_reference;

import java.util.function.Predicate;

public class StaticMethodReference{
	
	public static boolean getData() {
		return 7>8;
	}
	public static void main(String[] args) {
		Predicate<String> p=new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return getData();
			}			
		};
		
		//StaticMethodReference::test;	//not working
		
//		System.out.println(p.test("Sunday")); //working
	}
}





//predicate--> public boolean Test(<T>);
