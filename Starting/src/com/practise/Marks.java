package com.practise;

public class Marks {
	private int rollNumber;
	private String name;
	private char grade;
	private int marks;
	public void setStudentData(int rollNumber,String name,int marks) {	//non-static
		this.rollNumber=rollNumber;
		this.name=name;
		this.marks=marks;
		calculateGrade();		//non static
		check();
		
	}
	public void calculateGrade() {
		if(this.marks>=70 && this.marks<100) {
			this.grade='A';
		}
		else if(this.marks>=50 && this.marks<70) {
			this.grade='B';
		}
		else if(this.marks>35 && this.marks<50) {
			this.grade='C';
		}
		else {
			this.grade='D';
		}
	}
	public static void check() {
		System.out.println(" Hello");
	}
	@Override
	public String toString() {
		return "Marks [rollNumber=" + rollNumber + ", name=" + name + ", grade=" + grade + ", marks=" + marks + "]";
	}
	

}
