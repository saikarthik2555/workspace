package com.class_loader;

public class VerifyErrorDemo {
	public static void main(String[] args) {
		Animal c=new Cat();
		c.eat();
		System.out.println(c instanceof Animal);
	}
}

interface Animal{
	public abstract void eat();
}

class Dog implements Animal{
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
}

class Cat extends Dog{
	@Override
	public void eat() {
		System.out.println("Cat is eating");
	}
}