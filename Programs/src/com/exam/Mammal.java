package com.exam;

public class Mammal extends Animal{
	
	
	@Override
	public void makeSound() {
		System.out.println("Mammal Sound Rour");
	}
	
	@Override
	public void printInfo(Mammal m) {
		System.out.println("Additional Information about Mammal");
	}

}
