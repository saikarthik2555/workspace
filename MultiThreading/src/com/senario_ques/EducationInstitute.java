package com.senario_ques;

public class EducationInstitute {
	private Course courses[];
	private Offer  offers[];
	public EducationInstitute(Course[] courses,Offer[] offers){
		this.courses=courses;
		this.offers=offers;
	}
	public Course[] getCourses() {
		//logic
		
		return courses;
	}
	public Offer[] getOffers() {
		//logic
		return offers;
	}
	public void  enrollStudentInCourse(int courseId,String studentName){
		//logic
		System.out.println();
		
	}
	
	

}
