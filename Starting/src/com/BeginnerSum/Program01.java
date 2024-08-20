package com.BeginnerSum;

class Employee{
	 String name="Vijay";				//instance variable 
	public  void  getEmployeeName() {
		System.out.println("Employee name is :"+name);	
	}
}

public class Program01 {
	public static void main(String[] args) {
		Employee emp=new Employee();
		getEmployeeData(emp);			
	}
	public static void getEmployeeData(Employee e) { //I get to know
		e.getEmployeeName();		//we can access non-static from static by Object as parameter
		//Employee.getEmployeeName();	
		//System.out.println(Employee.name);
	}

}
