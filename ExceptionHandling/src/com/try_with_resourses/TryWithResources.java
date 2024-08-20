package com.try_with_resourses;

public class TryWithResources {
	public static void main(String[] args) throws Exception {
	DataBaseResource db=new DataBaseResource();
	FileResource fb=new FileResource();
	try(db;fb){
		System.out.println(10/0);
	}	
	catch(ArithmeticException e) {
		System.out.println("Cannot divide by zero ");
	}
	}

}
