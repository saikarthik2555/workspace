package com._InterfaceSample;

public interface Test {
	int SPEED=80;
	public abstract void check();

}

class Start implements Test{
	@Override
	public void check() {
		System.out.println(SPEED);
		System.out.println("method from sub class");
	}
}
