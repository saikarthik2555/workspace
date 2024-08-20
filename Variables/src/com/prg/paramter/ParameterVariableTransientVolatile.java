package com.prg.paramter;

public  final class ParameterVariableTransientVolatile {
	 transient int x=12;	//tellig to JVM:I dont want to store variable value into file to serialization
	 volatile int z=12;		//Dont change variable value by multiple thread.change one by one : synchronized
	
	 static int y;
	public static void main(String[] args) {
	//	int y ;				//Illegal modifier for parameter y; local variable and parameter are same
							//Only final for parameter/ local variable
			System.out.println(y);
			final int g;
			g=12;
			System.out.println(g);
		}
	
	
	public static void get() {
//		static int s;
		
	}
}
