package com.variables;

public class Variables {
	//instance
	int b=14;					//instance/non-static
	static int a=15;			//static
	public int Sum(int x) {
		System.out.println(b);
		System.out.println(a);
		
		return x;
	}
	
		
	public static void main(String[] args) {
		int a=12;      //local/temporary/stack/automatic variable
		
		System.out.println("static - 15 || local -12 "+a);		//Priority local
																//when static and local variables are same   
		//instance variables cannot be called from static context. So create Object
		Variables v=new Variables();
		System.out.println("instace  "+v.b);
		System.out.println("Parameter"+v.Sum(10));				//parameter 
		
		
	}

}
