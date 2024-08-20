package com.Has_a_aggregation;

public class Employee {
	private int empId;
	private String empname;
	private Organisation org;
	
	public Employee(int empId,String empName,Organisation org) {
		this.empId=empId;
		this.empname=empName;
		this.org=org;
		}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", org=" + org + "]";
	}
	
	

}
