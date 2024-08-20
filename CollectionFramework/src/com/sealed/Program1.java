package com.sealed;

public class Program1 {
	public static void main(String[] args) {
		
	Voting person1=new Person(23, "Smith");
	
	}

}
sealed abstract class Voting{
	int age;
	String name;
	public Voting(int age,String name) {
		this.age=age;
		this.name=name;
	}
}
 non-sealed class Person extends Voting{

	public Person(int age, String name) {
		super(age, name);
		if(age<18) {
			System.out.println("Not Eligible for movie");
		}
		else {
			System.out.println("Eligible for voting");
		}
	}
	
}