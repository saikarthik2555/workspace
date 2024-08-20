package com.record_mcqs;

record Facul(String name,String course) {
	public Facul(String name,String course) {				//1st priority
	
		this.name=name;
		this.course=course;
	}
}

public class Program3 {
	public static void main(String[] args) {
		Facul f=new Facul("First","Second");
		System.out.println(f);
	}
}
