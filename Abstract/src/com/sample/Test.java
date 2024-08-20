package com.sample;

abstract class Shape{
	public Shape(String msg) {
		System.out.println("Constructor invoked by Sub class Super keyword");
	}
	public Shape() {
		
	}
	protected abstract void draw();
}

class Rectangle extends Shape{
	public Rectangle() {
		super("going");
	}

	@Override
	protected void draw() {
		System.out.println("Rectangle shape");
	}
	
}
class Square extends Shape{
	@Override
	public void draw() {
		System.out.println("Square shape");
	}
}

public class Test {
	public static void main(String[] args) {
	//Dynamic Method Dispatch  not possible
//		Shape s;
//		s=new Rectangle();
//		s.draw();				//eligible for GC
//		
//		s=new Square();
//		s.draw();	
		
		Rectangle r=new Rectangle();
				r.draw();
		
				//anonymous obj
//		new Square().draw();
//		new Rectangle().draw();
	}
}
