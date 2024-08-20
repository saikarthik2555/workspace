package com.extends_inteface;

public interface A {
	public void m1();
	default void m4() {
		System.out.println("Default method");
	}

}
