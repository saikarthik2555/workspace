package com.generic;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
	
	public static void checkAnimal(List<Animal> animals[]) {
		for(Animal a: (animals)) {
			a.checkUp();
		}
	}
	public static void main(String[] args) {
		ArrayList<Animal> dogs=new ArrayList<Animal>();
		dogs.add(new Animal());
		dogs.add(new Animal());
		Polymorphism.checkAnimal(dogs);
		
	}

}
class Animal{
	public  void checkUp() {
		System.out.println(" im super class");
	}
}
class Dogg extends Animal{
	@Override
	public void checkUp() {
		System.out.println("Dog checkup done");
	}
}
class Catt extends Animal{
	@Override
	public void checkUp() {
System.out.println("Cat Checkup Done");
	}
}