package com.practise;

public class Employee extends Organisation {
	private int empId;
	private String empName;
	private int empSalary;
	
	public Employee(String orgName,String orgLocation,int empId,String empName,int empSalary)
	{
		super(orgName,orgLocation);
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		
		
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary +"]";
	}
	
	

}
