package com.has_a;

public class HasA {
	public static void main(String[] args) {
		Institute naresh=new Institute(1728, "NIT");		//
		Student st1=new Student(12, "Karthik",naresh);
		System.out.println(st1);
		Student st2=new Student(14, "Smith",naresh);
		System.out.println(st2);
		//st1.rollNo=st2.rollNo;
	}

}
