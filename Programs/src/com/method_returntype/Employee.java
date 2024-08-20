package com.method_returntype;

import java.util.Scanner;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee(int empId,String empName,double empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public static Employee getData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter emp Id :");
		int id=sc.nextInt();
		System.out.print("Enter emp Name :");
		String name=sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter emp Salary :");
		double salary=sc.nextDouble();
		return new Employee(id,name,salary);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	

}
