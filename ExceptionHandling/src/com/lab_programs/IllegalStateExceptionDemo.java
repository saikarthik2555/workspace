package com.lab_programs;

public class IllegalStateExceptionDemo {
	static void throwIllegalException( )
	{
		try {
			throw new IllegalStateException("User defines message");
			}
		catch(IllegalStateException a) {
			System.err.println("caught :"+a);
		}
	}
	public static void main(String[] args) {
		
		throwIllegalException();
		
	}

}
