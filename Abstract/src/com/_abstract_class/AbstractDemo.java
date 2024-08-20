package com._abstract_class;

abstract class Car{
	int speed;
	static {
		System.out.println("Static block");	 //static block
	}
	{
		System.out.println("Instance block");		//instance block
	}
	public abstract void run();
	public void getDetails() {
		System.out.println("car is invoked ");  
	}
	public Car(int x) {
		this.speed=x;              //initialising instance variables using super keyword 
		System.out.println("No argument of Car");
	}
}

class Audi extends Car{
	@Override
	public void run() {
		System.out.println("Audi is running ");
	}
	public Audi(){
		super(110);      //no arguemt of sub
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		Audi c=new  Audi();		//even if we are not creating object for super class 
								//instance and static blocks are executed
		System.out.println(c.speed);
		c.run();
		c.getDetails();
		
	}

}
