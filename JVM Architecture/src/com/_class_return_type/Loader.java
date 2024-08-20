package com._class_return_type;

class Customer{
	
}
class Employee{
	
}
public class Loader {
	public static void main(String[] args) {
		Class cls=Employee.class;
		System.out.println(cls.getName());
		cls=Customer.class; 
		System.out.println(cls.getName());			//for class name
		System.out.println("For knowing class name"+cls.getName());
		System.out.println("for knowing the class loader name  :"+Customer.class.getClassLoader().getName());
	}

}
