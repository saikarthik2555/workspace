package com.prg.instance;

public class ClassLevel {
	static int y;
	int x;
	public static void main(String[] args) {
		System.out.println(y);
		ClassLevel a=new ClassLevel();
		System.out.println(a.x); 
		//class levle variable will get memory when we create obj by using new keyword to that class
		//JVM automatically executes variables at class level
	}
	
	public void get() {
		System.out.println(x);
	}
	public static void Set() {
		System.out.println(y);
	}

}
