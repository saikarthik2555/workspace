package com.senario_ques;

public class Course {
	private int id;
	private String nameOfCourse;
	private double fee;
	public Course(int id,String nameOfCourse,double fee) {
		this.id=id;
		this.nameOfCourse=nameOfCourse;
		this.fee=fee;
	}
	public int getId() {
		return id;
	}
	public String getNameOfCourse() {
		return nameOfCourse;
	}
	public double getFee() {
		return fee;
	}
	
	

}
