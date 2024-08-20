package com.prg.annonymous_innerclass;

class Parent {
	public void show() {
		System.out.println("rom parent");
	}
	class Child{
		public void show() {
			System.out.println("rom child");
		}
	}
}
public class InsideAnnonymous {
	public static void main(String[] args) {
		new Parent().new Child().show();
	}
	
	
}