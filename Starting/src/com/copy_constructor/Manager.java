package com.copy_constructor;

public class Manager {
	private int mngId;
	private String mngName;
	public Manager(Employee emp) {
		this.mngId=emp.getEmpId();	//getter because we cannot access data members directly
		this.mngName=emp.getEmpName();	//we can accessible through methods-->getter and setter...
	}
	@Override
	public String toString() {
		return "Manager [mngId=" + mngId + ", mngName=" + mngName + "]";
	}
	
}
