package com.practise;

public class Employee {
	int empId;
	String empName;
	Company cmp;

	public Employee(int empId,String empName,Company cmp) {
		this.empId=empId;
		this.empName=empName;
		this.cmp=cmp;
	}
	public static void main(String[] args) {
		
	Company cmp=new Company("TCS", "gachibowli");
	cmp.setCpyName("wipro");
	cmp.setCpyLoc("nanakramguda");
	Employee e1=new Employee(1, "Smith", cmp);
	Employee e2=new Employee(2, "ford", cmp);
	Employee e3=new Employee(3, "John", cmp);
	
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e3);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", cmp=" + cmp + "]";
	}
	
}

