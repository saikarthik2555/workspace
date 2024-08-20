package com.relationships;

public class Pemp extends Temp{
	private String department;
	private String designation;
	public Pemp(int empId,String empName,String empAddress,String department,String designation) {
		super(empId,empName,empAddress);
		this.department=department;
		this.designation=designation;
	}
	@Override
	public String toString() {
	//setEmpId(56);			--> allowed
		//System.out.println(getEmpId());		--> allowed
		return super.toString()+"Pemp [department=" + department + ", designation=" + designation + "]";
	}
	

}
