package com.exam;

public class Bird extends Animal{
	
	@Override
	public void makeSound() {
		System.out.println("Bird Sound Chirp");
	}
	
	@Override
	public void printInfo(Bird b) {
		System.out.println("Bird Additional Information");
	}

}
