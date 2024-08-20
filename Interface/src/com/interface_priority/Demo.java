package com.interface_priority;


interface Vechicle{
	public abstract void start();
	public abstract void stop();
	default void horn(){
		System.out.println("Pepp peepp");
	}
}
class Auto implements Vechicle{
	@Override 
	public void start() {
		System.out.println("Auto Started");
	}
	@Override
	public void stop() {
		System.out.println("Auto Stoped");
	}
	@Override
	public void horn() {
		System.out.println("Sidee Sideuu");
	}
}
class Aeroplane implements Vechicle{
	@Override 
	public void start() {
		System.out.println("Aeroplane Started");
	}
	@Override
	public void stop() {
		System.out.println("Aeroplane Stoped");
	}
	@Override
	public void horn() {
		System.out.println("Excuseme Excuseme");
	}
}
public class Demo {
	public static void main(String[] args) {
		Vechicle a=new Auto();
		a.start();
		a.stop();
		a.horn();
	}

}

