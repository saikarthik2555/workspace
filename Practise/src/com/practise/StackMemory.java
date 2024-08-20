package com.practise;

public class StackMemory {
	public static void main(String[] args) {
		System.out.println("Main started");		//main thread
		m1();
		System.out.println("main ended");
	}
	public static void m1() {
		System.out.println("m1 started");
		m2();
		System.out.println("m1 ended");
	}
	public static void m2() {
		System.out.println("m2 started");
		System.out.println("m2 ended");
	}
}
