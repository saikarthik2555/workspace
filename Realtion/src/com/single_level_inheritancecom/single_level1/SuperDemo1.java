package com.single_level_inheritancecom.single_level1;

class Shape
{
	protected int x; //x = 10
	
	public Shape(int x) //x = 10
	{
	  this.x= x;
	  System.out.println("x value is :"+this.x);
	}

	public void getSquareArea() {
		// TODO Auto-generated method stub
		
	}	
}
class Square extends Shape
{
	public Square(int side)  //side = 10
	{
		super(side);
	}
	
	public void getSquareArea()
	{
		System.out.println("Area of Square :"+(super.x*super.x));
	}	
}

public class SuperDemo1 
{
	public static void main(String[] args) 
	{
       Square ss = new Square(10);
       ss.getSquareArea();
       Shape s=new Square(12);
       System.out.println(s.x);
	}

}