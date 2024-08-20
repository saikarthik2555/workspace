package com.single_level_inheritancecom.single_level1;

import java.util.Scanner;

class Shapee
{
	protected int x; 
	
	public Shapee(int x) 
	{
	  this.x= x;
	  System.out.println("x value is :"+this.x);
	}	
}

class Circle extends Shapee
{
	protected final double PI = 3.14;
	public Circle(int radius)
	{
		super(radius);
	}
	
	public void getAreaOfCircle()
	{
		double area = PI*x*x;
		System.out.println("Area of Circle is :"+area);
	}
	
}

class Rectangle extends Shapee
{
	protected int breadth;
	public Rectangle(int length, int breadth)
	{
		super(length);
		this.breadth = breadth;
	}
	
	public void getAreaOfRectangle()
	{
		double area = breadth * x;
		System.out.println("Area of Rectangle is :"+area);
	}	
}
public class SuperShape 
{
	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Enter the radius of the Circle :");
		Circle c=new Circle(2);
		c.getAreaOfCircle();
		
		//System.out.print("Enter the length of the Rectangle :");
		int length = 25;
		
		//System.out.print("Enter the breadth of the Rectangle :");
		int breadth = 32;
		
		Rectangle rr = new Rectangle(length, breadth);
		rr.getAreaOfRectangle();
		
		
	}

}