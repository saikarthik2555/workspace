package com.mcqs;

/*
interface Add
{
	int add(int b);
}
public class FunctionalInterface {
	
	public static void main(String[] args)
	{
		int a = 10;
		
		Add add = (int b) -> b;
		System.out.println(add.add(a));
	}
}
*/

interface Addd
{
	public abstract void add();  //abstract methods,default,static 
}
//
//class B implements Addd{    			  class B implemnets Addd{
//	@Override						@Override
//	public int add(int b) {   [1]	public void add(){
//		return b;   [2]						System.out.println("gjj");
//	}								}
//}

public class Program02{
	public static void main(String[] args) {
//		Addd a=new B();
//		System.out.println(a.add(12));   [3]   
		Addd a= () -> System.out.println(" No argument Method calling");
		a.add();
		
	}
}














