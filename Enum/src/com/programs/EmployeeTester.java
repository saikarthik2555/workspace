package com.programs;

public class EmployeeTester {
	public static void main(String[] args) {
		Employee m=new Manager("Smith", 234, 25000, ManagerType.HR);
		System.out.println(m);
		Employee c=new Clerk("Ford", 112, 15000, 72, 81);
		System.out.println(c);
	}

}
