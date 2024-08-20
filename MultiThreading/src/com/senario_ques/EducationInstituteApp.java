package com.senario_ques;

public class EducationInstituteApp {
	public static void main(String[] args) {

		Course c1[]=new Course[] {new Course(1,"Mathematics", 1000),new Course(2,"Science", 1200), new Course(3,"English", 900)};
		Offer of[]=new Offer[] {new Offer("Special discount: Get 20% off on all courses!"),new Offer("Limited time offer: Enroll in any two courses and get one course free!")};

		EducationInstitute naresh =new EducationInstitute(c1,of);
		
		
//		EducationInstitute naresh=new EducationInstitute(c1,offers);
//		ClassOffer of=new ClassOffer("  Enroll in any two courses and get one course free!!");
	
				}

}
