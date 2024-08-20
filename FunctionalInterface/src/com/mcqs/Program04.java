package com.mcqs;

@FunctionalInterface
interface Stu{
	public abstract String compareTo(String str);
}
public class Program04 {								//E R R O R
	public static void main(String[] args) {			//D O U B T

//		 Stu s=(String str) -> stu.compareTo("goolge");
//			System.out.println(stu);
		
		Stu s= (String st)-> " "+"result";
		s.compareTo("Karthik");
		}
	}
