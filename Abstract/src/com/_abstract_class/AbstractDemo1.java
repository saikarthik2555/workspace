package com._abstract_class;

abstract class GrandFather
{
	public abstract void land();   			 //common methods
	public abstract void house();			//common methods
}
abstract class Father extends GrandFather{   		//abstract extends
	@Override
public void house() {
	System.out.println("father--im  taking house ");
}
}
class Son extends Father{			//here we can conclude that any class can have abstract method
	@Override					   //by extending with super class
	public void land() {
		System.out.println("House and Land belongs to me ");
	}
	@Override
	public void house() {
		System.out.println(" jjww");
	}
}
public class AbstractDemo1{
	public static void main(String[] args) {
		Father f=new Son();
		f.land();
		f.house();
	
	}
}
