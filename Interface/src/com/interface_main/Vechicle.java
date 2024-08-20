package com.interface_main;

public interface Vechicle {
	int SPEED=120;							//final variable
	public abstract void start();		//abstract method
	public abstract void stop();			//abstract method
	default void horn() {					//default method when needed
		System.out.println("digital meter");
	}
	static void message() {						//static method accessible through ELC
		System.out.println("Hava a nice day");
	}
	static int kilometers(int distance,int time) {
		return distance*time;
	}

}
class Car implements Vechicle{
	@Override
	public void start() {
		System.out.println("Car started ");
	}
	@Override
	public void stop() {
		System.out.println("Car stoped ");
	}
	@Override
	public void horn() {
		System.out.println("Having Digital Meter");
	}
}

class Cycle implements Vechicle {
@Override
public void start() {
	// TODO Auto-generated method stub
	System.out.println(" Cycle started");
	
}

@Override
public void stop() {
	// TODO Auto-generated method stub
	System.out.println("Cycle stoped ");
	
}
}


