package com._abstract_array;

abstract class Animal{
	protected int x;		//instance variable default value
	
	public Animal() {
		super();
	}
	public abstract void checkUp();
}
class Cat extends Animal{
	public Cat() {
		super();
	}
	
	@Override
	public void checkUp() {
		System.out.println("Cat checkup");
	}
	
	public void getData() {
		System.out.println(x*x);
	}
	
}
class Dog extends Animal{
	@Override
	public void checkUp() {
		System.out.println("Dog checkup");
	}
}
class Lion extends Animal{
	@Override
	public void checkUp() {
		System.out.println("Lion checkup");
	}
}
public class ArrayDemo {
public void  checkAnimal(Animal [] animals){  //[2]reaching the array elements
	for(Animal animal:animals) {			  //for each loop			retriving Objs using for Each loop
		animal.checkUp();
	}
}
	public static void main(String []args) {
		ArrayDemo a=new ArrayDemo();
		Cat []cats= {new Cat(),new Cat(),new Cat()};  		//array 2nd approach
		Dog[] dogs= {new Dog(),new Dog(),new Dog()	};
		Lion []lions= {new Lion(),new Lion(),new Lion()};
		a.checkAnimal(cats);  //  [1]passing array elements to that method so same type
		a.checkAnimal(dogs);
		a.checkAnimal(lions);
		Animal b=new Cat();
		System.out.println(b.x);
		System.out.println(b.x);
		
		b.checkUp();
		Cat c=new Cat();
		c.getData();
//		new Cat().checkUp();
//		Cat c=new Cat();
//		c.checkUp();	
	}	
}