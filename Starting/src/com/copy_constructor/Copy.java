package com.copy_constructor;

public class Copy {
	public static void main(String[] args) {
		Employee emp=new Employee(12, "Smith");
		Manager mng=new Manager(emp);
		System.out.println(mng);
	}
	

}
