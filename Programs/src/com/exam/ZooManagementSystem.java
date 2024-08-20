package com.exam;

public class ZooManagementSystem{
	public static void main(String[] args) {

		Animal a=new Animal();
		Mammal m=new Mammal();
		Bird b=new Bird();
		m.makeSound();
		b.makeSound();
		a.printInfo(AnimalType.MAMMAL);
		m.printInfo(m);
		a.printInfo(AnimalType.BIRD);
		b.printInfo(b);
		
			
	}

}
