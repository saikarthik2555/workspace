package com.mcqs;

interface Add
{
	//public abstract int add(int b);
	public abstract int add(int a,int b);
}
public class Program01 {
	public static void main(String[] args) {

//		Add ab= (int d) -> d;
//		System.out.println(ab.add(12));
//		
		
		Add ab=(int e,int f) -> e+f; 
		System.out.println(ab.add(12,34));
	
	}

}
