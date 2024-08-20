package com._2mcqs_29dec;

@FunctionalInterface
interface NIT
{
	int hashCode();
	String myInterface(String a);
	default void nit() 
	{
		System.out.println("im from interface");
	}
	default int add(int a) 
	{
		return a;
	}
}
public class Program01 implements NIT{   //for default we should implements the inetrface class
	public static void main(String[] args) {
//		NIT str= x -> x+"";
//		System.out.println(str.myInterface("sai karthik"));
		Program01 p=new Program01();
		System.out.println(p.add(23));
		p.nit();
		
		System.out.println(p.myInterface("KarthiK"));
		}
	@Override
	public String myInterface(String a) {
		return a;
	}
}