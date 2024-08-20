package com.annonymous;

abstract class Shape 
{
	abstract void draw();    //common method
	public void setData() {
		
	}
}

class Rectangle extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Rectangle!!");
	}
}

class Square extends Shape
{
	@Override
	public void draw()
	{
		System.out.println("Drawing Square!!");
	}
}

public class ShapeDemo
{
	public static void main(String[] args) 
	{
		Shape s1;

		s1 = new Rectangle(); s1.draw();
		s1 = new Square(); s1.draw();
	}
}
