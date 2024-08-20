package com.relationships;

public class Temp {
	private int empId;			//protected is visible to sub classes if extends used 
	private String empName;		//private cannot be visible to sub classes use getter and setter...
	private String empAddress;
	public Temp(int empId, String empName, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	@Override
	public String toString() {
		return "Temp [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
		

}
