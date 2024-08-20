package com.generic;

import java.util.ArrayList;
import java.util.List;

public class MethodReturnType {
	public static void main(String[] args) {
		List<Dog> l=new ArrayList<>();
		Dog d=new Dog();
		l.addAll(d.getDogList());
		System.out.println(l);
	}

}
class Dog{
	
	public List<Dog> getDogList(){
		ArrayList d=new ArrayList<>();
		d.add(new Dog());
		d.add(new Dog());
		d.add(new Dog());
		d.add(new Cat());
		d.add(new Dog());
		d.add(12);
		d.add(new Cat());
		return d; 
	}
	public String toString() {
		return "Dog";
	}
}
class Cat{
	
}