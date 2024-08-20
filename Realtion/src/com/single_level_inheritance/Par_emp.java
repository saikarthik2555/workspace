package com.single_level_inheritance;

public class Par_emp extends Tem_emp{
	private int empDepartment;
	private String designation;
	
	public Par_emp(int empId,String empName,String empAddress,int  empDepartment,String designation) {
		super(empId,empName,empAddress);
		this.empDepartment=empDepartment;
		this.designation=designation;
	}
	public void getData() {
	System.out.println(getEmpId());
	System.out.println(getEmpName());
	System.out.println(getEmpAddress());
	}

	@Override
	public String toString() {
		return super.toString()+"Par_emp [empDepartment=" + empDepartment + ", designation=" + designation + "]";
	}
	

}
