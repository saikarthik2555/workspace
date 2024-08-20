package com.exam;

public class Animal {


	public void makeSound() {
		System.out.println("Generic Animal Sound");
	}
	
	public void printInfo(Mammal m) {

		System.out.println(m+" type");
	}
	
	public void printInfo(Bird b) {
		System.out.println(b+" type");
	}

	public void printInfo(AnimalType mammal) {
		System.out.println(mammal+" type");
		
	}


}
