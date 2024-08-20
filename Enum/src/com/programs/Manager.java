package com.programs;


public class Manager extends Employee {
	private ManagerType type;

	public Manager(String name,int employeeId,double salary,ManagerType type) {
		super(name,employeeId,salary);
		this.type = type;
		setSalary(salary);          //calling method
	}

	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}
	@Override
	public void setSalary(double salary) {
		if(type==ManagerType.HR) {
		super.setSalary(super.getSalary()+10000);
		}
		else if(type==ManagerType.SALES){
			super.setSalary(salary+=5000);
		}
		}

	@Override
	public String toString() {
		return super.toString()+"Manager [type=" + type + "]";
	}

		
	
	}
	