package com.practise;


public class StaticVariable 
{
	public StaticVariable() {
		System.out.println("Im from constrictor");
	}	
   // static int x = 100;
	
    static {
    	//static block
    	System.out.println("Hi Welcome");
    }
    
    {
    	//instance block/non static block
    	System.out.println(" times");
    }
    
	public static void main(String[] args) 
	{
		StaticVariable d1 = new StaticVariable();
		StaticVariable d2 = new StaticVariable();
		
//		++d1.x;  //++d2.x;	//101 //102 
//		
//		System.out.println(d1.x);	//102
//		System.out.println(d2.x);	//102
	}
}