package com.private_methods;
@FunctionalInterface
interface SANS{
	public abstract void m1();
	public default void m2() {
		System.out.println(" From default method ");
		m3();
		m4();
	}
	private static void m3() {
		//System.out.println(" Static method ");
		m5();
		//m4();   not accessible non static from static 
	}
	private void m4() {
		System.out.println(" Non static ");
	}
	public static void m5() {
		System.out.println(" Static from Interface");
	}
}
class B implements SANS{
	@Override
	public void m1() {
		System.out.println("Abstract Method");
	}
}

public class PrivateMethod {
	public static void main(String[] args) {
		SANS s=new B();
		SANS.m5();     			//STATIC METHOD	
		s.m1(); 				//Abstract Method
		s.m2(); 				//Default Method===m2()+m3()+m4()
		
	}

}
