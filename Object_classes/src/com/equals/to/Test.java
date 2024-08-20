package com.equals.to;

public class Test {
	public static void main(String[] args) {
		Employee emp1=new Employee(123, "sai");
		Employee emp2=new Employee(123,"sai");
		System.out.println(emp1.equals(emp2));
	}
}
class Employee{
	private int empId;
	private String empName;
	
	public Employee(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	public boolean equals(Object obj) {
		System.out.println(this.empId);			//this.empId means current Object
		int empId1=this.empId;
		String empName1=this.empName;
		Employee emp2=(Employee)obj;         //down casting
		int empId2=emp2.empId;
		String empName2=emp2.empName;
		if(empId1==empId2 && empName1.equals(empName2)){
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
}
