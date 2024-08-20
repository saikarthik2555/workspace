package com.call_class_variable;

public class Child extends Parent{
	 protected int salary=35000;
	
	public void getData() {
		System.out.println(salary);
		System.out.println(super.salary);
	}

	
	

}
