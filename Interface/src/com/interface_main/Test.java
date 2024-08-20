package com.interface_main;

//import com.interface_main.*;		//if in case other package static method should import
public class Test {
	public static void main(String[] args) {
		Vechicle.message();
		System.out.println(Vechicle.kilometers(250, 4));		//static
		Vechicle car=new Car();									//
		car.start();
		//System.out.println("Car is @ :"+Vechicle.SPEED);
		car.stop();
		car.horn();
		Vechicle cycle =new Cycle();
		cycle.start();
		cycle.stop();
		
	}
}
