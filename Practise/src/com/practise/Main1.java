package com.practise;

public class Main1{
	public final static void main(String[] args) {
//		StaticMethod s=new Nonstatic();
//		s.check();
//		s.eat();
//		HashCode h=new HashCode();
//		System.out.println(h.hashCode());
		Main1 m=new Main1();
		System.out.println(m.getClass());	
		System.out.println(m.hashCode());
	}
	
	

}
