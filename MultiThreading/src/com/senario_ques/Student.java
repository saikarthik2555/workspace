package com.senario_ques;

public class Student {
	private String name;
	private EducationInstitute EduInst;  //Has a relation
	public Student(String name,EducationInstitute EduInst) {
		this.name=name;
		this.EduInst=EduInst;
	}
	
	
	public  void viewCoursesAndfees() {
		//logic-> viewCoursesAndFees(): Displays the available courses and their fees.
	}
	public void offers() {
		//logic-> viewOffers(): Displays the ongoing offers.
	}
	public void enrollnCourse(int courseId) {
		//-> enrollInCourse(int courseId): Enrolls the student in the 
		//specified course using the education institute's enrollment process.
	}
	
	
	
	
	
}
