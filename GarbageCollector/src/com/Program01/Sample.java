package com.Program01;

public class Sample
{	
	private Integer i1 = 900;
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();

		Sample s2 = new Sample();

		Sample s3 = modify(s2); 

		s1=null;
        //GC [4 objects 1000x,2000x, 5000x,6000x are elibile 4 GC]
		System.out.println(s2.i1);  		//final ans 9
	}
public static Sample modify(Sample s)
	{
		s.i1=9;
		s = new Sample();
		s.i1= 20;  
        System.out.println(s.i1);
		s=null;
		return s;
	}
}