package com._07jan_mcqs;

class Demo
{
	static String str = "9223372036854775807";
}
public class Exception1 
{
	public static void main(String[] args) //throws Exception
	{
		System.out.println(Demo.str.length());
		//System.out.println(Long.MAX_VALUE);
		try {
			throw new ArithmeticException();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
