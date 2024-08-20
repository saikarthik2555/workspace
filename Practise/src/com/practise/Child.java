package com.practise;

public class Child extends Parent	  
{
   public Child()
   {
	 super(100,200);
   }

   public void showData()
   {
	   System.out.println("x values is :"+getX());
	   System.out.println("y value is :"+getY());
   }
   
	  
}
