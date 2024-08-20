package com.interface_demo;

public interface Calculator {
	public abstract void sum(int x,int y);         //public abstract void sum 
	void sub(int x,int y);                         //methods
	void mul(int x,int y);
 default  void getData() { 			//methods-->static and default
		
	}
}

class Developer implements Calculator{
	@Override
	public void sum(int x,int y) {
		System.out.println("Sum is "+(x+y));
	}
	@Override
	public void sub(int x,int y) {
		System.out.println("Sub is "+(x-y));
	}
	@Override
	public void mul(int x,int y) {
		System.out.println("Mul is "+x*y);
	}
}
