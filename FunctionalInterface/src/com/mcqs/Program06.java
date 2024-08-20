package com.mcqs;

@FunctionalInterface
interface NITT
{
	String myInterface(String a); //abstract method
	@Override
	String toString(); //Object class method
	default void waitt() {
		
	}
	default void notifyy() {
		
	}
	
}
