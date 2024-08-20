package com.program01;

@FunctionalInterface
interface Vehicle{
	public abstract void run();
}
//class Car implements Vehicle{  		//instead of this huge and separate class we are using 
//	@Override						// lambda expressions
//	public void run() {								[1]
//		System.out.println("Car is Running ");		[2]
//	}
//}
//public class Program01{
//	public static void main(String[] args) {
//		Vehicle car=new Car();
//		car.run();										[3]
//	}
//
//}
/*
 * public class VechicleLambda{									//anonymous approach
 * public static void main(String args[]){
 * Vechilce car=new Vechicle(){
 * @Override
 * public void run(){
 * System.out.println("Car is running");
 * 	}
 * };
 * car.run();
 * 
 */



public class VechicleLambda{		
	public static void main(String[] args) {
		Vehicle car= ()-> System.out.println(" Car is running");			//lambda approach
		car.run();
	}
}