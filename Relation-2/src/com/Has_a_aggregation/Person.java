package com.Has_a_aggregation;

public class Person {
	private String personName;
	private Aadhar aadhar;
	public Person(String personName, Aadhar aadhar) {
		super();
		this.personName = personName;
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", aadhar=" + aadhar + "]";
	}
	

}
