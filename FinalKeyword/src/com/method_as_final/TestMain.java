package com.method_as_final;

public class TestMain {
	 final int a=12;
//	public TestMain() {
//		a=9;
//	}
	public static void main(String[] args) {
		Test t=new TestImp();
		t.get();
		t.set();
	}
	public void get() {
		System.out.println(a);
	}

}
