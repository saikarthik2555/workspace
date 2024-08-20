package com.has_a;

public class Student {
	private int rollNo;
	private String stuName;
	private Institute insti;						//has-a relation
	public Student(int rollNo,String stuname,Institute insti) {
		this.rollNo=rollNo;
		this.stuName=stuname;
		this.insti=insti;
		//this.insti=new Institute(12, "NIT");		//composition		
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName + ", insti=" + insti + "]";
	}
	

}
