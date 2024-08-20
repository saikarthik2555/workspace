package com.mcqs;

public class Test18{
	public static void main(String[] args) {
		P p=new Q();
		S s=(S)p.getObj();
		s.test();
	}
}

abstract class R{	
	public abstract void test();
}

class S extends R{
	@Override
	public void test() {
		System.out.println("From Test");
	}	
}

class P{
	public R getObj(){
		System.out.println("class P returning R");
		return new S();
	}
}
class Q extends P{
	public S getObj(){
		System.out.println("class Q returning S");
		return new S();
	}
}
