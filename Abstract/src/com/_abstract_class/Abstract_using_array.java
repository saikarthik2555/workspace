package com._abstract_class;

public class Abstract_using_array {	
	
		public static void main(String[] args) {
			Abstract_using_array ab=new Abstract_using_array();
			Bird []birds= {new Bird(),new Bird(),new Bird()};
			Dog[] dog= {new Dog(),new Dog(),new Dog()};
			Lion[] lions= {new Lion(),new Lion()};
			ab.checkAnimal(birds);
			ab.checkAnimal(dog);
			ab.checkAnimal(lions);
			}
		public void checkAnimal(Animal [] animals) {      //array for showing multiple times
			for(Animal animal:animals) {				 //type animal
				animal.checkup();						//calling method of corresponding type
			}
		}
			}
abstract class Animal{       //abstract class
	public abstract void checkup(); //abstract method
}

class Bird extends Animal{ 
	@Override
	public void checkup() {
		System.out.println("Bird checkup ");
	}
}
class Dog extends Animal{
	@Override
	public void checkup() {
		System.out.println("Dog checkUp");
	}
}
class Lion extends Animal{
	@Override
	public void checkup() {
		System.out.println("Lion checkup");
	}
}

