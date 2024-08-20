package com.extends_inteface;

public class Demo implements C{
//	@Override
//	public void m4() {
//		System.out.println("Default from Demo class");
//	}

	@Override
	public void m1() {
		Demo d=new Demo();
		System.out.println(d instanceof A);
		System.out.println("m1 method from Demo");
	}
	

	@Override
	public void m2() {
		Demo d=new Demo();
		System.out.println(d instanceof B);
		System.out.println("m2 method from Demo");
		
	}

	@Override
	public void m3() {
		Demo d=new Demo();
		System.out.println(d instanceof C);
		System.out.println("m3 method from Demo");
		
	}
	
}